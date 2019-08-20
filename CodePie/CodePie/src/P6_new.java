import java.util.*; 
public class P6_new {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = Integer.parseInt(sc.nextLine());
		
		int[] n = new int [t];
		int[] w = new int [t];
		List <String>[] list1 = new List[t]; 
		List <String>[] list2 = new List[t];
		
		for (int i=0; i<t; i++) {
			String s = sc.nextLine();
			String[] a = s.split(" ");
			n[i] = Integer.parseInt(a[0]);
			w[i] = Integer.parseInt(a[1]);
			
			list1[i] = new ArrayList<String>();
			
			String ss = sc.nextLine();
			String[] aa = ss.split(" "); 
			for (String word : aa) {
				list2[i].add(word);
			}
		}
		
		for (int i=0; i<t; i++) {
			System.out.println("Case #" + (i+1)); 
			int time = 0; 
			while (!list2[i].isEmpty()) {
				String s = list2[i].remove(0);
				if (list1[i].contains(s)) {
					//암기단어일경우
					list1[i].remove(s); 
					list1[i].add(s);
					time += 1;
				} else {
					//암기단어가 아닐경우
					if(list2[i].size() < n[i]) {
						//암기단어수가덜차있을때
						list2[i].add(s);
					} else {
						//이미다차있을때
						int sumlen = 0; 
						for (int k = 0; k < n[i]; k++) {
							String ss = list2[i].get(k);
							sumlen += ss.length(); 
						}
						double avglen = (double)sumlen / n[i]; 
						int idx = 0; 
						for (int k=0; k<n[i]; k++) {
							if (avglen >= list2[i].get(k).length()) {
								idx = k;
								break;
							}
						}
						list2[i].remove(idx);
						list2[i].add(s); 
					}
					time += 3; 
				}
			}
			System.out.println(time);
		}
	}
}
