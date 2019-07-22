package Algorithm;

public class Algorithm02 {

	public static void main(String[] args) {
		int[] arr = {10, 5, 9, 2, 4, 6};
		
		int first = arr[0]; //Maximum Value
		int second = arr[0];
				
		for(int i = 0;i < arr.length; i++) {
			if (first < arr[i]) {
				first = arr[i];
			} // max 
				
			else if (second < arr[i] && arr[i] != first) {
				second = arr[i];
			}
			
		}
					
		System.out.println("Second Max : " + second);

	}

}
