package Algorithm;

import java.util.Arrays;

public class Algorithm08 {

	public static void main(String[] args) {
		String[] str = {"student", "java", "ant", "javascript", "company", "ball"};
		String s = null;
		
		for (int i=0; i<str.length-1; i++) {
			for (int k = i+1; k<str.length; k++) {
				if (str[i].compareTo (str[k]) > 0) { // str1.compare(str2) ==> 음수, 0, 양수
					s = str[i]; 
					str[i] = str[k];
					str[k] = s; 
				}
			}
		}
		System.out.println(Arrays.toString(str));
		
		for (int i=0; i<str.length-1; i++) {
			for (int k = i+1; k<str.length; k++) {
				if (str[i].compareTo (str[k]) < 0) { // str1.compare(str2) ==> 음수, 0, 양수
					s = str[i]; 
					str[i] = str[k];
					str[k] = s; 
				}
			}
		}
		System.out.println(Arrays.toString(str));
	}

}
