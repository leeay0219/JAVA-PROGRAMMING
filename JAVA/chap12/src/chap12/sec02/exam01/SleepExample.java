package chap12.sec02.exam01;

import java.util.Calendar;

public class SleepExample {
	public static void main(String[]args) {
		Thread thread = new Thread() {
			@Override
			public void run() {
				while(true) {
					System.out.println("check time per hour");
					try { 
						Thread.sleep(3000); 
					} catch(Exception e) {
						
					}
					
				}
			}
		};
		thread.start(); 
		
		while(true) {
			Calendar c = Calendar.getInstance();
			int hour = c.get(Calendar.HOUR_OF_DAY);
			int minute = c.get(Calendar.MINUTE);
			int second = c.get(Calendar.SECOND);
			
			System.out.println(hour + ":" + minute + ":" + second);
			try { 
				Thread.sleep(1000); 
			} catch(Exception e) {
				
			}
			
		}
		
		
	}
}
