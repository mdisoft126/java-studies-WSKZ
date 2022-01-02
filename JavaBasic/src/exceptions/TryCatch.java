package exceptions;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class TryCatch {
	public static void main(String[] args) {
		int integerNumber;
		double doubleNumber;
		String name;
		Scanner input = new Scanner(System.in);
		input.useLocale(Locale.ENGLISH);
		while (true) {
			try {
				System.out.println("Insert integer number not equal 13");
				integerNumber = input.nextInt();
				if(integerNumber == 13) {
					throw new ArithmeticException();
				}
				System.out.println("Insert floating number");
				doubleNumber = input.nextDouble();
				System.out.println("Insert name");
				input.nextLine(); // consumption of the new line character
				name = input.nextLine();
				System.out.println("Introduced numbers: " + integerNumber + " " + doubleNumber);
				System.out.println("Introduced name: " + name);
				break;
			} catch (InputMismatchException e) {
				System.out.println("Data format error");
				e.printStackTrace();
			} catch(ArithmeticException e) {
				System.out.println("You entered the number 13 - not allowed");
			} 
			catch (Exception e) {
				System.out.println("Catching every other exception");
			} 
			finally {
				input.nextLine(); // consumption of the new line character
			}
		}
		input.close();
	}
}
