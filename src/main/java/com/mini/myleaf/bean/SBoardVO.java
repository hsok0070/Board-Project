package com.mini.myleaf.bean;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor		//빈 기본 생성자
@AllArgsConstructor		//모든 파라미터가 있는 생성자
@Data					//getter, setter 등
public class SBoardVO {
	
	private int sno;			//글의 번호 (등록 순서)
	private String sname;		//글쓴이
	private String stitle;		//글의 제목
	private String scontent;	//내용
	private int suphit;			//조회수
	private Date sdate;			//글쓴 날짜
	
	private int parent;        // 부모글 번호
	private int groupno;        // 글 그룹번호 
	private int depth;          // 글의 깊이 = 답글의 답글일 수록 depth가 증가
	private int grouporder;		//그룹 내의 순서 = 원글에 달린 답글의 순서
	
}	