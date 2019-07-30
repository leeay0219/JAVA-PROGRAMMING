package chap11.sec01.exam11;

import java.io.IOException;

public class KeyBoardtoStringExample {

	public static void main(String[] args) throws IOException {
		byte[] bytes = new byte[100];
		
		System.out.println("input: ");
		int readByteNo = System.in.read(bytes);
		
		String str = new String(bytes, 0, readByteNo-2); 
		System.out.println(str);
	}

}
