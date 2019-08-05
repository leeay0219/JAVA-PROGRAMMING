package chap11.sec02.exam01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Example {

	public static void main(String[] args) {
		Service service = new Service(); 
		
		Board board = new Board(); 
		board.setTitle("title"); 
		board.setContent("content"); 
		board.setWriter("lee"); 
		board.setWriteDate(new Date()); 
		
		service.writeBoard(board);
		
		Board board2 = service.getBoard(); 
		System.out.println(board2.getTitle());
		System.out.println(board2.getContent());
		System.out.println(board2.getWriter());
		System.out.println(board2.getWriteDate().toString());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd a HH:mm:ss");
		String strDate = sdf.format(board2.getWriteDate());
		System.out.println(strDate);
		
		
	}

}
