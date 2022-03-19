package lect09_regexp;

import java.util.regex.Pattern;

public class RegExp {
	public boolean validatePhoneNo(String phoneNo) {
		boolean res1 =  Pattern.matches("^[+][0-9]{2,3}([-][0-9]{3}){3}$", phoneNo);
		boolean res2 =  Pattern.matches("^[0-9]{3}([-][0-9]{3}){2}$", phoneNo);
		return res1 || res2;
	}
	
	public boolean validatePassword(String password) {
		boolean size = Pattern.matches(".{8,}", password);
		boolean capitalLetter = Pattern.matches(".*[A-Z]{1,}.*", password);
		boolean lowLetter = Pattern.matches(".*[a-z]{1,}.*", password);
		boolean digit = Pattern.matches(".*[0-9]{1,}.*", password);
		boolean alfanum = Pattern.matches(".*[-+.,!#@]{1,}.*", password);
		return size && capitalLetter && lowLetter && digit && alfanum;
		
	}
	
public static void main(String[] args) {
	RegExp regExp = new RegExp();
	System.out.println("Phone no validator");
	System.out.println(regExp.validatePhoneNo("+48-500-500-500"));
	System.out.println(regExp.validatePhoneNo("+48 500 500 500"));
	System.out.println(regExp.validatePhoneNo("500-500-500"));
	System.out.println("Password validator");
	System.out.println(regExp.validatePassword("qwe123"));
	System.out.println(regExp.validatePassword("Qwe123!!!"));
}

}
