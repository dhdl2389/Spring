package com.sh.qna.repository;

import java.util.List;

import com.sh.qna.domain.QnaDTO;


public interface QnaRepositoryI {
	
	public List<QnaDTO> getListPage(int currentPage , int pageSize);
	public int getTotalCount();
	public void insertQna(QnaDTO dto);
	public int updateQna(QnaDTO dto);
	public int deleteQna(int code);
	public QnaDTO getListOne(int code);
	public int insertcomment(QnaDTO dto);
	public List<QnaDTO> getCommentList(int code);
	public int updateComment(QnaDTO dto);
	public int deleteComment(QnaDTO dto);
	public QnaDTO getCommentOne(int q_code);
}
