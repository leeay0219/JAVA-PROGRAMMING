package chap14.sec01.exam10;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample {

	public static void main(String[] args) throws Exception 
	{
		Reader reader = null; 
		
		try {
			reader = new FileReader("C:/Temp/test7.txt");
			
			char data1 = (char)reader.read();
			System.out.println(data1);
			char data2 = (char)reader.read();
			System.out.println(data2);
			char data3 = (char)reader.read();
			System.out.println(data3);
			int data4 = reader.read();
			System.out.println(data4);
			
			int data = -1; 
			while((data = reader.read()) != -1) {
				System.out.println((char)data);
			}
		}
		catch (Exception e){
			
		} 
	}

}
