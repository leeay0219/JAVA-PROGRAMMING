package chap13.sec01.exam02;
import java.util.*;

class Board2 {
		String subject; 
		String content; 
		String writer;
		
		public Board2(String subject, String content, String writer) {
			this.subject = subject; 
			this.content = content; 
			this.writer = writer; 
		}
}

public class ArrayListExample {

		public static void main(String[] args) {
			List<Board2> list = new ArrayList<>(); 
			
			list.add(new Board2("제목1", "내용1", "글쓴이1"));
			list.add(new Board2("제목2", "내용2", "글쓴이2"));
			list.add(new Board2("제목3", "내용3", "글쓴이3"));
			list.add(new Board2("제목4", "내용4", "글쓴이4"));
			list.add(new Board2("제목5", "내용5", "글쓴이5"));
			
			list.remove(2);
			list.remove(3);
			
			for (int i=0; i<list.size(); i++) {
				Board2 board = list.get(i); 
				
				System.out.println(board.subject + "\t" + board.content + "\t" + board.writer);
			}
		}
}
