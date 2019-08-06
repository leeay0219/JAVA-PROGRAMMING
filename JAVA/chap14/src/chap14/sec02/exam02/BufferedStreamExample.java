package chap14.sec02.exam02;
import java.io.*; 
public class BufferedStreamExample {

	public static void main(String[] args) throws Exception {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:/Temp/originalFile.jpg"));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:/Temp/copy.jpg"));

		long startTime = System.nanoTime();
		
		while (true) {
			int data = bis.read();
			if (data==-1) {
				break; 
			}
			bos.write(data);
		}
		bos.flush();
		
		long endTime = System.nanoTime();
		
		System.out.println(endTime - startTime); 

		bos.close();
		bis.close();
	}

}
