package chap09.sec01.exam06.Android;

public class Button {
	//Field 
	OnClickListener listener; 
	//Constructor
	//Method
	public void setOnClickListener(OnClickListener listener) {
		this.listener = listener; 
	}
	
	public void touch() {
		listener.click();
	}
	//Nested Interface
	public static interface OnClickListener {
		void click(); 
	}
}
