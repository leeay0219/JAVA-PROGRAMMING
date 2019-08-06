package chap10.sec02.exam05;

public class Bank {
	int balance; 
	void deposit(int amount) {
		if (amount > 0) {
			balance += amount; 
		} else {
			//throw new DepositException();
		}
	}
}
