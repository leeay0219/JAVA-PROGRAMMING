package Review.Day1;
//곱셈 과정 출력
import java.util.Scanner; 
public class Team4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int x = Integer.parseInt(sc.nextLine()); 
		int y = Integer.parseInt(sc.nextLine()); 
		
		System.out.println(x*(y%100%10));
		System.out.println(x*(y%100-y%100%10)/10);
		System.out.println(x*(y-y%100)/100);
		System.out.println(x*y); 
		
		sc.close();
	}

}
