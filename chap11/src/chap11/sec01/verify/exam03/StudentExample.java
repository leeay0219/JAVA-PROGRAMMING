package chap11.sec01.verify.exam03;
import java.util.*;
public class StudentExample {

	public static void main(String[] args) {
		Map <Student, String> map = new HashMap<>();
		map.put(new Student("1"), "hong");
		map.put(new Student("1"), "hello");
		System.out.println(map.size());
		System.out.println(map.get(new Student("1")));
	}

}