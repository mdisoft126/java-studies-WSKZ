package inOut;

import java.util.Scanner;

public class InOut {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Insert name:");
		String name = input.nextLine();
		System.out.println("Insert last name:");
		String lastName = input.nextLine();
		input.close();
		
		System.out.println("Introduced name: " + name.toUpperCase());
		System.out.println("Introduced last name: " + lastName.toUpperCase());
	}
}
