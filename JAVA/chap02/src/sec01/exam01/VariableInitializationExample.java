package sec01.exam01;

public class VariableInitializationExample {

	public static void main(String[] args) {
		int value = 0;
		double value2 = 10.5; 
		float value3 = 10.0f;
		boolean value4 = true;
		
		int result = value + (int)value2 + (int)value3;
		if (value4) {
			System.out.println("true");
		}
		
		System.out.println(result);
		

	}

}
