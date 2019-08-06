package chap06.sec05.exam03;

public class ClassA {
	int f1;
	static int f2; 
	
	void method1() {
	
	}
	
	static void method2() {
		
	}
	static void method3() {
		f2 = 10; 
		method2();
	}
	
	static void method4() {
		ClassA obj = new ClassA(); 
		obj.f1 = 10; 
		obj.method1();
	}
	
	public static void main (String[]args) {
		ClassA obj = new ClassA(); 
		obj.f1 = 10; 
		obj.method1();
	}
}
