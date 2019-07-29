package chap07.sec03.exam04;

public class InstanceofExample {
	public static void main (String[]args) {
		A a1 = new A();
		System.out.println(a1 instanceof B);
		
		A a2 = new D();
		System.out.println(a2 instanceof D);
		System.out.println(a2 instanceof B);

	}
	public static void method(A a) {
		if (a instanceof B) {}
	}
}


class A{}
class B extends A{}
class C extends A{}

class D extends B{}
class E extends B{}

class F extends C{}
class G extends C{}

