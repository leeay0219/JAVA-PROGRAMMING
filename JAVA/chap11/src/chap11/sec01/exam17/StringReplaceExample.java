package chap11.sec01.exam17;

public class StringReplaceExample {

	public static void main(String[] args) {
		String oldStr = "java is good. it supports plenty of API";
		String newStr = oldStr.replace("java", "python"); 
		System.out.println(oldStr); 
		System.out.println(newStr);
		
	}

}
