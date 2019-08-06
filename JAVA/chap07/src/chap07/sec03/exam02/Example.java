package chap07.sec03.exam02;

public class Example {

	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.sound();
		
		Dog dog = new Dog();
		dog.sound();
		
		Animal animal = cat;
		animal.sound();
		
		animal = dog; 
		animal.sound();
		
		method(dog);
		method(cat);
	}
	
	public static  void method(Animal animal) {
		animal.sound();
	}

}
