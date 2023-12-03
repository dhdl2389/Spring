package com.sh.qna.domain;

import lombok.Data;

@Data
public class QnaDTO {

	private int q_code;
	private String q_id;
	private String q_title;
	private String q_contents;
	private String q_date;
	private String q_time;
	private String q_check;
	private String q_writer;
	private String q_comment;
	private int q_code_co;
	private int num;
	

	public QnaDTO() {
		super();
	}
	

	public QnaDTO(int q_code,String q_id, String q_title ,String q_contents, String q_date,String q_time, String q_check, String q_writer) {
		super();
		this.q_code = q_code;
		this.q_id = q_id;
		this.q_title = q_title;
		this.q_contents = q_contents;
		this.q_date = q_date;
		this.q_time = q_time;
		this.q_check = q_check;
		this.q_writer = q_writer;
	}


	public QnaDTO(String q_id, String q_title, String q_contents, String q_check, String q_writer) {
		super();
		this.q_id = q_id;
		this.q_title = q_title;
		this.q_contents = q_contents;
		this.q_check = q_check;
		this.q_writer = q_writer;
	}


	public QnaDTO(int q_code, String q_title, String q_contents, String q_check) {
		super();
		this.q_code = q_code;
		this.q_title = q_title;
		this.q_contents = q_contents;
		this.q_check = q_check;
	}


	public QnaDTO(int q_code, String q_writer, String q_comment) {
		super();
		this.q_code = q_code;
		this.q_writer = q_writer;
		this.q_comment = q_comment;
	}


	







	

}
