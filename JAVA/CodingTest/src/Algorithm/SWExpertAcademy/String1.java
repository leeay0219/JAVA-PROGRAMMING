package Algorithm.SWExpertAcademy;
import java.io.*;
public class String1 {

	public static void main(java.lang.String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] num = new int[10];
		String[] n = new String[10];
		String s;
 		
		for (int i=1; i<=10; i++) {
			num[i] = Integer.parseInt(br.readLine()); 
			n[i] = br.readLine();
			s = new String(br.readLine());
			s = s.replaceAll(n[i], "1");
			int count = 0;
			
			for (int j=0; j<s.length(); j++) {
				if (s.charAt(j) == '1') {
					count++;
				}
			}

			System.out.println("#" + i + " " + count); 
		}
		
		br.close();
	}
}

