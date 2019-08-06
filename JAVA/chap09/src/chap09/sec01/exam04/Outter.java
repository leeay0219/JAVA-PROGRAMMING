package chap09.sec01.exam04;

public class Outter {
	void method1(int v1) { //==final int v1 (java7이하에서는 final선언필수)
		int v2 = 1; 
		int v3 = v2; 
		v3 = 10; //바꿀수없는 v2값을 v3에 담아두는 trick
		
		class Inner {
			//int v1 = v1; //보이지 않는 필드에 위에 선언해주었던 변수 재선언
			//int v2 = v2; 
			void method2() {
				int result = v1 + v2; //snapshot을 어떻게 가지고 있는지 확인 
			}
		}
		
		System.out.println(v1); 
		System.out.println(v2);
		
		Inner obj = new Inner(); //객체가 계속 실행되어도 쓰레기 객체 안될수도있음
		obj.method2();
	}
}
