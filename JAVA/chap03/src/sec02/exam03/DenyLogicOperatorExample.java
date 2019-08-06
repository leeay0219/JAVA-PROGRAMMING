package sec02.exam03;

public class DenyLogicOperatorExample {

	public static void main(String[] args) {
		boolean stop = true; 
		if (!stop) {
			System.out.println("Move");
		} else System.out.println("Stop");
		
		int x = 5; 
		if (!(x<10)) {
			System.out.println(false);
		} else System.out.println(true);
	}

}
