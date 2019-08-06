package chap14.sec03.exam01;
import java.util.*; 
import java.io.*; 
public class GetLineStringFromKeyboard {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		System.out.println(str);
	}
}
