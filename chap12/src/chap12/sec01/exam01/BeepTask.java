package chap12.sec01.exam01;

public class BeepTask implements Runnable {

	@Override
	public void run() {
		for (int i=0; i<5; i++) {
			System.out.println(Thread.currentThread().getName() + ": Beep");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
			}
		}
	}
	

}
