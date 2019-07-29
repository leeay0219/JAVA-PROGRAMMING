package chap09.sec01.exam06.App;

import chap09.sec01.exam06.Android.Button;

public class Main {

	public static void main(String[] args) {
		Button btn = new Button();
		btn.setOnClickListener(new CallListener());
		btn.touch();
		
		btn.setOnClickListener(new MessageListener());
		btn.touch();
	}

}
