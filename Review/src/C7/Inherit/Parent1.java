package C7.Inherit;

public class Parent1 {
	public String nation; 
	public Parent1() {
		this("Korea");
		System.out.println("Parent() call");
	}
	
	public Parent1(String nation) {
		this.nation = nation; 
		System.out.println("Parent(String nation) call");
	}
}
