package chap14.sec01.exam06;

import java.util.Scanner; 

public class Main { 
  
    public static void main(String[] args) throws Exception { 
        Scanner sc = new Scanner(System.in); 
        int a, b, n, i, j, t, count, flag;
        
        t = Integer.parseInt(sc.nextLine());
        
        for (int k=0; k<t; k++) { 
        	a=0;
        	b=0;
        	n=0; 
        	count = 0; 
	        a = sc.nextInt(); 
	        b = sc.nextInt(); 
	        n = sc.nextInt(); 
	        
	        for (i=a; i<=b; i++) { 
	        	flag = 1; 
	            if (i==1 || i==0) 
	                continue;          
	            
	            if (i % n == 0 && n!= i) { 
		           flag = 0; 
		           break; 
		        } else if (flag == 1) {
		        	count++;
		        } 
	        }
	          
	        System.out.println("Case #" + (k+1) + ": " + count);
        }
        
        sc.close();
    }
}