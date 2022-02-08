package collections;

import java.util.TreeSet;
import java.util.Set;

public class TreeSetDemo {
	public static void main(String[] args) {
		// accessed in natural oreder
		//null not allowed
		Set<String> set = new TreeSet<String>();
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("B");
		System.out.println(set);
		boolean r1 =set.add("teju");
		System.out.println(r1);
		boolean r2 =set.add("TEJU");
		System.out.println(r2);
		System.out.println(set);
		set.contains("A");
	     System.out.println("present");
		set.remove("A");
		System.out.println(set);
		for(String name : set) {
			System.out.println(name);
		
	}
}
}
