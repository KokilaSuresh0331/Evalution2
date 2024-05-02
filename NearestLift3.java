package lift.com;

import java.util.Scanner;

public class NearestLift3 {
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the current floor:");
    int currentFloor = sc.nextInt();
    System.out.println("Enter the destination floor:");
    int destinationFloor = sc.nextInt();
    String[] lifts = {"L1", "L2", "L3", "L4", "L5"};
    String assignedLift = assignLiftToUser(currentFloor, destinationFloor, lifts);
    System.out.println("Lift assigned: " + assignedLift);
    System.out.println("Lifts: " + String.join(" ", lifts));
    System.out.println("Floor:");
    for (int i = 0; i < lifts.length; i++) {
        System.out.print(" " + lifts[i] + "->");
        System.out.print(" " + (i + 1) * 2);
    }
    sc.close();
}

public static String assignLiftToUser(int currentFloor, int destinationFloor, String[] lifts) {
    if (lifts == null || lifts.length == 0)
        throw new IllegalArgumentException("Lifts array cannot be null or empty.");

    int minDistance = Integer.MAX_VALUE;
    String nearestLift = "";
    for (String lift : lifts) {
        int liftPosition = Integer.parseInt(lift.substring(1)) - 1;
        int distance = Math.abs(currentFloor - liftPosition);
        if (distance < minDistance) {
            minDistance = distance;
            nearestLift = lift;
        }
    }
    return nearestLift;
}
}