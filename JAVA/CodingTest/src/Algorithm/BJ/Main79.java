package Algorithm.BJ;
import java.io.*;
import java.util.*; 

public class Main79 {
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] state = sc.nextLine().split(" ");
        boolean[] check = new boolean[n + 1];

        for (int i = 1; i <= n; i++) {
            if (Integer.parseInt(state[i-1]) == 1) {
            	check[i] = true;
            }
        }
        int student = Integer.parseInt(sc.nextLine());
        
        for (int i = 0; i<student; i++) {
        	String[] s = sc.nextLine().split(" ");
        	int sex = Integer.parseInt(s[0]);
        	int get = Integer.parseInt(s[1]);
        	
        	if (sex == 1) {
        		for (int j = get; j < check.length; j += get) {
        			check[j] = !check[j];
                }
        	} else {
        		int l = get - 1; 
        		int r = get + 1; 
        		 while(true){
        	            if (l < 1 || r > check.length - 1) {
        	                break;
        	            }
        	            if ((check[l] ^ check[r])) {
        	                break;
        	            } else {
        	            	check[l] = !check[l--];
        	            	check[r] = !check[r++];
        	            }
        		 }
        		 check[get] = !check[get];
        	}
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < check.length; i++) {
            if (check[i]){
                sb.append(1);
            } else {
                sb.append(0);
            }
            if (i % 20 == 0) {
                sb.append("\n");
            } else {
                sb.append(" ");
            }
        }
        System.out.print(sb);
        sc.close();
    }
}