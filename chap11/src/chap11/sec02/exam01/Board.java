package chap11.sec02.exam01;

import java.util.Date;

public class Board {
	private String title; 
	private String content; 
	private String writer;
	private Date writeDate;
	
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
	
	public Date getWriteDate() {
		return writeDate;
	}
	
	public void setWriteDate(Date date) {
		this.writeDate = date; 
	}
	

}
