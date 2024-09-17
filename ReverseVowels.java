package forInterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseVowels {
	public static void main(String[] args) {
		String str= "Acollections";
		str= str.toLowerCase();
		int count= 0;
		System.out.println("1st way to Find vowels with UnSorted");
		String vowels= "aeiou";
		for(int i=0; i<str.length(); i++) {
			char ch= str.charAt(i);
//			if(vowels.indexOf(ch)!= -1) { // for Vowels
			if(vowels.indexOf(ch)== -1) { // for Consonets
				System.out.println(ch+" ");
				count++;
			}
		}
		System.out.println("total vowels count is: "+count+"\n");
		
//		-----Another 2nd way-----
		
		int count1= 0;
		str= str.toLowerCase();
		System.out.println("2nd way to Find vowels with UnSorted");
		for(int i=0; i<str.length(); i++) {
			char ch= str.charAt(i);
			if(ch=='a'|ch=='e'|ch=='i'|ch=='o'|ch=='u') {
				System.out.println(ch+" ");
				count1++;
			}
		}
		System.out.println("total vowels count is: "+count1+"\n");
		
//		-----Another 3rd way-----
		
		int count2= 0;
		List<Character> vowelsList= new ArrayList<>();
		String vowels2= "aeiouAEIOU";
		for(int i=0; i<str.length(); i++) {
			char ch= str.charAt(i);
			if(vowels.indexOf(ch)!= -1) {
				vowelsList.add(ch);
				count2++;
			}
		}
		System.out.println("3rd way to Find vowels with Sorted");
		Collections.sort(vowelsList);
		for(char c: vowelsList) {
			System.out.println(c);
		}
		System.out.println("total vowels count is: "+count2+"\n");
		
//		-----Another 4rth way-----
		
		int count3= 0;
		str= str.toLowerCase();
		System.out.println("4rth way to Find vowels with Reverse Order");
		StringBuilder sb= new StringBuilder();
		for(int i=0; i<str.length(); i++) {
			char ch= str.charAt(i);
			if(ch=='a'|ch=='e'|ch=='i'|ch=='o'|ch=='u') {
				sb.append(ch);
				count3++;
			}
		}
		StringBuilder reverse = sb.reverse();
		System.out.println(reverse+": "+" total vowels count is: "+count3+"\n");
		
//		-----Another 5th way-----
		
		str= str.toLowerCase();
		vowels= "aeiou";
		for(int i= str.length()-1; i>=0; i--) {
			char ch= str.charAt(i);
			if(vowels.indexOf(ch)!= -1) {
				System.out.print(ch);
			}
		}
	}
}
