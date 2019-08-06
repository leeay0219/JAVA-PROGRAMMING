package sec04.exam04;

public class MenuExample {

	public static void main(String[] args) throws Exception {
		int keyCode = 0; 
		
		while (true) {
			if ((keyCode != 10) && (keyCode != 13)) {
			System.out.println ("------------------------------------");
			System.out.println ("1. List 2. Create 3.Delete 4.Quit");
			System.out.println ("------------------------------------");
			System.out.print("Select: ");
			} 
			
			keyCode = System.in.read();
						
			if (keyCode == 49) {
				System.out.println("Show List");
			} else if (keyCode ==50) {
				System.out.println("Creating");
			} else if (keyCode ==51) {
				System.out.println("Deleting");
			} else if (keyCode ==52) {
				break;
			} 
		} System.out.println("Quit");
	}

}
