package com.koreait.spring2;

import com.koreait.spring2.vo.LocationCodeEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ExamMapper {
    List<LocationCodeEntity> selLocationCodeList();
}
