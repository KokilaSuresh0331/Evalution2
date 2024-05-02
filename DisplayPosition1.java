package lift.com;

public class DisplayPosition1 {	
public static void main(String[] args) {
	int currentFloor=0,destinationFloor=0;
	int floor[]=new int[5];
    String[] lifts = {"L1", "L2", "L3", "L4", "L5"};
    System.out.println("Current position of the lift of the floor:\n");
    for(int i=0;i<lifts.length && i<floor.length;i++) {
    System.out.println(lifts[i]+"\t"+floor[i]);
    }
    
}
}
