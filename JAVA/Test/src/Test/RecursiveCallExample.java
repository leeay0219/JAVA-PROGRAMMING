package Test;

public class RecursiveCallExample {
	static int count = 0;
	public static void main(String[]args) {
		method(); 
	}
	
	static void method() {
		System.out.println("Method() recursive call: " + count);
		count++; 
		method();
	}
	
	static int num = 5; 
	static int factorial() {
		int sum = 1; 
		for (int i=1; i<=num; i++) {
			sum *= i;
		}
		return sum; 
	}
	
	static int i = 0; 
	static int sum = 0; 
	
	static void factorial2() {
		if(i>5) {
			return;
		}
		else {
			sum *= i;
			i++;
		}
		factorial2();
		System.out.println(sum); 
	}
	
//	static int factorial3(int k) {
//		if (k==5) {
//			return k; 
//		} else {
//			return factorial3(k-1);
//		}
//		factorial3(i);
//		System.out.println(sum); 
//	}
}
