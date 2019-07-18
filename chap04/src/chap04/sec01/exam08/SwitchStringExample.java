package chap04.sec01.exam08;

public class SwitchStringExample {

	public static void main(String[] args) {
		
		String position = "과장";
		
		switch(position) {
			case "부장":
				System.out.println("$7000");
				break;
			case "차장":
				System.out.println("$5000");
				break;
			default:
				System.out.println("$3000");
				break;
		}
	}

}
