package chap14.sec02.exam05;

import java.io.Serializable;
import java.util.Date;

public class Board implements Serializable {
	private int bno; 
	private String title; 
	private String content; 
	private String writer; 
	
	public Board() {}
	
	public Board(int bno, String title, String content, String writer) {
		super();
		this.bno = bno;
		this.title = title; 
		this.content = content; 
		this.writer = writer;
	}

	public int getBno() {
		return bno;
	}

	public void setBno(int bno) {
		this.bno = bno;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

}
