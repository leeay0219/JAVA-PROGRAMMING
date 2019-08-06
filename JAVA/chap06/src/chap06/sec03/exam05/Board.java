package chap06.sec03.exam05;

public class Board {
	String title;
	String content;
	String writer;
	int hitCount;
	
	Board() {
		
	}
	
	Board(String title, String content) {
		this (title, content, "Ah Yeong");
	}
	
	Board(String title, String content, String writer) {
		this (title, content, writer, 500);
	}
	
	Board(String title, String content, String writer, int hitCount) {
		this.title = title; 
		this.content = content; 
		this.writer = writer; 
		this.hitCount = hitCount; 
	}
}
