package chap11.sec01.exam14;

import java.io.UnsupportedEncodingException;

public class StringGetBytesExample {

	public static void main(String[] args) {
		String str = "안녕하세요";
		
		byte[] bytes1 = str.getBytes(); 
		System.out.println("bytes1.length: " + bytes1.length);
		String str2 = new String(bytes1); 
		System.out.println("bytes1->String: " + str2);
		
		try {
			byte[] bytes2 = str.getBytes("EUC_KR"); 
			System.out.println("bytes2.length: " + bytes2.length);
			String str3 = new String(bytes2, "EUC-KR"); 
			System.out.println("bytes2->String: " + str3);
			
			byte[] bytes3 = str.getBytes("UTF-8"); 
			System.out.println("bytes3.length: " + bytes3.length);
			String str4 = new String(bytes3, "UTF-8"); 
			System.out.println("bytes3->String: " + str4);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}

}
