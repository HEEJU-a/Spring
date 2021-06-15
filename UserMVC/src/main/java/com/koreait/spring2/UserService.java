package com.koreait.spring2;

import com.mysql.cj.Session;
import org.apache.ibatis.annotations.Mapper;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

@Service
public class UserService {
    @Autowired
    private UserMapper mapper;

    @Autowired
    private HttpSession session;

    public int join(UserVO param){
        return mapper.insUser(param);
    }

    public String login(UserVO param){
        UserVO result =  mapper.selUser(param);
        if(result == null){
            return "/user/login?err=1";
        }else if(param.getUpw().equals(result.getUpw()) ){//로그인 성공
            result.setUpw(null);
            session.setAttribute("loginUser", result);
            return "/board/list";
        }else{ //비밀번호 틀림
            return "/user/login?err=2";
        }
    }

}
