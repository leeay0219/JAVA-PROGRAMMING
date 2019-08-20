import java.util.*; 
public class P10 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int t = Integer.parseInt(sc.nextLine());
		int[] result = new int[t];
		
		for (int i=0; i<t; i++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int q = sc.nextInt();
			int[][] a = new int[n][m]; 
			int[] sum = new int[n];
			
			int b = 1;
			for (int j=0; j<n; j++) {
				for (int k=0; k<m; k++) {
					a[j][k] = b; 
					b++; 
				} //값들 저장시키기 (1~n*m)
			}
			
			for (int j=0; j<q; j++) {
				int ax = sc.nextInt()-1;
				int ay = sc.nextInt()-1;
				int bx = sc.nextInt()-1;
				int by = sc.nextInt()-1;
				int height = sc.nextInt();
				int width = sc.nextInt();
				
				for (int k=0; k<height; k++) { //상대위치 이동 위한 height과 width 값 더한 범위
					for (int l=0; l<width; l++) {
						int tmp = a[ax+k][ay+l]; //기존값 tmp에 저장
						a[ax+k][ay+l] = a[bx+k][by+l]; //기존값에 변경값 넣어주기
						a[bx+k][by+l] = tmp; //기존값 저장했던 tmp를 변경값 있던 배열에 넣어주기
					}
				} //위치변환. -1은 인덱스 0부터 시작하니까 빼줘야함
			}
			
			for (int j=0; j<n; j++) {
				for (int k=0; k<m; k++) {
					sum[j] += a[j][k]; //각 행 별 합 sum 배열에저장
				}
			}
			Arrays.sort(sum); //sum 배열 sorting
			result[i] = sum[n-1]; //sorting한 가장 마지막 값(최대) = n-1번째 인덱스의 값
			
			System.out.println("Case #" + (i+1));
			System.out.println(result[i]);
		}
		sc.close(); 
	}
}
