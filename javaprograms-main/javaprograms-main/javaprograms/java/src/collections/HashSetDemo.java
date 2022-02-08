package collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		// accessed randomly
		//null allowed
		Set<String> set = new HashSet<String>();
	
		set.add("vathi");
		set.add("manu");
		set.add("vedhu");
		set.add(null);
		
		boolean r1 =set.add("vedha");
		System.out.println(r1);
		boolean r2 =set.add("vedha");
		System.out.println(r2);
		System.out.println(set);
		set.contains("vathi");
	     System.out.println("present");
		set.remove("vathi");
		System.out.println(set);
		for(String name : set) {
			System.out.println(name);
		}
		

	}

}
