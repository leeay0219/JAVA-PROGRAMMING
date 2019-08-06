package sec03.exam05;

public class OperationsPromotionExample {

	public static void main(String[] args) {
		byte byteValue1 = 10; 
		byte byteValue2 = 20;
		byte result1 = (byte)(byteValue1 + byteValue2);
		System.out.println(result1);
		
		char charValue1 = 'A';
		char charValue2 = 1;
		char result2 = (char)(charValue1 + charValue2);
		System.out.println(result2);
		
		int intValue1 = 10;
		int intValue2 = intValue1 / 4;
		double intValue3 = (double)intValue1 / 4;
		System.out.println(intValue2);
		System.out.println(intValue3);
		
		
		double doubleValue1 = 3.4;
		double doubleValue2 = 2.6; 
		double doubleValue3 = doubleValue1+doubleValue2;
		System.out.println(doubleValue3);
		System.out.println((int)doubleValue3);
	}
}
