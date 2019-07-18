package sec02.exam06;

public class StringConcatExample {
	public static void main (String[]args) {
		String str1 = 1 + 2 + "3"; //33
		String str2 = "1" + 2 + 3; //123
		String str3 = "1" + (2 + 3); //15
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
	}
}
