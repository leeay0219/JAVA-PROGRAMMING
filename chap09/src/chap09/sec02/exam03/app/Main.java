package chap09.sec02.exam03.app;

import chap09.sec01.exam06.Android.Button;

public class Main {
	public static void main(String[]args) {
		Button btn1 = new Button();
		btn1.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void click() {
				System.out.println("Calling");
			}
		});
		
		Button btn2 = new Button();
		btn2.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void click() {
				System.out.println("Sending msg");
			}
		});
		btn1.touch();
		btn2.touch();
		
	}
}
