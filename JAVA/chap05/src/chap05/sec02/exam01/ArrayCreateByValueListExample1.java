package chap05.sec02.exam01;

public class ArrayCreateByValueListExample1 {

	public static void main(String[] args) {
		int[] scores = {83, 90, 87};
		int sum = 0; 
		double avg = 0; 
		
		for (int i=0; i<scores.length; i++) { //scores배열 객체에 접근하여 length 데이터를 읽어와라 (.)
			sum += scores[i];
			System.out.println("scores[" + i + "] = " + scores[i]);
		}
		System.out.println("Sum = " + sum);
		avg = (double)(sum) / scores.length;
		System.out.println("Avg = " + avg);
	}
}
