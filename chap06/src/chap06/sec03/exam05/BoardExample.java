package chap06.sec03.exam05;

public class BoardExample {

	public static void main(String[] args) {
		Board b1 = new Board();
		System.out.println("b1 title: " + b1.title);
		System.out.println("b1 content: " + b1.content);
		System.out.println("b1 writer: " + b1.writer);
		System.out.println("b1 hitCount: " + b1.hitCount);
		System.out.println();
		
		Board b2 = new Board("Hello", "Nothing");
		System.out.println("b2 title: " + b2.title);
		System.out.println("b2 content: " + b2.content);
		System.out.println("b2 writer: " + b2.writer);
		System.out.println("b2 hitCount: " + b2.hitCount);
		
		System.out.println();
		
		Board b3 = new Board("What", "Nothing", "Ah Yeong", 200);
		System.out.println("b3 title: " + b3.title);
		System.out.println("b3 content: " + b3.content);
		System.out.println("b3 writer: " + b3.writer);
		System.out.println("b3 hitCount: " + b3.hitCount);
	}

}
