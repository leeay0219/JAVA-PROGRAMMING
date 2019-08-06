package chap06.sec03.exam06;

public class NewString {
	String data;
	
	NewString(String data) {
		this.data = data; 
	}
	
	NewString(byte[] data) {
		this(new String(data)); 
	}
	
	NewString(char[] data) {
		this(new String(data)); 
	}
	
	NewString(String data, String data1) {
		String[] strArray = data.split(data1);
		this.data = "";
		for (int i=0; i<strArray.length; i++) {
			this.data+=strArray[i];
		}
	}

}

