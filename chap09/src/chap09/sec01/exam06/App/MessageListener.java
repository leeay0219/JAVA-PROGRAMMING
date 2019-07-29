package chap09.sec01.exam06.App;

import chap09.sec01.exam06.Android.Button;

public class MessageListener implements Button.OnClickListener{
	@Override
	public void click() {
		System.out.println("Sending Message");
	}
}
