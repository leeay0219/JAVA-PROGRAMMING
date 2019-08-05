package exam01;

public class Member {
	String colour; 
	String name; 
	public Member(String colour, String name) {
		this.colour = colour; 
		this.name = name; 
		
	}
	
	public String toString() {
		return (colour + ": " + name); 
	}
}
