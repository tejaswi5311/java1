package polymorphism;

public class OverLoading {
public int add(int x,int y) {

return x+y;
}
public int add(int x,int y,int z) {

return x+y+z;
}
public double add(double x,double y) {

return x+y;
}
public static void main(String[] args) {
	OverLoading param=new OverLoading();
	System.out.println(param.add(4, 5));
	System.out.println(param.add(4, 5, 6));
	System.out.println(param.add(4.6, 5.8));
	
}
}
