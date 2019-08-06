package chap12.sec02.exam04;

public class WordExample {

	public static void main(String[] args) {
		Thread autoSave = new Thread() {
			@Override
			public void run() {
				while(true) {
					try {
						Thread.sleep(10000); 
					} catch (Exception e) {
						
					}
				}
			}
		};
		autoSave.setDaemon(true);
		autoSave.start();
		
		while(true) { 
			for (int i=0; i<5; i++) {
				try {
					Thread.sleep(500);
				} catch(Exception e) {
					System.out.println("work");
				}
			}
			break; 
		}

	}
}
