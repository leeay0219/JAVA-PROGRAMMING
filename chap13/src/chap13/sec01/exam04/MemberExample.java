package chap13.sec01.exam04;

import java.util.HashSet;
import java.util.Set;

public class MemberExample {

	public static void main(String[] args) {
		Set<Member>set = new HashSet<>(); 
		set.add(new Member ("user"));
		set.add(new Member("user"));
		System.out.println(set.size());
	}

}
