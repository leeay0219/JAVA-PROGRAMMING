package chap09.sec02.exam01;

public class Anonymous {
	Person field = new Person() { //익명객체는 생성자 안만드는 것이 원칙임
		String name = "Ah Yeong";  // 생성자가 없어서 필드에서 세팅함 *외부값 받아서 하는거 불가능하니까
		void work() {
			System.out.println(name + " Goes for work");
		}
		@Override //익명객체: 필요하다면 재정의 하라는 것에서 이용
		void wake() {
			System.out.println(name + " Wakes up at 6");
			work();
		}
	};
	
	void method1() {
		Person localVar = new Person() { //상속, 자식객체 만듦 
			void walk() {
				System.out.println("Go for walk");
			}
			@Override
			void wake() {
				System.out.println("Wake up at 7");
			}
		};
		localVar.wake();
	}
	
	void method2(Person person) {
		person.wake();
	}
}
