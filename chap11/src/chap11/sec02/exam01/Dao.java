package chap11.sec02.exam01;

import java.util.*;

public class Dao {
	void insert(String title, String content, String writer, Date writeDate) {
		//save parameter on database 
		System.out.println(title); 
		System.out.println(content); 
		System.out.println(writer); 
		System.out.println(writeDate); 
	}

	public void insert(Board board) {
		System.out.println(board.getTitle());
		System.out.println(board.getContent());
		System.out.println(board.getWriter());
		System.out.println(board.getWriteDate());
	}
	
	Board select() {
		Board board = new Board(); 
		board.setTitle("title"); 
		board.setContent("content"); 
		board.setWriter("hong"); 
		board.setWriteDate(new Date());
		return board; 
	}
}
