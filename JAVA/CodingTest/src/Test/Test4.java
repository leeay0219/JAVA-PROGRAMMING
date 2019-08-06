package Test;
public class Test4 {
	public static void main (String[] args) {
		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 2; j++) {
				if (j!=2) {
					System.out.print(i + j + ", ");
				} else 
					System.out.print(i + j + " ");
			}
			System.out.println();
		}
	}
}

