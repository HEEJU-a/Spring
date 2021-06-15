package com.koreait.spring2;

import com.koreait.spring2.vo.LocationCodeEntity;
import com.koreait.spring2.vo.SearchDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;

@Service
public class ExamService {

    @Autowired
    private ExamMapper mapper;
    public List<LocationCodeEntity> selLocationCodeList(){

        return mapper.selLocationCodeList();
    }
    public void saveData(SearchDTO param){
        final String url = "http://openapi.molit.go.kr/OpenAPI_ToolInstallPackage/service/rest/RTMSOBJSvc/getRTMSDataSvcAptTradeDev";
        final String serviceKey = "Y2UOCkD8Ilv2gViPGV33ddNTTQfRi92i8mRzUeQX%2BNgSiNTO3gp9hJZX4J6u8uXucMM6RdRBoGxMn6XHfsEzNA%3D%3D";
        String decodeServiceKey = null;

        try{
            decodeServiceKey = URLDecoder.decode(serviceKey, "UTF-8");
        }catch(Exception e){
            e.printStackTrace();
        }

        final HttpHeaders HEADERS = new HttpHeaders();
        HEADERS.setAccept(Arrays.asList(MediaType.APPLICATION_XML));

        final HttpEntity<String> entity = new HttpEntity<String>(HEADERS);

        String deal_ym = String.format("%s%02d", param.getDeal_year(), param.getDeal_month());
        UriComponents builder = UriComponentsBuilder.fromHttpUrl(url)
                .queryParam("LAWD_CD", param.getExternal_cd())
                .queryParam("DEAL_YMD", deal_ym)
                .queryParam("serviceKey", decodeServiceKey)
                .build(false);

       // String urlWithParam = url + "?LAWD_CD=" + param.getExternal_cd() + "&DEAL_YMD=" + deal_ym + ..

        RestTemplate rest = new RestTemplate();
        rest.getMessageConverters().add(0, new StringHttpMessageConverter(Charset.forName("UTF-8")));

        ResponseEntity<String> respEntity = rest.exchange(builder.toUriString(), HttpMethod.GET, entity, String.class);
        String result = respEntity.getBody();
        System.out.println(result);
    }
}
