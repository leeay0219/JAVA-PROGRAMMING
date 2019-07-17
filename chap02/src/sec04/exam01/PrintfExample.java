package sec04.exam01;

public class PrintfExample {

	public static void main(String[] args) {
		int value = 12;
		System.out.printf("Cost: %dwon\n", value); // default
		System.out.printf("Cost: %6dwon\n", value); // cipher (width)
		System.out.printf("Cost: %-6dwon\n", value); // flags => sorting on left side , else sorting right
		System.out.printf("Cost: %06dwon\n", value); // fill empty space with 0
		
		double area = 3.14159 * 10 * 10;
		System.out.printf("Area of circle with radius of %d is %10.2f", 10, area);
		String name = "Ellen";
		String job = "Engineer";
		System.out.printf("\n%6d | %-10s | %10s\n", 1, name, job);
		System.out.printf("%s year %d month %d day", "2019", 7, 17);
	}

}
