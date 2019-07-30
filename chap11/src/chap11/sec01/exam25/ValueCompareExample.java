package chap11.sec01.exam25;

public class ValueCompareExample {
	public static void main(String[] args) {
		System.out.println("[-128~127 초과값일 경우]");
		Integer obj1 = 300; 
		Integer obj2 = 300; 
		
		System.out.println("result: " + (obj1 == obj2)); 
		System.out.println("after unboxing: " + (obj1.intValue() == obj2.intValue()));
		System.out.println("equals: " + obj1.equals(obj2)); 
		System.out.println();
		
		System.out.println("[-128~127 범위값일 경우]");
		Integer obj3 = 10; 
		Integer obj4 = 10; 
		System.out.println("result: " + (obj3 == obj4)); 
		System.out.println("after unboxing: " + (obj3.intValue() == obj4.intValue()));
		System.out.println("equals: " + obj3.equals(obj4)); 
		System.out.println();
	}
}
