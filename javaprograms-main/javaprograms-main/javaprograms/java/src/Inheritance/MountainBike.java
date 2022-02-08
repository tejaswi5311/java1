package Inheritance;

public class MountainBike extends Bicycle {
public int seatheight;
	public MountainBike(int gear, int speed ,int startheight) {
		super(gear, speed);
		this.seatheight = startheight;
	}
public void setheight(int newvalue) {
	seatheight=newvalue;
}
	

}
