package C9;

public class AnonymousExample {

	public static void main(String[] args) {
		Anonymous anonymous = new Anonymous(); 
		anonymous.field.start(); 
		anonymous.method();
		anonymous.method2(
				new Worker() {
				@Override 
				public void start() {
					System.out.println("Testing");
				}
			}
		);
		
	}

}
