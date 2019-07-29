package InterfaceTest;
import java.util.Scanner; 

public class TestRectangle {
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		
		Rectangle rec = new Rectangle(num1, num2);
		rec.getPerimeter(num1, num2);
		rec.getArea(num1, num2);
		
		sc.close(); 
	}
}
