package chap11.sec02.exam01;

import java.util.*;

public class Service {
	Dao dao = new Dao(); 
	
	void writeBoard(String title, String content, String writer, Date writeDate) {
		dao.insert(title, content, writer, writeDate); 
	}
	
	void writeBoard(Board board) { // DTO: Data transfer object
		dao.insert(board); //service -> dao
	}
	
	Board getBoard() {
		Board board = dao.select(); //dao -> service
		return board;
	}
}
