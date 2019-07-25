
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int a = Integer.parseInt(sc.nextLine());
    	int b = Integer.parseInt(sc.nextLine());
    	int c = Integer.parseInt(sc.nextLine());
    	int result = a*b*c; 
    	int[] num = new int[10];
    	
    	while(result>0)
        {
            num [result%10]++;
            result/=10;
        }
 
        for(int n : num)
        {
            System.out.println(n);
        }

    }
    
}
 