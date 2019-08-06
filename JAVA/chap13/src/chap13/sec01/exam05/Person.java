package chap13.sec01.exam05;

public class Person {
	String name; 
	int age;
	double tall; 
	
	public Person(String name, int age, double tall) {
		this.name = name; 
		this.age = age; 
		this.tall = tall;
	}
	
	@Override
	public String toString() {
		return name + "," + age + "," + tall; 
	}
}
