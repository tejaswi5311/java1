package collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		//not get natural order
	Queue<String> queue = new PriorityQueue<String>();
	queue.add("US");
	queue.add("INDIA");
	queue.add("UAE");
	System.out.println("originalqueue "+queue);
	queue.remove("UAE");
	System.out.println("head queue removed "+queue);
	String head =queue.peek();
	System.out.println("head queue "+head);
	head = queue.poll();
	System.out.println("removed head queue "+head);
	System.out.println("finalqueue "+queue);
	}

}
