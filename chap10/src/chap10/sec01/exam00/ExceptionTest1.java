package chap10.sec01.exam00;
import java.util.InputMismatchException;
import java.util.Scanner; 

public class ExceptionTest1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		try {
			int div = sc.nextInt();
			System.out.println(10/div); 
		} catch (ArithmeticException e) {
			System.out.println("ArithmaticException");
		} catch (InputMismatchException e) {
			System.out.println("InputMismatchException");
		} catch (Exception e) {
			System.out.println("Exception");
		} finally {
			System.out.println("finally");
		}
		System.out.println("end"); 
		sc.close(); 
	}

}
