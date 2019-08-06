package sec04.exam05;
import java.util.Scanner; 

public class ScannerExample {

	public static void main(String[] args) throws Exception {
		Scanner sc =  new Scanner(System.in);
		String inputData; 
		
		while(true) {
			inputData = sc.nextLine();
			System.out.println("Input String: \"" + inputData + "\"");
			if(inputData.equals("q")) {
				sc.close();
				break;
			}
		}
	
		System.out.println("quit");
	}

}
