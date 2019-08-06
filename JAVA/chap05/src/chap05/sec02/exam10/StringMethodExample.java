package chap05.sec02.exam10;

public class StringMethodExample {
	public static void main (String[] args) {
		//문자열에서 특정 위치의 문자 추출
		String ssn = "123456-1234567";
		char c = ssn.charAt(7);
		if (c==0 || c==2) {
			System.out.println("Male");
		} else {
			System.out.println("Female");
		}
		
		//문자열에서 인덱스로 잘라내기
		String ssn1 = "123456-1234567";
		String word1 = ssn1.split("-")[0];
		String word2 = ssn1.split("-")[1]; // for (String word : arr) { System.out.println(word); } 
		
		System.out.println("word1: " + word1);
		System.out.println("word2: " + word2);
		
		String first = ssn1.substring(0, 6); 
		String second = ssn1.substring(7); 
		System.out.println("first: " + first);
		System.out.println("second: " + second);
		
		//문자열 포함 여부
		String sentence = "this program is written by Java";
		boolean isContain = sentence.contains("java");
		System.out.println(isContain);
		
		sentence = sentence.toLowerCase();
		isContain = sentence.contains("java");
		System.out.println(isContain); 
		
		//부분 문자열의 시작 위치 
		String sentence1 = "this program is written by Java";
		int index = sentence1.indexOf(" is");
		System.out.println(index);
		System.out.println(sentence1.substring(0, index)); 
		
		String fileName = "Hello.java";
		int pointIndex = fileName.indexOf(".");
		String fileFirstName = fileName.substring(0, pointIndex);
		String fileExtentionName = fileName.substring(pointIndex+1); 
		System.out.println(fileFirstName);
		System.out.println(fileExtentionName);
		
		String fileName1 = "my.word.file.docx";
		int lastPointIndex = fileName1.lastIndexOf("."); 
		String fileFirstName1 = fileName1.substring(0, lastPointIndex); 
		String fileExtentionName1 = fileName1.substring(lastPointIndex); 
		System.out.println(fileFirstName1);
		System.out.println(fileExtentionName1);
		
		}
	
}


