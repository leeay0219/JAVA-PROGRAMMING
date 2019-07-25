package chap06.sec05.exam05;

public class Person {
	static final String NATION = "Korea"; // 고정값 들어가는 final은 static
	final String ssn;
	String name; 
	
	public Person (String ssn, String name) {
		this.ssn = ssn; 
		this.name = name; 
	} // 생성자에서 초기화하여 필드 값 넣어줘야함
}
