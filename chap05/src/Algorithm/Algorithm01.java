package Algorithm;

public class Algorithm01 {

	public static void main(String[] args) {
		int[] arr = {3, 5, 9, 2, 4, 6};
		
//		int max = arr[0]; //Maximum Value
//		int min = arr[0]; // Minimum Value
//				
//		for(int i = 0;i < arr.length; i++) {
//		    if(max < arr[i]) {
//		    	max = arr[i];
//		    }
//					
//		    if(min > arr[i]) {
//		    	min = arr[i];
//		    	
//		    }
//		}
//				
//		System.out.println("Max : " + max);
//		System.out.println("Min : " + min);
		
		int max = arr[0];
		int min = arr[0];
		
		for (int i=0; i<arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i]; 
			}
			
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println(min + ", " + max); 

	}

}
