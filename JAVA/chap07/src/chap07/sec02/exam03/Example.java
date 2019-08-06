package chap07.sec02.exam03;

public class Example {

	public static void main(String[] args) {
		//필드 다형성 테스트
		Car car = new Car(); 
		//실행방법
		car.run();
		//부품교환
		car.t2 = new HankookTire();
		car.t3 = new KumhoTire();
		//실행방법
		car.run(); 
	
		//매개변수 다형성 테스트
		Car car2 = new Car();
		car2.run(new Tire());
		car2.run(new HankookTire()); // 자식 객체는 부모 타입에 대입 가능
		car2.run(new KumhoTire());
	}

}
