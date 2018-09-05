package excercises;

import java.util.Scanner;

public class freelance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		String name;
		int firstNumber;
		int secondNumber;
		int sum;
		
		System.out.println("What is your name >> ");
		name = input.next();
		System.out.println("What is integer 1? >> ");
		firstNumber = input.nextInt();
		System.out.println("What is integer 2? >> ");
		secondNumber = input.nextInt();
		
		
		sum = firstNumber + secondNumber;
		
		
		
		System.out.println("Your name is " + name);
		System.out.println("Your number is " + sum);
		
	}

}
