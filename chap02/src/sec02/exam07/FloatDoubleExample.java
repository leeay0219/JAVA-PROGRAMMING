package sec02.exam07;

public class FloatDoubleExample { // Both aren't able to express straight '0' under the circumstance of floating point (부동소수점_가수와 지수로 나누어 저장)

	public static void main(String[] args) {
		//initialise test
		float v1 = 3.14f; // Compiler recognise real number as double. Gotta put f after float's initial number (just like L with long)
		double v2 = 3.14;
		
		//precision test
		float v3 = 0.1234567890123456789f;
		double v4 = 0.1234567890123456789;
		
		//random test
		float v5 = 240000000000L; //long type = integer type. Therefore can be initialized as float 
		float v6 = 0;
		float v7 = 0.1f;
		double v8 = 0.1;
		
		System.out.println("var1 : " + v1);
		System.out.println("var2 : " + v2);
		System.out.println("var3 : " + v3);
		System.out.println("var4 : " + v4);
		System.out.println("var5 : " + v5);
		System.out.println("var6 : " + v6);
		System.out.println("var7 : " + v7);
		
		if (v7 == 0.1) {
			System.out.println(true);
		} else System.out.println(false);
		
		if (v8 == 0.1) {
			System.out.println(true);
		} else System.out.println(false);
		
		//e (^)
		System.out.println();
	}

}
