//
//import java.util.Scanner; 
//
//public class Main {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = Integer.parseInt(sc.nextLine());
//		String str = null;
//		str = sc.nextLine();
//		double avg = 0; 
//		int sum = 0;
//		int num[] = new int[n];
//		int newNum[] = new int[n];
//		
//		for (int i=0; i<n; i++) {
//			String[] strArr = str.split(" ");
//			num[i] = Integer.parseInt(strArr[i]);
//			int max = num[0];
//			if (max < num[i]) {
//				max = num[i];
//			}
//			newNum[i] = num[i]/max*100;
//			sum += newNum[i];
//		}
//		avg = (double)(sum)/n;
//		System.out.println(avg);
//	}
//}

package chap06.sec04.exam01;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total = 0;
        int max = 0;
        int score;
        for (int i = 0; i < n; ++i) {
            score = sc.nextInt();
            total += score;
            if (score > max) {
                max = score;
            }
        }
        sc.close();
         
        double avg = 0;
        avg = 100.0 * total / max / n;
        System.out.printf("%.2f", avg);
    }
}