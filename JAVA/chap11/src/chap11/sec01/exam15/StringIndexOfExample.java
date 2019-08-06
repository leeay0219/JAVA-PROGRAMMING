package chap11.sec01.exam15;

public class StringIndexOfExample {

	public static void main(String[] args) {
		String subject = "java programming"; 
		
		int location = subject.indexOf("programming"); 
		System.out.println(location); 
		
		if (subject.indexOf("java") != -1) {
			System.out.println("it's about java");
		} else
			System.out.println("it's not about java"); 
	}

}
