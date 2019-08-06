package Test;
import java.util.Scanner; 
public class Test01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = "Y";
		String num;
		
		System.out.println("This program counts the even, odd, and zero digits of an integer");
			while(input.equalsIgnoreCase("Y")) {
					System.out.println("Please enter a positive integer"); 
					num = sc.nextLine();
					int even = 0;
					int odd = 0;
					int zero=0;
					String[] numArr = num.split("");
					
					while (Integer.parseInt(num)<=0) {
						System.out.println("Please enter a positive integer");
						num = sc.nextLine(); 
					}
					
					for (int i=0; i<numArr.length; i++) {
						if (Integer.parseInt(numArr[i]) == 0) {
							zero++;
						}
						else if (Integer.parseInt(numArr[i])% 2 == 0) {
							even++; 
						} 
						else if (Integer.parseInt(numArr[i])% 2 == 1) {
							odd++;
						}
					}
					
					System.out.println("Number of zeros: " + zero +".");
					System.out.println("Number of even: " + even +".");
					System.out.println("Number of odd: " + odd +".");
					
			}
			
	}
} 
