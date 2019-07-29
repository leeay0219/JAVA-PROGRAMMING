package chap09.sec02.exam02;

public class Example {

	public static void main(String[] args) {
		Anonymous anon = new Anonymous();
		anon.method1();
		
		anon.method2(new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("AC turnOn");
			}
			@Override
			public void turnOff() {
				System.out.println("AC turnOff");
			}
		});
	}

}

