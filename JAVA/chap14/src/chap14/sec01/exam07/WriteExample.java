package chap14.sec01.exam07;
import java.io.*; 
public class WriteExample {

	public static void main(String[] args) {
		Writer writer = null; 
		
		try {
			writer = new FileWriter("C:/Temp/test7.txt");
			char a = 'A';
			char b = 'B';
			char c = 'C'; 
			
			writer.write(a);
			writer.write(b);
			writer.write(c); 
			
			writer.flush();
		} catch (FileNotFoundException e) {
			System.out.println("no folder");
		} catch (IOException e) {
			System.out.println("file cannot be made / data dannot be saved");
		}
	}

}
