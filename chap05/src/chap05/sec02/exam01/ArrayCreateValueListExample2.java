package chap05.sec02.exam01;

public class ArrayCreateValueListExample2 {

	public static void main(String[] args) {
		int[] scores; 
		scores = new int[] {83, 90, 87, 75, 93, 83, 88};
		int sum = 0;
		double avg = 0; 
		
		for (int i=0; i<scores.length; i++) { //scores배열 객체에 접근하여 length 데이터를 읽어와라 (.)
			sum += scores[i];
			System.out.println("scores[" + i + "] = " + scores[i]);
		}
		System.out.println("Sum = " + sum);
		
		avg = (double)(sum) / scores.length;
		System.out.println("Avg = " + avg);
		
		String[] names; 
		names = new String[]{"이아영", "남진한", "이주현"};
		
		double[] talls; 
		talls = new double[]{70.5, 73.3, 80.2};
		
		byte[] bytes = {65, 66, 67};
		String str = new String(bytes);
		System.out.println(str);
	}
	
	public static int add(int[]scores) { //method. to operate this method, parameter is needed for mandatory
		int sum = 0; 
		for (int i=0; i<scores.length; i++) {
			System.out.println("scores[" + i + "] = " + scores[i]);
		}
		return sum; 
	}

}
