package sec03.exam02;

public class CastingExample {

	public static void main(String[] args) {
		int v1 = 10; 
		byte v2 = (byte) v1;
		System.out.println(v2);
		int v3 = 200; 
		byte v4 = (byte) v3;
		System.out.println(v4);
		
		char v5 = 'H';
		int v6 = v5; 
		System.out.println(v6);
		
		int v7 = 65; 
		char v8 = (char) v7;
		System.out.println(v8);
		for (int i=65; i<=90; i++) {
			System.out.print((char)i);
		}
		
		double v9 = 10.5; //decimals got rid of
		int v10 = (int) v9;
		System.out.println("\n" + (v10));
		
		double v11 = 10.5;
		float v12 = (float)v11; 
		System.out.println(v12);
	}

}
