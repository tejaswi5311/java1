package Inheritance;

public class Inheritancedemo {

	public static void main(String[] args) {
		MountainBike mb=new MountainBike(1, 10, 20);
		System.out.println("gear is "+mb.gear);
		System.out.println("speed is "+mb.speed);
        System.out.println("seatheight is "+mb.seatheight);
        mb.SpeedUp(1);
      //  mb.applyBrake(1);
        System.out.println("speed after applying break is "+mb.speed);

	}

}
