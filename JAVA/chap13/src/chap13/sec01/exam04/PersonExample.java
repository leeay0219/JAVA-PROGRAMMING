package chap13.sec01.exam04;

import java.util.*;

public class PersonExample {

	public static void main(String[] args) {
		Set <Person> set = new TreeSet<>(new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return -Integer.compare(o1.age, o2.age); //-붙이면 나이내림차순, 안붙이면 오름차순
			}});
		
		set.add(new Person("hong", 25, 170.5)); 
		set.add(new Person("hon", 22, 170.5)); 
		set.add(new Person("ho", 27, 170.5)); 
		set.add(new Person("h", 24, 170.5)); 
		
		for (Person p : set) {
			System.out.println(p); 
		}
	}

}
