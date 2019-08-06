package chap11.sec01.exam05;

public class SmartPhoneExample {

	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone("Samsung", "Android");
		System.out.println(sp.toString());
		System.out.println(sp); 
		System.out.println(sp + ", $90000"); 
	}

}
