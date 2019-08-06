package chap10.sec01.exam00;

public class ThrowTest {
	public static void print() throws Exception {
		throw new Exception("test");
	}
	public static void main(String[] args) {
		System.out.println("start");
		try {
			print();
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("end"); 
	}

}
