import java.util.*; 
public class P8_re {
	
	static int fibo(int x) {
		if (x==0) {
			return 0;
		} else if (x==1) {
			return 1; 
		} else {
			int pre2 = 0; 
			int pre1 = 1; 
			int fib = 0; 
			
			for (int i=2; i<=x; i++) {
				fib = pre2 + pre1; 
				if (fib == x) {
					return pre1; 
				} else if (fib > x) {
					return pre1 + fibo(x-pre1);
				}
				pre2 = pre1; 
				pre1 = fib; 
			}
			return fib; 
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int t = Integer.parseInt(sc.nextLine());
		int [] guest = new int [t]; 
		for (int i=0; i<t; i++) {
			guest[i] = Integer.parseInt(sc.nextLine());
		}
		
		for (int i=0; i<t; i++) {
			System.out.println("Case #" + (i+1));
			int set = fibo(guest[i]);
			System.out.println(set); 
		}
		sc.close();
	}

}
