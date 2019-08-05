package chap13.sec01.exam04;
import java.util.*;
public class SetExample {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>(); 
		set.add("hong");
		set.add("lee");
		set.add("dong");
		set.add(new String("lee"));
		System.out.println(set.size());
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String str = iterator.next(); 
			System.out.println(str);
			iterator.remove();
		}
		System.out.println(set.size());
		
		for (String str : set) {
			System.out.println(str); 
		}
	}

}
