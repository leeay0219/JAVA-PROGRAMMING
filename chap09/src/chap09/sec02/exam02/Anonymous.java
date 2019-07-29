package chap09.sec02.exam02;

public class Anonymous {
	RemoteControl rc = new RemoteControl() {
		@Override
		public void turnOn() {
			System.out.println("Power on");
		}
		@Override
		public void turnOff() {
			System.out.println("Power off");
		}
	};
	
	void method1() {
		rc.turnOn();
		rc.turnOff();
		int volume = 3; // final 로 선언된 것과 마찬가지임 
		
		RemoteControl localVar = new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("Radio on" + volume);
			}
			@Override
			public void turnOff() {
				System.out.println("Radio off");
			}
		};
		localVar.turnOn();
		localVar.turnOff();
	}
	
	void method2(RemoteControl rc) {
		rc.turnOn();
		rc.turnOff();
	}
}
