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
<<<<<<< HEAD
				second = first; // ìµœëŒ€ê°’ ê°±ì‹  ì „ì— ì´ì „ì˜ ìµœëŒ€ê°’ ì €ìž¥
				first = arr[i];  // ìµœëŒ€ê°’ ê°±ì‹ 
=======
				second = first; // ÃÖ´ë°ª °»½Å Àü¿¡ ÀÌÀüÀÇ ÃÖ´ë°ª ÀúÀå
				first = arr[i];  // ÃÖ´ë°ª °»½Å
>>>>>>> 1f0b33131b45db0d2d522cac64118fc5a477d142
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
