package chap10.sec01.exam05;

public class Example {
	public static void main (String[]args) {
		Cat cat = new Cat(); 
		changeDog(cat); 
	}
	public static void changeDog(Animal animal) {
		if (animal instanceof Dog) {
			Dog dog = (Dog) animal;
		} else {
			System.out.println("Can't be changed to Dog");
		}
		
		try {
			Dog dog = (Dog) animal; 
		} catch(Exception e) {
			System.out.println("Can't be changed to Dog"); 
		}
	}
}
