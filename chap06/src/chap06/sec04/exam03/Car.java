package chap06.sec04.exam03;

public class Car {
	int gas; 
	
	void setGas(int gas) {
		this.gas = gas;  // 가스 충전 값 받기
	}
	
	boolean isLeftGas() {
		if (gas == 0) {
			System.out.println("Ran out of Gas");
			return false; 
		} else 
			System.out.println("Still enough Gas");
			return true; 
	}
	void run() {
		while (true) {
			if (gas > 0) {
				System.out.println("Run the car. Gas: " + gas);
				gas -= 1; 
				} else {
				System.out.println("Stop the car. Gas: " + gas);
				return; 
			}
		
		}
		
	}
}
