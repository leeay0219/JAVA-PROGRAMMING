package C6.Method;

public class Car {
	int gas; 
	
	void getGas(int gas) {
		this.gas = gas; 
	}
	
	boolean leftGas() {
		if (gas == 0) {
			System.out.println("no gas");
			return false; 
		}
		System.out.println("yes gas");
		return true; 
	}
	
	void run() {
		while(true) {
			if (gas > 0) {
				System.out.println("running.. gas: " + gas);
				gas -= 1; 
			} else {
				System.out.println("gas: " + gas);
				return; 
			}
		}
	}
}
