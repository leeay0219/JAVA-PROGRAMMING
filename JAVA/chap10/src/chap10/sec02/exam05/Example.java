package chap10.sec02.exam05;

public class Example {

	public static void main(String[] args) throws DepositException {
		Bank bank = new Bank();
		
		bank.deposit(-10000);
		System.out.println("Success");
	}

}
