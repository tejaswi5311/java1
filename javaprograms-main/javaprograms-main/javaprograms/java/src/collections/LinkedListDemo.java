package collections;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		//cannot access randomly
		LinkedList<String> List = new LinkedList<String>();
		List.add("vedha");
		List.add("vedhu");
		List.add("D");
		System.out.println(List);
		
		
		List.addFirst("manu");
		System.out.println(List);
		
		
		List.add(2, "vathi");
		System.out.println(List);
		
		
		List.remove(2);
		System.out.println(List);
		
		
		List.remove("D");
		List.removeLast();
		System.out.println(List);
	}

}
