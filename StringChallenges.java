package forInterview;

import java.util.Scanner;

public class StringChallenges {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a String: ");
		String input= s.nextLine();
		System.out.println(StringChallenge(input));
	}
	private static String StringChallenge(String str) {
		if(str.length()<=7|| str.length()>=31) {
			return "false";
		}
		if(str.toLowerCase().contains("password")) {
			return "false";
		}
//		Flags to travk constraints i, 2, and 3
		boolean hasCapitalLetter= false;
		boolean hasNumber= false;
		boolean hasSymbol= false;
		
//		check each character
		for(char c: str.toCharArray()) {
			if(Character.isUpperCase(c)) {
				hasCapitalLetter= true;
			}
			else if(Character.isDigit(c)) {
				hasNumber= true;
			}else if(isSymbol(c)) {
				hasSymbol= true;
			}
//			Break the loop early if all constraints are  met
			if(hasCapitalLetter && hasNumber && hasSymbol) {
				return "true";
			}
		}
//		if any of the constraints is not met, return "false"
		return "false";
	}
//	Helper method to check if a character is a punctuation of methematical symbol
	private static boolean isSymbol(char c) {
		return !Character.isLetterOrDigit(c);
	}

}
