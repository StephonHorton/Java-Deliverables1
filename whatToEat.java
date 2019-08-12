package Deliverables1;

import java.util.Scanner;

public class whatToEat {

	public static void main(String[] args) {
		Scanner user = new Scanner(System.in);
		int partySize = 0;
		String eventType = "";
		String casual = " you should serve sandwiches prepared ";
		String semi = " you should serve fried chicken prepared ";
		String formal = " you should serve chicken parmesan prepared ";
		String one = " in the microwave";
		String two = " in your kitchen";
		String teen = " by a caterer";
		
		
		System.out.println("Are you having a casual,formal, or semi-formal event?");
		eventType = user.next();
		System.out.println("Great now enter your party size?");
		partySize = user.nextInt();
		
		
		if(eventType.equalsIgnoreCase("casual") && partySize < 2) {System.out.println("Since you’re hosting a casual event for " + partySize +
				casual + one);}
		else if(eventType.equalsIgnoreCase("casual") && partySize <= 12) {System.out.println("Since you’re hosting a casual event for " + partySize +
				casual + two  );}
		else if(eventType.equalsIgnoreCase("casual") && partySize >= 13) {System.out.println("Since you’re hosting a casual event for " + partySize +
				casual + teen);}		
		if(eventType.equalsIgnoreCase("semi-formal") && partySize < 2) { System.out.println("Since you're hosting a semi-formal event for " +
		        partySize + semi + one);}
		else if(eventType.equalsIgnoreCase("semi-formal") && partySize <= 12) { System.out.println("Since you're hosting a semi-formal event for " +
				partySize + semi + two);}
		else if(eventType.equalsIgnoreCase("semi-formal") && partySize >= 13) { System.out.println("Since you're hosting a semi-formal event for " +
				partySize + semi + teen);}
		if(eventType.equalsIgnoreCase("formal") && partySize < 2) { System.out.println("Since you're hosting a formal event for " +
				partySize + formal + one);}
		else if(eventType.equalsIgnoreCase("formal") && partySize <= 12) { System.out.println("Since you're hosting a formal event for " +
				partySize + formal + two);}
		else if(eventType.equalsIgnoreCase("formal") && partySize >= 13) { System.out.println("Since you're hosting a formal event for " +
				partySize + formal + teen);}
		
		
		
		

	}

}
