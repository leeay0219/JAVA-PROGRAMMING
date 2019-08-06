package chap05.sec02.exam03;

public class ArrayCreateByNewExample {

	public static void main(String[] args) {
		int[] arr1 = new int[3]; // = int[] arr1 = {0, 0, 0};
			for (int i=0; i<arr1.length; i++) {
				System.out.println("arr1 [" + i + "] : " + arr1[i]);
			}
			arr1[0] = 10; 
			arr1[1] = 20; 
			arr1[2] = 30; 
				for (int i=0; i<arr1.length; i++) {
					System.out.println("arr1 [" + i + "] : " + arr1[i]);
				}
			
		double[] arr2 = new double[3]; 
			for (int i=0; i<arr2.length; i++) {
				System.out.println("arr2 [" + i + "] : " + arr2[i]);
			}
			arr2[0] = 0.1; 
			arr2[1] = 0.2; 
			arr2[2] = 0.3; 
				for (int i=0; i<arr2.length; i++) {
					System.out.println("arr2 [" + i + "] : " + arr2[i]);
				}
		
		boolean[] arr3 = new boolean[3];
			for (int i=0; i<arr3.length; i++) {
				System.out.println("arr3 [" + i + "] : " + arr3[i]);
			}
			arr3[0] = true; 
			arr3[1] = false; 
			arr3[2] = true; 
				for (int i=0; i<arr3.length; i++) {
					System.out.println("arr3 [" + i + "] : " + arr3[i]);
				}
			
		String[] arr4 = new String[3];
			for (int i=0; i<arr4.length; i++) { 
				System.out.println("arr4 [" + i + "] : " + arr4[i]);
			}
			arr4[0] = "이";
			arr4[1] = "이아";
			arr4[2] = "이아영"; //객체를 참조하여 "이아영" 불러오기 // 바로 값 저장되는 것 아니다 (기본 type 배열은 곧바로 저장, 나머지는 참조)
				for (int i=0; i<arr4.length; i++) {
					System.out.println("arr4 [" + i + "] : " + arr4[i]);
				}
		
	}

}
