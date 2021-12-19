package application;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		System.out.print("Do you want to proceed (y/n): ");

		Scanner scanner = new Scanner(System.in);
		/*
		 * nextLine gets the next line of input as a string where a line is defined by
		 * the user ending it by hitting return key. The nextLine method returns a line
		 * of text
		 */
		String input = scanner.nextLine();
		scanner.close();

		//Can't use == with a string
		switch (input) {
		case "y":
			System.out.println("Proceeding...");
			//break;
		case "n":
			System.out.println("Not proceeding");
			//break;
		default:
			System.out.println("Unrecognized option.");
			//break;
		}
		/* If you remove the break; then the program
		 * cycles through all of the case statements.
		 * Without break; the program falls through to the
		 * other case statements below the first true
		 * case statement.
		 * It is valid to have a switch statement without breaks,
		 * but not common.
		 */
	}

}
