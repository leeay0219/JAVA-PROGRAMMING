package chap06.sec06.com.hanwha.ict.project.pack1;

public class Car {
	Engine engine = new Engine(); 
	Tire tire;
	
	void test() {
		System.out.println(engine.company);
		engine.run(); 
	}
}


