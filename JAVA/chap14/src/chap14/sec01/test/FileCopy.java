package chap14.sec01.test;
import java.io.*; 

public class FileCopy {

	public static void main(String[] args) {
		InputStream is = null; 
		OutputStream os = null; 
		try {
			is = new FileInputStream("C:/Temp/originalFile.jpg");
			os = new FileOutputStream("C:/Temp/copy2.jpg");
			byte[] buffer = new byte[1024];
		} 
		
		catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (is != null) 
					is.close();
				if (os != null) 
					os.close();
			} catch (IOException e) {
				
			}
		}
	}

}
