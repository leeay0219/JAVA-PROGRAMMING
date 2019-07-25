package Test;
import java.util.Scanner;
public class ex {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		
		for (int i = 0; i < num; i++) {
		    for (int j = 1; j < num - i; j++) {
		        System.out.print(" ");
		    }
		    for (int k = 0; k < i * 2 + 1; k++) {
		        System.out.print("*");
		    }
		    System.out.println();
		}
		sc.close();
	}

}
