package chap07.sec02.exam04;

class Point{
	private int x, y; 
	public void set(int x, int y) {
		this.x = x; 
		this.y = y; 
	}
	public void showPoint() {
		System.out.println("(x: " + x + " y: " + y + ")");
	}
}

class ColorPoint extends Point {
	private String colour; 
	public void setColour(String colour) {
		this.colour = colour;
	}
	public void showColourPoint() {
		System.out.println(colour); 
		showPoint();
	}
}

class ColourPoint {
	public static void main(String[]args) {
		Point p = new Point(); 
		p.set(10, 15);
		p.showPoint();
		
		ColorPoint cp = new ColorPoint(); 
		cp.set(15,30);
		cp.setColour("Green");
		cp.showColourPoint();
	}
}

