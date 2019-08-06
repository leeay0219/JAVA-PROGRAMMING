package chap14.sec02.exam01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class CharacterConvertStreamExample {

	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("C:/Temp/CCS.txt");
		OutputStreamWriter osw = new OutputStreamWriter(os, "EUC-KR");
		
		String data = "홍길동";
		osw.write(data);
		
		osw.flush();
		osw.close(); 
		
		InputStream is = new FileInputStream("C:/Temp/CCS.txt");
		InputStreamReader isr = new InputStreamReader(is, "EUC-KR"); 
		while(true) {
			int value = isr.read();
			if(value == -1) break; 
			System.out.print((char)value);
		}
	}

}
