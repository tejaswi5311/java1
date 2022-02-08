package encapsulation;

public class Encapsulation {

	public static void main(String[] args) {
		Student student=new Student("vedha", 18);
		System.out.println(student.getAge());
		System.out.println(student.getName());
		System.out.println(student.toString());

	}

}
