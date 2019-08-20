 
public class StringExam01 {

	public static void main(String[] args) {
		String str1 = "ABCDE"; 
		String str2 = "A B C D E";
		
		//str1
		//substring()
		for (int i=0; i<str1.length(); i++) {
			String s = str1.substring(i, i+1);
			System.out.println(s);
		}
		
		//toCharArray
		char[] arr1 = str1.toCharArray();
		for (int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
		//split()은 구분자가 없으니까 이용하지 않음
		
		//str2
		//split()만 이용
		String[] a = str1.split(" ");
		for (int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		
		String str3 = "10 20,30 40"; 
		String[] a1 = str3.split(",");
		int sum = 0; 
		for (int i=0; i<a1.length; i++) {
			String[] a2 = a1[i].split(" ");
			for (int k=0; k<a2.length; k++) {
				int value = Integer.parseInt(a2[k]);
				sum += value; 
			}
			
		}
		System.out.println(sum);
	}
}
