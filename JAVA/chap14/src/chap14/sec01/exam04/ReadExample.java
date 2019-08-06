package chap14.sec01.exam04;
import java.io.*;
public class ReadExample {

	public static void main(String[] args) throws Exception {
		try {
			InputStream is = new FileInputStream("C:/Temp/test1.db");
			int i1 = is.read();
			System.out.println(i1); 
			int i2 = is.read();
			System.out.println(i2);
			
			while(true) {
				int data = is.read(); 
				if(data ==-1) break; 
				System.out.println(data);
			}
			
			int data = -1; 
			while((data) != -1) {
				System.out.println(data); 
			}
			
			
		} catch (FileNotFoundException e) {
			System.out.println("wrong file directory");
		} catch(IOException e) {
			System.out.println("file exists, but cannot be read");
		}
	}

}
