package chap12.sec02.exam03;

public class PrintThread2 extends Thread{
	public void run() {
		try {
			while(true) {
				System.out.println("실행중");
				Thread.sleep(1);
				if (isInterrupted()) {
					break; 
				}
			}
		} catch (InterruptedException e) {
			
		}
		System.out.println("자원정리");
		System.out.println("실행종료");
	}
}
