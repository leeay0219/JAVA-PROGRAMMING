package chap13.sec01.exam06;
import java.util.Stack; 

public class StackExample {
	public static void main(String[] args) {
		
		Stack <Integer> s = new Stack<>(); 
		s.push(100);
		s.push(50);
		s.push(150);
		s.push(200); 
		
		System.out.println(s.size()); 
		System.out.println(s.get(2));
		System.out.println(s.size()); 
	
	}

}
