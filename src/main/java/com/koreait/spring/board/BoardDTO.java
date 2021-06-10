package com.koreait.spring.board;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardDTO {

    private int stratIdx;
    private int recordCnt;
    private int searchType;
    private String searchText;
    private int iboard;
}
