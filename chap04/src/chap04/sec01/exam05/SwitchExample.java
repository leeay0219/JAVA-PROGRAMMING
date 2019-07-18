package chap04.sec01.exam05;

public class SwitchExample {

	public static void main(String[] args) {
	 int num = (int)(Math.random()*6) + 1;
	 switch(num) {
	 case 1:
	 case 3:
	 case 5:
		 System.out.println("ODD number");
		 break;
	 case 2:
	 case 4:
	 default: 
		 System.out.println("EVEN number");
	 }
	}
}
