package Algorithm.BJ;
import java.io.*;
import java.util.*; 
public class Main17_HashMap_Sort {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String s = new String(); 
			
		HashMap <String, Integer> hm = new HashMap<>(); // key: 책이름 value: 등장횟수 (이미 해시맵에 키 있으면 value++, 없으면 새로집어넣고 value를 1로
		
		for (int i=0; i<n; i++) {
			s = sc.nextLine();
			if(!hm.containsKey(s)){
			    hm.put(s, 1);
			}	else {
			    int cnt = hm.get(s);
			    hm.put(s, cnt+1);
			}
		}
		
		int max = 0; 
		for (String str : hm.keySet()) {
			max = Math.max(max, hm.get(str));
		} //Math.max(두 수 중 더큰거 비교), 여기서는 hm의 value값 중 가장 큰 것을 max 에 담음 

		ArrayList<String> a = new ArrayList<>(hm.keySet());
		Collections.sort(a);
		
		for (String str : a) {
			if (hm.get(str) == max) { //소팅한 후에 max값 다시 한번 더 비교하는데 그중에서 가장 최상위 값 받자마자 출력
				System.out.println(str); 
				break; // break 안걸어주면 출력초과뜸 
			}
		}

		sc.close();
	}
}
