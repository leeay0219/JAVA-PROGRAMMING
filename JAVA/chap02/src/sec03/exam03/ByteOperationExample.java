package sec03.exam03;

public class ByteOperationExample {

	public static void main(String[] args) {
		byte result1 = 10+20;
		System.out.println(result1);
		
		byte x = 10; // -> int
		byte y = 20; // -> int is more appropriate since the computer doesn't need to change them to int before added
		int result2 = x + y; // both changed to int type before added. Therefore their addition can't be initialised as byte type
		System.out.println(result2);
		
	}	

}

