package sec03.exam04;

public class FloatOperationExample {

	public static void main(String[] args) {
		
		float result1 = 1.5f + 2.3f;
		System.out.println(result1);
		
		float v1 = 1.5f; 
		float v2 = 2.3f;
		float result2 = v1 + v2;
		System.out.println(result2);
		
		float v3 = 1.5f; 
		double v4 = 2.3;
		float result3 = (float) ((float)v3 + v4);
		double result4 = v3+v4;
		System.out.println(result3);
		System.out.println(result4);
	}

}
