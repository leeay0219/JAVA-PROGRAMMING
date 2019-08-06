package chap11.sec01.exam07;

public class SystemTimeExample {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		System.out.println(start); 
		
		int sum = 0; 
		for (int i=1; i<1000000000; i++) {
			sum +=i; 
		}
		
		long end = System.currentTimeMillis();
		long time = end-start; 
		System.out.println("time: " + time); 
	}

}
