package chap06.sec04.exam00;

public class MethodCallExample {

	public static void main(String[] args) {
		String data = "abc"; 
		char c  = data.charAt(2);
		System.out.println(c);
		boolean b = data.contains("s"); 
		System.out.println(b);
		data.getBytes();
		
		MethodCall mc = new MethodCall();
		mc.m1();
		int result1 = mc.m2(10, 11);
		System.out.println(result1);
	}

}
