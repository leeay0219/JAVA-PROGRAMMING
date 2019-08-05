package exam02;

import java.util.HashMap;

public class StudentExample {
	public static void main(String[] args) {
		HashMap <Student, String> hm = new HashMap<>(); 
		hm.put(new Student("1"), "95");
		
		String score = hm.get(new Student("1"));
		System.out.println("first student score: " + score);
	}
}
