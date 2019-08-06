package chap13.sec01.exam05;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeExample {
	public static void main(String[]args) {
		Map<String,String> map = new TreeMap<>();
		map.put("a", "hong");
		map.put("b", "hon");
		map.put("c", "ho");
		map.put("d", "h");
		
		for (Entry<String, String> entry : map.entrySet()) {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + ":" + value);
		}
		
//		Map<Member, String> map2 = new TreeMap<>();
//		map2.put(new Member("user2"), "hong");
//		map2.put(new Member("user3"), "hog");
//		map2.put(new Member("user1"), "ho");
//		
//		
//		for (Entry<Member, String> entry : map2.entrySet()) {
//			Member key = entry.getKey();
//			String value = entry.getValue();
//			System.out.println(key + ":" + value);
//		}
////		
////		Map<Person, Double> map3 = new TreeMap<>(new Comparator<Person>() {
////
////			@Override
////			public int compare(Person o1, Person o2) {
////				return Double.compare(o1.tall, o2.tall);
////			}
////			
////		});
//	
		
	}
}
