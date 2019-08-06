package chap14.sec01.exam13;
import java.io.*; 

public class CharEncodingExample {

	public static void main(String[] args) throws Exception {
		String data = "홍길동";
		byte[] arr1 = data.getBytes();
		System.out.println(arr1.length);
		
		byte[] arr2 = data.getBytes("EUC-KR");
		System.out.println(arr2.length);
		
		byte[] arr3 = data.getBytes("UTF-8");
		System.out.println(arr3.length);
		
		OutputStream os = new FileOutputStream("C:/Temp/charencoding.txt");
		os.write(arr2);
		os.flush();
		os.close();
		
		InputStream is = new FileInputStream("C:/Temp/charencoding.txt");
		byte[] buffer = new byte[100];
		int readByteNum = is.read(buffer);
		is.close();
		
		String data2 = new String(buffer, 0, readByteNum, "EUC-KR"); 
		System.out.println(data2); 
		
		Writer writer = new FileWriter("C:/Temp/charendocing.txt");
		writer.write("홍길동");
		writer.flush();
		writer.close();
	}

}

