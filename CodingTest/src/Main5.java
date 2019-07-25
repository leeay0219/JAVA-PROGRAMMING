import java.util.*;

public class Main5 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in); 
		int n = Integer.parseInt(sc.nextLine());
		int m = 0;
		int o = 0;
		System.out.println("숫자입력");	 

		ArrayList <Integer> sort = new ArrayList<Integer>();
		for (int i=0; i<n; i++) {
			sort.add(sc.nextInt());
		}
		//최대값 배열 
		int[] arr = new int[sort.size()];
		for (int i=0; i<sort.size(); i++) {
			arr[i] = ((Integer) sort.get(i).intValue());
		}
		//최소값 배열
		int[] arr2 = new int[sort.size()];
		for (int i=0; i<sort.size(); i++) {
			arr2[i] = ((Integer) sort.get(i).intValue());
		}

		for (int i = 0; i<arr.length; i++) {
			for (int j = i+1; j<arr.length; j++) {
				if (arr[i]<arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp; 
				}
				else if (arr2[i]>arr2[j]) {
					int tmp2 = arr2[j];
					arr2[j] = arr2[i];
					arr2[i] = tmp2; 
				}
			}
			arr[i] *= (Math.pow(10, arr.length-(i+1)));
			m += arr[i];
			arr2[i] *= (Math.pow(10, arr.length-(i+1)));
			o += arr2[i];
		}
		
		System.out.println(m);
		System.out.println(o);
		System.out.println(m+o);
	}
}
		
