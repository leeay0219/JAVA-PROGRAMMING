package exam10;

public class DoubleFor {

	public static void main(String[] args) {
		int[][] a = {
				{95, 86}, 
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0; 
		double avg = 0.0; 
		
		int count = 0;  
		for (int i = 0; i < a.length; i++) {   
			for (int j = 0; j < a[i].length; j++) {    
				sum += a[i][j];    
				count++;   
			}  
		}  
		avg = (double) sum / count;
		 
		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);
	}

}
