package chap14.sec01.exam11;
import java.io.*;
public class ReadExample {

	public static void main(String[] args) throws Exception {
	Reader reader = new FileReader("C:/Temp/test8.txt");
		
//		char [] buffer = new char[100];
//		int readCharNum = reader.read(buffer);
//		for(int i=0; i<readCharNum; i++) {
//			
//			System.out.println(buffer[i]);
//		}
		
//		char[] buffer = new char[100];
//		while(true) {
//			int readCharNum = reader.read(buffer);
//			if(readCharNum==-1) break; 
//			for(int i=0; i<readCharNum; i++) {
//				System.out.println(buffer[i]);
//			}
//		}
	
		char[] buffer = new char[5];
		int readCharNum = reader.read(buffer, 1, 3);
		while((readCharNum = reader.read(buffer)) != -1) {
			for (int i=0; i<readCharNum; i++) {
				System.out.println(buffer[i]);
			}
		}
	}

}
