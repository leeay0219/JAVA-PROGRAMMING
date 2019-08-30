package Algorithm.BJ;

import java.util.*;

public class Main38 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		HashMap<String,String> animal = new HashMap<>();
		int t=Integer.parseInt(sc.nextLine());
		for(int i=0;i<t;i++) {
			boolean run = true;
			String s = sc.nextLine();
			String[] a = s.split(" ");
			
			while(run) {
				String word=sc.nextLine();
				String[] cry=word.split(" ");
				if (!cry[1].equals("goes")) {
					run = false;
				} else {
					animal.put(cry[0], cry[2]);
				}
			}
			
			for(int j=0;j<a.length;j++) {
				if(!animal.containsValue(a[j])) {
					System.out.print(a[j]+" ");
				}
			}
			System.out.println();
		}
		sc.close();
	}
}


