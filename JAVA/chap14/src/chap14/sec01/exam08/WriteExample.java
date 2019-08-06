package chap14.sec01.exam08;
import java.io.*; 
public class WriteExample {

	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter ("C:/Temp/test8.txt");
		char[]arr = {'A', 'B', 'C'};
		writer.write(arr);
		writer.flush();
		writer.close(); 
	}

}
