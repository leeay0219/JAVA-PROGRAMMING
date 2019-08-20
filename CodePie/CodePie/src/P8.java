import java.util.*; 
public class P8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int t = Integer.parseInt(sc.nextLine()); 
		for (int i=0; i<t; i++) {
			int n = Integer.parseInt(sc.nextLine());
			System.out.println("Case #" + (i+1)); 
			System.out.println(fibo(n)); 
		}
		sc.close();
	}
	
	public static int fibo(int x) {
		if (x == 0) 
			return 0; 
		if (x == 1) 
			return 1;
		int a = 1; 
		int b = 1; 
		
		while (true) {
	    	int c = a + b;
	    	if (c > x) {
	    		return a + fibo(x - b);
	    	} else if (c == x) {
	    		return b;
	    	}
	    	a = b; 
	    	b = c;
		}
	}
}

