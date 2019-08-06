package sec02.exam03;

public class LongExample {

	public static void main(String[] args) {
		long v1 = 10;
		long v2 = 20L; 
		long v3 = 3000000000L; // Compiler always recognise numbers as integers. If the number you need is over Integer's bound, you need to initialize it as long and put L at the end of the number.
		System.out.println (v1+v2+v3);
		System.out.println ("H");
	}

}
