package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {
		// used to iterating and manipulating collections
		// sequence of elements supporting sequential and parallel aggregate operations
   List<Integer> list=new ArrayList<>();
   list.add(10);
   list.add(20);
   list.add(30);
   //without using streams
  /*List<Integer> squarelist=new ArrayList<>();
     for(int i:list) {
	   squarelist.add(i*i);
	  System.out.println(squarelist)};*/
   
	   // by using streams
	  /* List<Integer> squarelists=  list.stream().map(i->i*i).collect(Collectors.toList());
  System.out.print(squarelists);*/
  
  /*<Integer> squarelist=new TreeSet<>();
    for(int i:list) {
	   squarelist.add(i*i);
	   System.out.println(squarelist);
	   }*/
   
 /* Set<Integer> squarelists=  list.stream().map(i->i*i).collect(Collectors.toSet());
 System.out.print(squarelists);*/   
   List<String> filter=new ArrayList<>();
   filter.add("java");
   filter.add("python");
   filter.add("c");
   filter.add("c++");
   System.out.println(filter);
  /* List<String> filtered=new ArrayList<>();
   for(String i:filter) {
	  if(i.startsWith("c")) {
		  filtered.add(i); 
		  System.out.println(filtered);}}*/
  /* List<String> filtered=filter.stream().filter(i->i.startsWith("c")).collect(Collectors.toList()); 
   System.out.println(filtered);*/
   /* List<String> sortedlist=filter.stream().sorted().collect(Collectors.toList()); 
   System.out.println(sortedlist);*/
  // filter.stream().forEach(x->{System.out.println("element is : "+x);});
   
   /*
    * identity:an element initial value reduction operation and default result is empty
    * accumulator:a function that takes two parameters :
    *  partial result of reduction operation and the next element of the stream
    *  combiner:a function used to combine partial result of reduction operation 
    */
   int sum = list.stream().reduce(0,(ans, i)->ans+i);
   System.out.println(sum);
	}
}


