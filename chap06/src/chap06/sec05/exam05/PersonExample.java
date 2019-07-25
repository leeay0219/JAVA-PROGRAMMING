package chap06.sec05.exam05;

public class PersonExample {

	public static void main(String[] args) {
		Person p1 = new Person("123456-1234567", "Ah Yeong Lee");
		System.out.println(Person.NATION);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		// p1.nation = "usa";
		// p1.ssn = ~;
		p1.name = "남진한";
		System.out.println(p1.name); 
		double area = 10 * 10 * Math.PI;
	}

}
