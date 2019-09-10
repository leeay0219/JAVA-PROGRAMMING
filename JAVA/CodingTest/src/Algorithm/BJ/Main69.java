package Algorithm.BJ;
import java.util.*;  

public class Main69 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int r = sc.nextInt(); //빨간타일 (가장자리)
		int b = sc.nextInt(); //갈색타일 (안쪽)
		
		for (int i=1; i<r; i++) {
			for (int j=1; j<r; j++) {
				if ((i*2 + (j-2)*2 == r) && ((i-2)*(j-2)==b)) {
					if (j > i) {
						System.out.println(j + " " + i);
					} else {
						System.out.println(i + " " + j); 
					}
					break; 
				}
 			}
		}
		sc.close();
	}

}
