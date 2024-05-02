package lift.com;

import java.util.Scanner;

public class AssignLiftToUser2 {
	 public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the current floor");
		 int currentFloor=sc.nextInt();
		 System.out.println("Enter the destinattion floor");
	        int destinationFloor = sc.nextInt();
	        String[] lifts = {"L1", "L2", "L3", "L4", "L5"};
	        String assignedLift = assignLiftToUser(currentFloor, destinationFloor, lifts);
	        System.out.println("Lifts: " + String.join(" ", lifts));
	        System.out.println("Lifts:"+assignedLift+" "+"assigned "+destinationFloor);
	        sc.close();
	    }
	   
	    public static String assignLiftToUser(int currentFloor, int destinationFloor, String[] lifts) {

	        return lifts[0];
	    }
	}