package chap13.sec01.exam06;
import java.util.*; 
public class QueueExample {

	public static void main(String[] args) {
		Queue<String> q = new LinkedList<>(); 
		q.offer("mail1");
		q.offer("mail2");
		q.offer("mail3");
		
		while(!q.isEmpty()) {
			String mail = q.poll();
			System.out.println(mail); 
		}
	}

}
