package sec02.exam07;

public class CompareOperatorExample1 {

	public static void main(String[] args) {
		boolean stop = false;
		if (stop == true) {}
		if (stop) {}
		if (stop != false) {}
		
		int x = 10; 
		if (x>10) {}
		if (!(x<=10)) {}
		
		float var1 = 0.1f;
		System.out.println(var1==0.1f);
		System.out.println((double)var1 ==0.1);
		System.out.println(var1==0.1);
		System.out.println(var1);
		System.out.println((double)var1);
		
	}

}
