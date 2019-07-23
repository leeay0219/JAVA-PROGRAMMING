package chap06.sec03.exam07;

public class CarExample {

	public static void main(String[] args) {
		//부품객체생성
		Engine engine = new Engine("HANWHA", "Gasoline", 5000);
		// System.out.println("engine, company, cc = " + engine.company + " " + engine.fuelType + " " + engine.cc);	
	
		Tire[] tires = {
				new Tire("Hyundai", 5000), 
				new Tire("Hyun", 2000), 
				new Tire("Hyu", 3000), 
				new Tire("Hy", 4000)
				};
//		for (int i=0; i<tires.length; i++) {
//			System.out.println(tires[i].company);
//		}
		
		// 조립
		Car car = new Car("Hyundai", "Grandeur", engine, tires);
		// 조립 확인
		System.out.println("차 회사: " + car.company);
		System.out.println("차 모델: " + car.model);
		System.out.println("엔진 회사: " + car.engine.company);
		System.out.println("엔진 타입: " + car.engine.fuelType);
		System.out.println("엔진 cc: " + car.engine.cc);
		for (int i=0; i<tires.length; i++) {
			System.out.println((i+1) + "번째 타이어 회사: " + car.tires[i].company);
			System.out.println((i+1) + "번째 타이어 크기: " + car.tires[i].size);
		}
		
		//객체 뒤에 만드는 경우도 가능하다 but parameter 이용 하는 것이 더 편리
		Car car1 = new Car();
		car1.company = "Hyundai";
		car1.model = "sm7";
		car1.engine = new Engine("Hanwha", "deisel", 2500);
		car1.tires = new Tire[] { // 필수임! 위에 한번 선언 했기 때문에
			new Tire("Hyundai", 5000), 
			new Tire("Hyun", 2000), 
			new Tire("Hyu", 3000), 
			new Tire("Hy", 4000)
			};
	}
		
}


