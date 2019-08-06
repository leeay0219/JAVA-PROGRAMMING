package chap14.sec01.exam05;
import java.io.*; 
public class ReadExample {

	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("C:/Temp/test2.docx");
		
//		byte[] buffer = new byte[100];
//		int readByteNum = is.read(buffer);
//		for(int i=0; i<readByteNum; i++) {
//			System.out.println(buffer[i]);
//		}
		
//		byte[] buffer = new byte[100];
//		while(true) {
//			int readByteNum = is.read(buffer);
//			if(readByteNum==-1) break; 
//			for(int i=0; i<readByteNum; i++) {
//				System.out.println(buffer[i]);
//			}
//		}
		
		byte[] buffer = new byte[100];
		int readByteNum = -1;
		while((readByteNum = is.read(buffer)) != -1) {
			System.out.println(buffer);
		}
	}

}
