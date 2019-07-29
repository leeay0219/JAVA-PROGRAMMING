package chap10.sec01.exam00;

public class ExceptionTest {

	public static void main(String[] args) {
		try {
			int arr[] = new int[3]; 
			arr[3] = 100; 
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
		}
		System.out.println("end"); 
	}

}
