package inOut;

import java.util.Scanner;

public class WhileLoops {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String sequence = "";
		String actualValue = "";
		// while -> use for unknown number of iterations
//		while (!actualValue.toUpperCase().equals("Q")) { // first version
//		while(true) { // second version
//			System.out.println("Insert inscription:");
//			actualValue = input.nextLine();
//			if(actualValue.toUpperCase().equals("Q")) {
//				break;
//			}
//			sequence += actualValue + " ";
//		}
		
		do { // third version
			System.out.println("Insert inscription:");
			actualValue = input.nextLine();
			sequence += actualValue + " ";
		} while(!actualValue.toUpperCase().equals("Q"));
			
		input.close();
		System.out.println("The result of action: " + sequence.substring(0,sequence.length()-3));
	}
}
