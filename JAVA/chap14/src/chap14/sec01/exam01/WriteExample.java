package chap14.sec01.exam01;
import java.io.*;
public class WriteExample {

	public static void main(String[] args) throws Exception {
		OutputStream os = null;
		try {
		os = new FileOutputStream("C:/Temp2/test2.docx");
		
		byte a = 10; 
		byte b = 20;
		byte c = 30; 
		
		os.write(a);
		os.write(b);
		os.write(c);
		os.flush();
		os.close(); 
		
		
		} catch (FileNotFoundException e) {
			System.out.println("no folder exists");
		} catch (IOException e) {
			System.out.println("cannot override data or create file"); 
		} finally {
			if (os != null) {
				try {
					os.close();
				} catch (IOException e) {
					System.out.println("osclose"); 
				}
			}
		}
	}

}
