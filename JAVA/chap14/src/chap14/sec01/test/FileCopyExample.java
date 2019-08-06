package chap14.sec01.test;
import java.io.*; 

public class FileCopyExample {

	public static void main(String[] args) throws Exception {
		File file1 = new File("C:/Temp/originalFile.jpg");
		File file2 = new File("C:/Temp/copy.jpg");
		
		long fsize1 = file1.length();
		
		FileInputStream fis = new FileInputStream(file1); 
		FileOutputStream fos = new FileOutputStream(file2);
	
		int input = 0; 
		int count = 0;
		  
	    byte[] data = new byte[1024];
		  
		while((input=fis.read(data))!=-1){
		   fos.write(data, 0, input);
		   count+=input;
		   float per = ((float)count/fsize1) * 100;
		   System.out.println((int)per + "% 카피됨");
		 }
		
		try {
			fis.close();
			fos.close(); 
		} catch (Exception e) {
			
		}
	
	} 

}
