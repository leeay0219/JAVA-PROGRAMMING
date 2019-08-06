package chap14.sec01.exam02;
import java.io.*;
public class WriteExample2 {

	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream ("C:/Temp/test2.db");
		byte[]arr = {10, 20, 30};
		os.write(arr);
		os.flush();
		os.close(); 
	}

}
