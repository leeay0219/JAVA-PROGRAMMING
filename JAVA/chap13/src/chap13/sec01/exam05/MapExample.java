package chap13.sec01.exam05;
import java.util.*;
import java.util.Map.Entry; 
public class MapExample {

	public static void main(String[] args) {
		Map<Integer, String> map = new TreeMap<>();
		map.put(10, "hello"); 
		map.put(11, "hong"); 
		map.put(10, "ho"); 
		map.put(33, "h");
		System.out.println(map.size()); 
		
		String name = map.get(10);
		System.out.println(name); 
		
		for (Entry<Integer, String> entry : map.entrySet()) {
			int key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + ": " + value);
		}
		
		for (int key : map.keySet()) {
			String value = map.get(key);
			System.out.println(key + ": " + value);
		}
		
		for (String value : map.values()) {
			System.out.println(value);
		}
		
		map.remove(11);
		System.out.println(map.size()); 
		
		map.clear();
		System.out.println(map.size()); 
	}

}
