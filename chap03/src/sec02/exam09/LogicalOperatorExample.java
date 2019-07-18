package sec02.exam09;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		int x = 6; 
		
		if((x%2==0) && (x%3==0)) {
			System.out.println("Can be multiplied by 2, 3");
		} if ((x%2==0) || (x%3==0)) {
			System.out.println("Can be multiplied by 2, 3");
		}
	}

}
