package com.koreait.spring2;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserVO {
    private int i_user;
    private String uid;
    private String upw;
    private String nm;
    private String r_dt;
}
