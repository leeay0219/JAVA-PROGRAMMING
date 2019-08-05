package chap12.sec01.exam01;

public class PrintExample {

	public static void main(String[] args) {
		
		Thread thread1 = new Thread(new BeepTask());
		thread1.start(); 
		
		Thread thread2 = new Thread() {
			@Override
			public void run() {
				for (int i=0; i<5; i++) {
					System.out.println(Thread.currentThread().getName() + ": Chatting");
					try {
					Thread.sleep(500);
					} catch (InterruptedException e) {
						
					}
				}
			}
		};
		thread2.start(); 
		
		for (int i=0; i<5; i++) {
			System.out.println(Thread.currentThread().getName() + ": Drawing");
			try {
			Thread.sleep(500);
			} catch (InterruptedException e) {
				
			}
		}
	}
}