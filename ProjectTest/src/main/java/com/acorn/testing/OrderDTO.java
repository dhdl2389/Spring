package com.acorn.testing;

import java.sql.Date;

import lombok.Data;

@Data
public class OrderDTO {
	private String orderCode;
    private String userCode;
    private String userNickname;
    private String phoneNum;
    private String boardId;
    private String boardTitle;
    private int boardPrice;
    private String memberPost;
    private String memberAddr;
    private String detailedAddress;
    private String deliveryReq;
    private Date orderDate;
}
