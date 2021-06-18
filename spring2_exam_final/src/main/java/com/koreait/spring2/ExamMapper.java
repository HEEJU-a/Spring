package com.koreait.spring2;

import com.koreait.spring2.vo.*;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ExamMapper {
    List<LocationCodeEntity> selLocationCodeList(SearchDTO param);
    int insApartmentInfoArr(InsertEntity param);
    List<ApartmentInfoEntity> selApartmentInfoList(SearchDTO param);
    List<ApartmentInfoDTO> selApartmentList(SearchDTO param);
}
