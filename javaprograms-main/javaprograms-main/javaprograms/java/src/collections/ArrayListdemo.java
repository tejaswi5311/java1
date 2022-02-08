package collections;

import java.util.List;
import java.util.ArrayList;
public class ArrayListdemo {

	public static void main(String[] args) {
		//doubles  it size to 50% after 10 th element
		// is an dynamic array duplicates are allowed
		//index based collection,ordered collection
List<Integer> arrayList = new ArrayList<Integer>(5);
for(int i=0;i<5;i++)
	arrayList.add(i);
//printing elements
System.out.println(arrayList);
//remove element
arrayList.remove(3);
System.out.println(arrayList);
//printing elements one by one
for(int i=0;i<arrayList.size();i++)
	System.out.println(arrayList.get(i)+" ");
}
}
