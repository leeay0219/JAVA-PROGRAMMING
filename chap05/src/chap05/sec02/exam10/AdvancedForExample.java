package chap05.sec02.exam10;

public class AdvancedForExample {

	public static void main(String[] args) {
		int[] scores = {95, 71, 84, 93, 87};
		int sum = 0; 
		for (int score : scores) {
			sum+= score;
		}
		System.out.println("Sum = " + sum);
		
		double avg = (double)sum / scores.length; 
		System.out.println("Avg = " + avg); 
	} 

}
