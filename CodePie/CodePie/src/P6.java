import java.util.*; 
public class P6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue <String> q = new LinkedList<>(); 
		int t = Integer.parseInt(sc.nextLine()); 
		for (int i=0; i<t; i++) {
			int time = 0; //걸린 시간
			int n = sc.nextInt(); //암기가능한 수
			int w = sc.nextInt(); //단어의 수
			sc.nextLine();
			String s = sc.nextLine(); //w개의 단어 나열
			String[] a = s.split(" ");
			int sumlen = 0;
			int avglen = 0; 
			
			for (int j=0; j<n; j++) {
				q.add(a[j]);
				sumlen += a[j].length();
			}
			avglen = sumlen / n;
			
			for (int j=0; j<n; j++) {
				for (int k=n; k<w; k++) {
					if(q.isEmpty()) {
						q.add(a[k]);
						time += 3;
					} 
					else if (a[j].length() > avglen) {
						q.remove(a[j+1]);
						q.add(a[k]);
						time += 1;				
						if (a[j].equals(a[k]) && !q.isEmpty()) { 
							q.remove(a[j]);
							q.add(a[k]);
							time += 1;
						} else {
							q.remove(a[j]); 
							q.add(a[k]);
							time += 3;
						}
					}
				}
			}	
			System.out.println("Case #" + (i+1));
			System.out.println(time);
			q.clear();
		}
		sc.close();
	}

}
