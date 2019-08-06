package Algorithm;

import java.util.*; 

public class Test1  {
	public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	int[] r = new int[10]; 
	int count = 1; 
	
	for (int i=0; i<10; i++) {
	    int n = sc.nextInt();
		r[i] = n%42;
	}
	
    Arrays.sort(r);       
    for (int i=0; i<r.length-1; i++) {
		if (r[i] != r[i+1]) {
			count++;
		}
	}
		
    System.out.println(count); 
	sc.close(); 
		
	}
}