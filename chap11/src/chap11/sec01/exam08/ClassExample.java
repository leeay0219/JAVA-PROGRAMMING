package chap11.sec01.exam08;

public class ClassExample {

	public static void main(String[] args) throws Exception {
		Class clas1 = Class.forName("chap11.sec01.exam08.ClassExample"); 
		Class clas2 = Class.forName("chap11.sec01.exam08.ClassExample"); 
		ClassExample obj = new ClassExample();
		Class clas3 = obj.getClass();
		
		System.out.println(clas1.getName());
		System.out.println(clas1.getSimpleName());
		System.out.println(clas1.getPackage().getName());
		
	}

}
