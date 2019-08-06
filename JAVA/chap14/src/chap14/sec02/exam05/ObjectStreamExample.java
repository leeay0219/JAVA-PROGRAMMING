package chap14.sec02.exam05;
import java.io.*;
public class ObjectStreamExample {

	public static void main(String[] args) throws Exception {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream ("C:/Temp/object.db"));
		
		Board board = new Board(1, "title,", "content", "me");
		oos.writeObject(board);
		oos.flush();
		oos.close(); 
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:/Temp/object.db"));
		Board board2 = (Board) ois.readObject();
		System.out.println(board.getBno());
	}

}
