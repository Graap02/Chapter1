package YouDoIt;

import java.util.Scanner;

public class QuartsToGallons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int QTS_IN_GALLONS = 4;
		byte numberofQuartsNeeded = 18;
		int numberofGallons;
		int numberofQuartsRemaining;
		
		
		numberofGallons = numberofQuartsNeeded / QTS_IN_GALLONS;
		numberofQuartsRemaining = numberofQuartsNeeded % QTS_IN_GALLONS;
		
		
		System.out.println("How many quartz are needed?");
		numberofQuartsNeeded = input.nextByte();
		System.out.println("The job calls for " + numberofQuartsNeeded + " total quarts." );
		
	}

}
