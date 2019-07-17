package sec02.exam02;

public class ByteExample {

	public static void main(String[] args) {
	byte v1 = -128; 
	byte v2 = -30;
	byte v3 = 0;
	byte v4 = 127; // byte: -128~127 . Compile Error if the number is out of bound
	System.out.println(v1 + "," + v2 + "," + v3 + "," + v4);
	}

}
