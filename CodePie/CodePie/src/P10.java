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
				} //���� �����Ű�� (1~n*m)
			}
			
			for (int j=0; j<q; j++) {
				int ax = sc.nextInt()-1;
				int ay = sc.nextInt()-1;
				int bx = sc.nextInt()-1;
				int by = sc.nextInt()-1;
				int height = sc.nextInt();
				int width = sc.nextInt();
				
				for (int k=0; k<height; k++) { //�����ġ �̵� ���� height�� width �� ���� ����
					for (int l=0; l<width; l++) {
						int tmp = a[ax+k][ay+l]; //������ tmp�� ����
						a[ax+k][ay+l] = a[bx+k][by+l]; //�������� ���氪 �־��ֱ�
						a[bx+k][by+l] = tmp; //������ �����ߴ� tmp�� ���氪 �ִ� �迭�� �־��ֱ�
					}
				} //��ġ��ȯ. -1�� �ε��� 0���� �����ϴϱ� �������
			}
			
			for (int j=0; j<n; j++) {
				for (int k=0; k<m; k++) {
					sum[j] += a[j][k]; //�� �� �� �� sum �迭������
				}
			}
			Arrays.sort(sum); //sum �迭 sorting
			result[i] = sum[n-1]; //sorting�� ���� ������ ��(�ִ�) = n-1��° �ε����� ��
			
			System.out.println("Case #" + (i+1));
			System.out.println(result[i]);
		}
		sc.close(); 
	}
}
