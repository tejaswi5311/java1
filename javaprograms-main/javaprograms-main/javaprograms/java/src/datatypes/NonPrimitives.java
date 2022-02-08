package datatypes;

public class NonPrimitives {

	public static void main(String[] args) {
String str = "hello";
System.out.println("string is "+ str);
String str1 = new String("hello");
System.out.println("new string is "+ str1);

int arr[];
arr=new int[2];
arr[0]=1;
arr[1]=8;
//gives hashcode of array
System.out.println("array is "+ arr);
System.out.println("particular array is "+ arr[1]);
}
}
