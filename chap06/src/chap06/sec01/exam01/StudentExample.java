package chap06.sec01.exam01;

public class StudentExample {

	public static void main(String[] args) {
		Student s1 = new Student(); 
		System.out.println("s1 변수가 Student 객체를 참조합니다");
		System.out.println(s1); //객체 생성되는 번지
		Student s2 = new Student(); 
		System.out.println("s2 변수가 또 다른 Student 객체를 참조합니다");
		System.out.println(s2); //객체 생성되는 번지
		Teacher t1 = new Teacher();
		System.out.println("t1 변수가 Teacher 객체를 참조합니다");
		System.out.println(t1); //객체 생성되는 번지
		Teacher t2 = new Teacher();
		System.out.println("t2 변수가 또 다른 Teacher 객체를 참조합니다");
		System.out.println(t2); //객체 생성되는 번지
	}

}