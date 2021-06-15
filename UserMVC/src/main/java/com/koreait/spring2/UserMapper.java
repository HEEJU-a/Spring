package com.koreait.spring2;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    int insUser(UserVO param);
    UserVO selUser(UserVO param);
}
