package chap09.sec02.exam01;

public class Example {

	public static void main(String[] args) {
		Anonymous anon = new Anonymous();
		anon.method1();
		anon.field.wake();
		anon.method2(
				new Person() {
					void study() {
						System.out.println("Studying");
					}
					@Override
					void wake() {
						System.out.println("Wakes up at 8");
						study();
					}
				}
				
		);
		
	}

}
