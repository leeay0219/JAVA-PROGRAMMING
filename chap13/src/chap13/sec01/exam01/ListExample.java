package chap13.sec01.exam01;
import java.util.*; 
public class ListExample {

	public static void main(String[] args) {
		List <String> list = new ArrayList<>();
		list.add("lee");
		list.add("Ah");
		list.add("Yeong");
		
		String name1 = list.get(0);
		String name2 = list.get(1);
		String name3 = list.get(2);
		
		for (String str : list) {
			System.out.println(str);
		}
		
		list.remove(0);
		list.remove(1);
		
		for (String str : list) {
			System.out.println(str);
		}
		
	} 

}
