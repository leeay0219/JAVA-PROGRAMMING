package chap11.sec01.exam09;

public class ResourcePathExample {
	public static void main(String[]args) {
		Class carClass = Car.class;
		String photo1Path = carClass.getResource("auto1.jpg").getPath(); // 상대경로로 접근할 때 getPath 붙이면 
		String photo2Path = carClass.getResource("images/auto2.jpg").getPath(); // 상대경로로 접근할 때 getPath 붙이면 
		
		System.out.println(photo1Path);
		System.out.println(photo2Path);
	}
}
