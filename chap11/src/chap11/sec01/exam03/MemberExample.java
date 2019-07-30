package chap11.sec01.exam03;

import java.util.HashMap;
import java.util.Map;

public class MemberExample {

	public static void main(String[] args) {
		Map<Member, String> map = new HashMap<>();
		map.put(new Member("user1"), "hong");
		map.put(new Member("user2"), "lee");
		map.put(new Member("user1"), "kim");
		System.out.println(map.size()); 
	}

}
