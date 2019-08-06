package chap04.sec01.exam06;
import java.util.Scanner; 

public class SwitchNoBreakCaseExample {

	public static void main(String[] args) {
		
		boolean run = true; 
		int studentNum = 0; 
		int[] scores = null;
		int max = 0;
		double avg = 0;
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while (run) {
			System.out.println("---------------------------------------------------");
			System.out.println("1. 학생수 2. 점수입력 3. 점수리스트 4. 분석 5. 종료");
			System.out.println("---------------------------------------------------");
			System.out.println("선택>");
			
			int selectNo = Integer.parseInt(sc.nextLine());
			
			if (selectNo == 1) {
				System.out.println("학생수>");
				studentNum = Integer.parseInt(sc.nextLine());
				scores = new int[studentNum];
			} else if (selectNo == 2) {
				for (int i=0; i<studentNum; i++) {
					System.out.println("scores[" + i + "] >");
					scores[i] = Integer.parseInt(sc.nextLine());
				}
			} else if (selectNo == 3) {
				for (int i=0; i<selectNo; i++) {
					System.out.println("scores[" + i + "] >" + scores[i]);
				}	
			} else if (selectNo == 4) {
				for (int i = 0; i < scores.length; i++) {
					if (max < scores[i]) {
						max = scores[i];
					}
					sum += scores[i];
				}
				
				avg = ((double)(sum)/scores.length);
				System.out.println("최고 점수: " + max);
				System.out.println("평균 점수: " + avg);
			} else if (selectNo == 5) {
				run = false; 
				break;
			}
			
		}
		
		System.out.println ("프로그램 종료");
	} 

}

