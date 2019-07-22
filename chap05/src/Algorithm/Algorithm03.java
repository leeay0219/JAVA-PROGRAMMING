package Algorithm;

public class Algorithm03 {

	public static void main(String[] args) {
		int[] arr = {3, 5, 9, 4, 6, 7};
		int sum = 0;
		double avg = 0;

		for (int i=0; i<arr.length; i++) { 
			sum += arr[i];
		}
		System.out.println("Sum = " + sum);
		
		
		avg = (double)(sum) / arr.length;
		System.out.println("Avg = " + avg);
		
		int avg2 = (int)(avg * 1000);
		avg = (int)(avg * 100) / 100.0; 
		
		if (avg2 % 10 >= 5) {
			avg += 0.01;
		}
		//how1
		System.out.println("Avg = " + avg);
		//how2
		System.out.printf("Avg = %.2f\n", avg);
		//how3
		long avg3 = Math.round(avg*100); 
		System.out.println("Avg = " + avg3/100.0);
	}

}
