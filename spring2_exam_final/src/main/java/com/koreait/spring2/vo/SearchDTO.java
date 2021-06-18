package com.koreait.spring2.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SearchDTO {
    private int deal_year;
    private int deal_month;
    private String external_cd;
    private int location_cd;
}
