package chap10.sec01.exam01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionExample {
	public static void main(String[]args) {
		try {
			FileInputStream fis = new FileInputStream("C:/Temp/text.data"); 
		} catch (FileNotFoundException e) {
			System.out.println("예외 처리 내용"); 	
		}
		try { 
			Thread.sleep(1000);
		} catch(Exception e) {
			System.out.println("예외 처리 내용");
		}
		
		try {
			String str = "10"; 
			int value = Integer.parseInt(str); 
		} catch (Exception e) {
			System.out.println("Only put number"); 
		}
		
	}
}
