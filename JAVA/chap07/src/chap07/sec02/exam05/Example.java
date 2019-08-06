package chap07.sec02.exam05;
public class Example {
	public static void main(String[]args) {
		Parent parent = new Child(); 
		parent.field1 = 10; 
		parent.method1();
		
		Child child = new Child(); 
		child.field2 = 10; 
		child.method2();
		
		method3(new Child2());
	}
	public static void method3 (Parent parent) {
		parent.field1 = 10; 
		parent.method1(); 
		
		if (parent instanceof Child) {
		Child child = (Child) parent;
		child.field2 = 20; 
		child.method2(); 
		}
		
	}
}
