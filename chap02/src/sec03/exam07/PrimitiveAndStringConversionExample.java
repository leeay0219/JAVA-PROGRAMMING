package sec03.exam07;

public class PrimitiveAndStringConversionExample {

	public static void main(String[] args) {
		String str1 = "2";
		int var1 = Integer.parseInt(str1) + 3;
		System.out.println(var1);
		
		String str2 = "3.14";
		double db1 = Double.parseDouble(str2) + 5;
		System.out.println(db1);
		
		String str3 = "true";
		boolean b1 = Boolean.parseBoolean(str3);
		System.out.println(b1);
		
		int var2 = 7; 
		String str4 = "" + var2 + 3; 
		System.out.println(str4);
		
		int var3 = 9;
		String str5 = String.valueOf(var3) + 3;
		System.out.println(str5);
	}	

}
