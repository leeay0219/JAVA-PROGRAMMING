package InterfaceTest;

public class Rectangle implements Measurable{
	
	private double width;
	private double height; 
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height; 
	}

	@Override
	public void getPerimeter(double width, double height) {
		System.out.println("Perimeter: " + (width+height)*2);
	}

	@Override
	public void getArea(double width, double height) {
		System.out.println("Area: " + width*height);
	}
}
