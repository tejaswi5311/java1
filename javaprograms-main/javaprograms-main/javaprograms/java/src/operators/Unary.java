package operators;

public class Unary {
	public static void main(String[] args) {
		int result = +1;
		System.out.println("result is"+ result);
		result--;
		System.out.println("result is"+ result);
		result++;
		System.out.println("result is"+ result);
		result = -result;
		System.out.println("result is"+ result);
		boolean success=false;
		System.out.println(success);
		System.out.println(!success);
	}
}
