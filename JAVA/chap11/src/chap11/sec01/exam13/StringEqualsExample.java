package chap11.sec01.exam13;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strVar1 = new String("Ah Yeong Lee");
		String strVar2 = "Ah Yeong Lee";
		
		if (strVar1 == strVar2) {
			System.out.println("Refer to same String Object");
		} else {
			System.out.println("Refer to different String Object");
		}
		
		if (strVar1.equals(strVar2)) {
			System.out.println("Same String");
		} else {
			System.out.println("Different String");
		}
	}
}
