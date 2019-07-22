package Algorithm;
import java.util.Arrays; 

public class Algorithm09 {

	public static void main(String[] args) {
		int[][] arr1 = {
				{1 , 2},
				{3 , 4}, 
				{5 , 6} 
		};
		
		int[][] arr2 = {
				{10, 20, 30, 40},
				{30, 40, 50, 80} 
		};
		
		int[][] result = new int[arr1.length][arr2[0].length]; 
		
		for (int i=0; i<result.length; i++) { // result의 행의 수 == arr1.length
			for (int j=0; j<result[i].length; j++) { //result의 열의 수 // arr2[0].length
				for (int k=0; k<arr1[0].length; k++) { //arr1의 열 수 or arr2의 행 수
					result[i][j] += arr1[i][k]*arr2[k][j]; //result의 행렬값 += arr1[result의 행][arr1의 열] * arr2[arr2의 행][result의 열]
				} 
				System.out.println("result [" + i + "][" + j + "] = " + result[i][j]);
			}
		}
		
		System.out.println("=============================");
		
//		System.out.println("{");
//		for (int i=0; i<result.length; i++) {
//			System.out.print("{");
//			for (int j=0; j<result[i].length; j++) {
//				if (j==1) {
//					System.out.print(result[i][j]);
//				} else 
//					System.out.print(result[i][j] + ", \t");
//			}
//			if (i==0) {
//			System.out.println("},"); 
//			} else 
//				System.out.println("}"); 
//		}
//		System.out.println("};");
		
		for (int i=0; i<result.length; i++) {
			for (int j=0; j<result[i].length; j++) {
				System.out.print(result[i][j] + "\t");
			}
			System.out.println(); 
		} 
	 
	}
}
