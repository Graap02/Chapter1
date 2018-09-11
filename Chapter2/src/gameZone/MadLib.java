package gameZone;

import java.util.Scanner;

public class MadLib {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		String word1;
		String word2;
		String word3;
		String word4;
		
		
		
		
		System.out.println("Please type four words to use in the nursery rhyme.");
	
		word1 = input.next();
		word2 = input.next();
		word3 = input.next();
		word4 = input.next();
	
		System.out.println("The itsy bitsy " + word1 + " went up the " + word2 + " spout. Down came the " + word3 +
				" and washed the " + word1 + " out. Out came the " + word4 + " and dried up all the " + word3);
		
		
		
		
		
		
	}

}
