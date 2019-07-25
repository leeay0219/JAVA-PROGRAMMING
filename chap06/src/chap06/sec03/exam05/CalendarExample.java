package chap06.sec03.exam05;

public class CalendarExample {
	public static void main(String[]args) {
		Calendar car2 = Calendar.getInstance(); //메소드 호출해서 리턴값은 받을 수 있음
		Calendar car3 = Calendar.getInstance();
		if (car2 == car3) {
			System.out.println("true");
		} else System.out.println("false");
	}
}
