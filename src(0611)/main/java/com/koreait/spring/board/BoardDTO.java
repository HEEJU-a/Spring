package com.koreait.spring.board;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardDTO {

    private int startIdx;
    private int recordCnt = 5;
    private int searchType;
    private String searchText;
    private int iboard;
    private int iuser;
    private int selType; //0:기본리스트, 1: 좋아요 리스트
    private int page = 1;
}
