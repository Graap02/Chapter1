package YouDoIt;

import java.util.Scanner;

public class InchesToFeet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inches;
		int feet;
		
		Scanner input = new Scanner(System.in);
		
		int INCHES_IN_FEET = 12;
		int numberofInches; 
		
		
		
		System.out.println("How many inches overall?");
		numberofInches = input.nextInt();
		
		feet = numberofInches / INCHES_IN_FEET;
		inches = numberofInches % INCHES_IN_FEET;
		int totalDistance = feet/INCHES_IN_FEET;
		
		System.out.println("The total is " + feet + " feet and " + inches + " inches.");
		
		
		
		
		
		
		
		
		
	}

}
