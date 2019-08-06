package chap10.sec02.exam03;

import java.io.IOException;

public class ThrowsExample {
	public static void main(String[]args) throws IOException{
			int keyCode = System.in.read();
			System.out.println("KeyCode: " + keyCode);
		try {
			method1();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void method1() throws ClassNotFoundException {
		Class c  = Class.forName("sec02.exam03.ThrowsExample2");
		System.out.println("Found class");
	}
}
