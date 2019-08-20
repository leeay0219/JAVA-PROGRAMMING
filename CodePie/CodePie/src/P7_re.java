import java.util.*; 
public class P7_re {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
		
		String[] contour = new String[t];
		
		for (int i=0; i<t; i++) {
			contour[i] = sc.nextLine(); 
		}
		
		for (int i=0; i<t; i++) {
			int cal = 0;
			int stair = 0; 
			boolean scarp = false; 
			char[] ch = contour[i].toCharArray();
			for (char c : ch) {
				if (c == '(') {
					stair++;
					if (scarp) {
						cal += stair*2;
					} else {
						cal += stair;
					}
				} else if (c == ')') {
					if (scarp) {
						cal += stair*2;
					} else {
						cal += stair;
					}
					stair--;
				} else if (c == '#') {
					scarp = !scarp; 
				}
			}
			System.out.println("Case #" + (i+1));
			System.out.println(cal);
		}
		sc.close();
	}
}