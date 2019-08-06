package chap05.sec02.exam06;

public class ArrayInArrayExample {

	public static void main(String[] args) {
		
		//행렬 지정 (2 x 3 Matrix) 
		int[][] mathScores = new int[2][3]; 
		for (int r=0; r<mathScores.length; r++) {
			for (int c=0; c<mathScores[r].length; c++) {
				System.out.println("mathScores[" + r + "][" + c + "]=" + mathScores[r][c]);
			}
		}
		System.out.println();
		System.out.println();
		
		//참조
		int[][] mathScores1 = {{0, 0, 0},{0, 0, 0}}; // = int[2][3] 길이 2짜리 1차원 변수 참조 -> 길이 3짜리 배열 생성 -> 참조하는 배열 길이
		int[][] mathScores2 = {{95, 80},{92, 96, 80}};
		System.out.println(mathScores1.length); // 요소 수가 아닌 행 수로 length 결정
		System.out.println(mathScores1[0].length); // 0행의 길이
		System.out.println(mathScores2[0][0]);
		
		//계단식1
		int[][] englishScores = new int[2][]; // 두번째 인덱스는 결정할 수 없을 때
		englishScores[0] = new int[2]; //길이 2짜리 배열 첫째줄 행에 추가
		englishScores[1] = new int[3]; //길이 3짜리 배열 둘째줄 행에 추가 
		for (int r=0; r<englishScores.length; r++) {
			for (int c = 0; c<englishScores[r].length; c++) {
				System.out.println("englishScores[" + r + "][" + c + "]=" + englishScores[r][c]);
			}
		}
		System.out.println();
		System.out.println();
		
		//계단식2
		int[][] javaScores = {{95, 80},{92, 96, 80}}; 
		for (int r=0; r<javaScores.length; r++) {
			for (int c = 0; c<javaScores[r].length; c++) {
				System.out.println("javaScores[" + r + "][" + c + "]=" + javaScores[r][c]);
			}
		}

	}

}
