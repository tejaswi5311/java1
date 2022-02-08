package collections;

import java.util.Stack;

public class Stacks {

	public static void main(String[] args) {
		// STACK CLASS REPRESENTS LIFO FOR OBJECTS
		//Deque<Integer> stack = new ArrayDeque<Integer>();
		Stack<String> stack = new Stack<String>();
		stack.push("US");
		stack.push("INDIA");
		stack.push("UAE");
		   System.out.println(stack);
		   String poppedElement =stack.pop();
		   System.out.println("poppedElement"+poppedElement);
		   System.out.println(stack);
	}

}
