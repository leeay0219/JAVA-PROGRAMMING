package chap05.sec02.exam08;
import java.util.Arrays;

public class ArrayCopyByForExample {

	public static void main(String[] args) {
		int[] oldIntArray = {1, 2, 3};
		int[] newIntArray = new int[5]; 
		
		for (int i=0; i<oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		}
		
		for (int i=0; i<newIntArray.length; i++) {
			if (i==newIntArray.length-1) {
				System.out.print(newIntArray[i]); 
			}
			else 
				System.out.print(newIntArray[i] + ","); 
		}
		
		System.out.println(); 
		
		for (int i=0; i<newIntArray.length; i++) {
			if (i==newIntArray.length-1) {
				System.out.print(Arrays.toString(newIntArray));
			}
		}
		
	}

}
