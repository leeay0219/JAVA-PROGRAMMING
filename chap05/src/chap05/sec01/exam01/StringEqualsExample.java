package chap05.sec01.exam01;
import java.util.Scanner; 

public class StringEqualsExample {

	public static void main(String[] args) {
		String strVar1 = "신민철";
		String strVar2 = "신민철";
		
		if (strVar1 == strVar2) { //참조같음
			System.out.println("참조 같음");
		} else System.out.println("참조 다름");
		
		if (strVar1.equals(strVar2)) { //문자열같음
			System.out.println("문자열 같음");
		}
		
		String strVar3 = new String("신민철");
		String strVar4 = new String("신민철");
		
		if (strVar3 == strVar4) { //참조다름
			System.out.println("참조 같음");
		} else System.out.println("참조 다름");
		
		if (strVar3.equals(strVar4)) { //문자열같음
			System.out.println("문자열 같음");
		}
		
		if (strVar3 == strVar1) {  //참조다름
			System.out.println("참조 같음"); 
		} else 	System.out.println("참조 다름"); 
		
		if (strVar3.equals(strVar1)) { //문자열같음
			System.out.println("문자열 같음"); 
		}
		
	}

}
