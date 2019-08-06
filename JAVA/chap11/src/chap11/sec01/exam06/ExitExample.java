package chap11.sec01.exam06;

public class ExitExample {
	public static void main(String[]args) {
		for (int i=0; i<10; i++) {
			if (i==5) {
				System.exit(0);
				break;
			}
		}
		System.out.println("exit code");
	}
}
