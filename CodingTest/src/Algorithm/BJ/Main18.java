package Algorithm.BJ;
import java.util.*; 

public class Main18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
//		ArrayList <Integer> list = new ArrayList<>();
//		
//		for (int i=0; i<s.length(); i++) { //문자열 길이만큼 
//			list.add(Integer.valueOf(s.charAt(i))); //list에 s의 각 문자별 아스키코드값 추가
//		}
//		//list에 저장되어있는 아스키코드값을 기반으로
//		for (int i = 97; i<=122; i++) { //소문자 a~z까지 
//			System.out.print(list.indexOf(i) + " "); //list에 올라가있는 수 중 각 알파벳 해당하는 수의 index 출력. 없으면 자동적으로 -1
//		}
//		sc.close(); 
		
		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.print(s.indexOf(ch) + " ");
		}
	}

}
