package chap09.sec02.exam03.android;

public class Button {
	//Field 
	private OnClickListener listener; 
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
