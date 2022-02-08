package ConditinalStatements;

public class SwitchCase {
	public static void main(String[] args) {
		int month=6;
	String monthString = null;
	switch(month) {
	case 1:
		monthString = "January";
		break;
	case 2:
		monthString ="february";
		break;
	case 3:
		monthString ="march";
		break;
	case 4:
		monthString ="april";
		break;
	case 5:
		monthString ="may";
		break;
	case 6:
		monthString ="june";
		break;
	case 7:
		monthString ="july";
		break;
	case 8:
		monthString ="august";
		break;
	case 9:
		monthString ="september";
		break;
	case 10:
		monthString ="october";
		break;
	case 11:
		monthString ="november";
		break;
	case 12:
		monthString ="december";
		break;
	default:
		monthString="Invalid"	;
	}
	System.out.println(monthString);
	
	}
}

