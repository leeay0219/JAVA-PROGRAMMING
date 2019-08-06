package exam11;

public class Dice {

	public static void main(String[] args) {
		while(true) {
			int n = (int)(Math.random()*6)+1;
			int m = (int)(Math.random()*6)+1;
			
			System.out.println("(" + n + " , " + m + ")"); 
			
			if (n+m == 5) {
				break; 
			}
		}
	}

}
