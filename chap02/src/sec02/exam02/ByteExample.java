package sec02.exam02;

public class ByteExample {

	public static void main(String[] args) {
	byte v1 = -128; 
	byte v2 = -30;
	byte v3 = 0;
	byte v4 = 127; // byte: -128~127 이라 이 이상 넘어가면 컴파일에러
	System.out.println(v1 + "," + v2 + "," + v3 + "," + v4);
	}

}
