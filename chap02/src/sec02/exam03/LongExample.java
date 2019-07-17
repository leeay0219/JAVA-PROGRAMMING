package sec02.exam03;

public class LongExample {

	public static void main(String[] args) {
		long v1 = 10;
		long v2 = 20L; 
		long v3 = 3000000000L; // 기본적으로 컴파일러는 정수리터럴을 int 타입으로 간주하여 이 이상 되면 L붙여 롱타입임을 알려주어야함
		System.out.println (v1+v2+v3);

	}

}
