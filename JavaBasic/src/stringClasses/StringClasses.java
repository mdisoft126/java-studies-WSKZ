package stringClasses;

import java.util.StringTokenizer;

public class StringClasses {
	public static void main(String[] args) {
		String word = "cat";
		StringBuffer ew = new StringBuffer(word);
		if(word.equals(ew.reverse().toString())) {
			System.out.println("It is palindrome.");
		} else {
			System.out.println("It is not palindrome.");
		}
		
		String sentence = "Ala has a cat and cat has an Ala";
		StringTokenizer st = new StringTokenizer(sentence, " ");	// split sentence by delimiter
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken().toString());
		}
	}

}
