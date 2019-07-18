package sec02.exam02;

public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		int x = 0; 
		x++;
		++x;
		System.out.println("x: " + x); // x=2
		
		int result1 = ++x + 10; 
		System.out.println("resul11: " + result1); //13 , x=3
		
		int result2 = x++ + 10; // x+10, x++; works too 
		System.out.println("result2: " + result2); //13 , x=3 , next addition will be 4
	}

}
