package chap12.sec02.exam01;

import java.util.Calendar;

public class StopFlagExample {
	private static boolean stop; 

	public static void main(String[] args) {
		Thread clock =  new Thread() { 
		@Override 
		public void run() {
			while(!stop) {
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
	};
		clock.start();
		
		try { 
			Thread.sleep(5000); 
		} catch (Exception e) {
			
		}
		stop = true;
	}
}
