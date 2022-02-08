package staticpackage;

import staticpackage.Student;

public class Static {

	public static void main(String[] args) {
		Student entry=new Student("john",15);
		System.out.println(entry.getName());
		System.out.println(entry.getAge());
		System.out.println(entry.college);
		//instance
		System.out.println(Student.college);
		//static
	}
	}


