package Hard;
//소수구하기
import java.util.Scanner;
public class Team1 {

	public static void main(String[] args) {
				Scanner scanner = new Scanner(System.in);
				String input = scanner.nextLine();
				String[] numArr = input.split(" ");
				int n = Integer.parseInt(numArr[0]); // 첫 번째 수
				int m = Integer.parseInt(numArr[1]); // 두 번째 수
				
				for(int i=n; i<=m; i++) { 
					int j; 
					for(j=2; j<i; j++) { 
						if(i%j == 0) { 
							break;
						}
					}
						if(j == i) { 
							System.out.println(i);
						}
				}	
		}
}
