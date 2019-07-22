package Algorithm;

public class Algorithm02 {

	public static void main(String[] args) {
		int[] arr = {11, 5, 9, 2, 4, 6};
		
		int first = arr[0]; //Maximum Value
		int second = arr[0];
		int min = arr[0];
		int secondMin = arr[0];
				
		/* for(int i = 0;i < arr.length; i++) {
			if (first < arr[i]) {
				first = arr[i];
			} // max 
				
			else if (second < arr[i] && arr[i] != first) {
				second = arr[i];
			}
			
		}
		*/
		
		for (int i=0; i<arr.length; i++) {
			if (first < arr[i]) {
				second = first; // 최대값 갱신 전에 이전의 최대값 저장
				first = arr[i];  // 최대값 갱신
			}
			else if (second < arr[i] && first > arr[i] || first == second) {
				second = arr[i]; 
			}	
		}
		System.out.println("Max : " + first);
		System.out.println("Second Max : " + second);
		
		for (int i=0; i<arr.length; i++) {
			if (min > arr[i]) {
				secondMin = min; 
				min = arr[i]; 
			}
			if (secondMin > arr[i] && min < arr[i] || min == secondMin) {
				secondMin = arr[i];
			}
		}
		System.out.println("Min : " + min);
		System.out.println("Second Min : " + secondMin);

	}

}
