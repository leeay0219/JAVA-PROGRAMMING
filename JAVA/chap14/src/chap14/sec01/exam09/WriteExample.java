package chap14.sec01.exam09;
import java.io.*;
public class WriteExample {

	public static void main(String[] args) throws Exception{
		Writer writer = new FileWriter("C:/Temp/test9.txt");
		
		String str = "ABCDE";
		writer.write(str, 1, 3);
		
		writer.flush(); 
		writer.close(); 
	}

}
