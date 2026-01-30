package week2;

import java.util.Scanner;
public class NameAPP {
	static Scanner userinput = new Scanner(System.in);
	public static void main(String[] args) {
		
		// Declare the variables:
		String firstName;
		String lastName;
		int age;
		double sleep;
		
		
		// Collect the information:
		// Ask the user to input their name.
		System.out.println("Provide the following information:");
		System.out.print("First name: ");
		firstName = userinput.nextLine();
		System.out.print("Last name: ");
		lastName = userinput.nextLine();
		
		// Ask the user to input their age.
		System.out.print("Age: ");
		age = userinput.nextInt();
		
		// Ask the user to input the amount of sleep they get per night.
		System.out.print("Amount of sleep you get per night on average as a decimal: ");
		sleep = userinput.nextDouble();
		
		
		// Print the information:
		System.out.println("\nHere is your information:");
		System.out.format("Name: %s %s", firstName, lastName);
		System.out.format("\nAge: %d", age);
		System.out.format("\nAverage amount of sleep per night: %.1f hours", sleep);

	}

}
