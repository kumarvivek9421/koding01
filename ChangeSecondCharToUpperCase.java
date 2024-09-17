package forInterview;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ChangeSecondCharToUpperCase {
	public static void main(String[] args) {
		String str= "Hi I am vivek kumar";
		String result= changeSecondCharToUpperCase(str);
		System.out.println(result);
	}
	private static String changeSecondCharToUpperCase(String str) {
//		split the String into word
		String[] word = str.split(" ");
		for(int i=0; i<word.length; i++) {
			word[i]= processChar(word[i]);
		}
		return String.join(" ", word);
				}
		private static String processChar(String word) {
		char[] ch = word.toCharArray();
		for(int j=1; j<ch.length; j+=4) {
			ch[j]= Character.toUpperCase(ch[j]);
		}
		return new String(ch);
	/*
		return Arrays.stream(str.split(" ")).map(word->{
			StringBuilder sb= new StringBuilder(word);
			for(int i=1; i<word.length(); i+=4) {
				sb.setCharAt(i, Character.toUpperCase(word.charAt(i)));
			}
			return sb.toString();
		}).collect(Collectors.joining(" "));
	*/
	}
}
