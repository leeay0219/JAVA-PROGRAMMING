package chap09.sec01.exam02;

public class A {
	//Field
	B b1 = new B();
	// static B b2 = new B();
	C c1 = new C();
	static C c2 = new C();
	//Constructor
	A() {
		B b1 = new B();
		C c1 = new C();
	}
	//Method
	void method1() {
		 b1 = new B();
		C c1 = new C();
	}
	
	static void method2() {
		//B b1 = new B();
		C c1 = new C();
	}
	
	//NestedClass
	class B {
		
	}
	
	static class C {
		
	}
}
