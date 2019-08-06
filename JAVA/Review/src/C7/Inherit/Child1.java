package C7.Inherit;

public class Child1 extends Parent1 {
	private String name; 
	
	public Child1() {
		this("ahyeong"); 
		System.out.println("Child() call");
	}
	
	public Child1(String name) {
		this.name = name; 
		System.out.println("Child(String name) call");
	}

}
