package chap11.sec01.exam02;

import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap <String, String> hm = new HashMap<>();
		hm.put("name", "Ahyeong");
		hm.put("city", "Seoul");
		hm.put(new String("city"), "Busan"); 
		
		HashMap <Key, String> map = new HashMap<>();
		map.put(new Key(1), "hello"); 
		map.put(new Key(2), "world"); 
		
		System.out.println(hm.size()); 
		System.out.println(hm.get("name"));
		System.out.println(hm.get("city"));
		System.out.println("city" == new String("city"));
		System.out.println("city".hashCode());
		
		
		
	}

}
