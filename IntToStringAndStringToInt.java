package forInterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class IntToStringAndStringToInt {
	public static void main(String[] args) {
		List<Integer> li= Arrays.asList(1,2,21,4);
		
//		Integer to String:
		List<String> intToString = li.stream().sorted().map(Object::toString).collect(Collectors.toList());
		System.out.println("Int to String: "+intToString);
		
		 List<String>intToStr= new ArrayList<>();
	       for(Integer s: li) {
	    	   intToStr.add(String.valueOf(s));
	        }
	       System.out.println(intToStr);
		
//	       String to Integer:
		List<String> str= Arrays.asList("1","155","45","544");
		List<Integer> stringToInt = str.stream().map(Integer::parseInt).sorted().collect(Collectors.toList());
		System.out.println("String to Integer: "+stringToInt);
		
		 List<Integer>strToint= new ArrayList<>();
	       for(String s: str) {
	    	   strToint.add(Integer.parseInt(s));
	        }
	       System.out.println(strToint);
	      
	}
}
