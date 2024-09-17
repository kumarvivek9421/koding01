package forInterview;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RepeatedAndNonRepeatedChar {
	public static void main(String[] args) {
//		------First Rule-----
		String str= "I Love India and India is great";
		str= str.toLowerCase();
		Map<Character, Integer> wordCount= new HashMap<>();
		char[] ch= str.toCharArray();
		for(char word: ch) {
			if(wordCount.containsKey(word)) {
				wordCount.put(word, wordCount.get(word)+1);
			}else {
				wordCount.put(word, 1);
			}
		}
		for(char word: ch) {
			if(wordCount.get(word)==1) {
				System.out.println("first non-repeating char: "+word);
				break;
			}
		}
		for(char word: ch) {
			if(wordCount.get(word)>1) {
				System.out.println("first repeating char: "+word);
				break;
			}
		}
//		------Second Rule-----
		System.out.println("first Non-repeating char: "+
		"vivek".chars().mapToObj(c-> Character.valueOf((char)c))
			.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
			.entrySet().stream().filter(e->e.getValue()==1).map(n->n.getKey()).findFirst().get()
			);
//		------Third Rule-----
		Map<Character, Long> collect =  "I Love India".chars().mapToObj(i -> (char)i)
				 .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	        collect.forEach( (x,y) -> System.out.println( "Key: " + x + " Val: " + y));

	        Optional<Character> firstNonRepeat = collect.entrySet().stream()
	        		.filter( (e) -> e.getValue() == 1).map(e -> e.getKey()).findFirst();
	        if(firstNonRepeat.isPresent()) {
	            System.out.println("First non repeating: " + firstNonRepeat.get());
	        }
	        Optional<Character> firstRepeat = collect.entrySet().stream()
	        		.filter( (e) -> e.getValue() > 1).map(e -> e.getKey()).findFirst();
	        System.out.println("First repeating: " + firstRepeat.orElse(null));
//	        ------Fourth Rule-----
	        String input = "I Love India";
	        Character nonRepeatChar = input.chars().mapToObj(c -> Character.valueOf((char) c))
	                                  .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())) // Finding the character count
	                                  .entrySet().stream().sorted(Map.Entry.comparingByValue()) //Sorted by character count value
	                                  .map(entry -> entry.getKey()).findFirst().get(); //Returning the first value
	        System.out.println(nonRepeatChar);
//	        ------Fifth Rule-----
	        Character firstNonRepeatedChar =input.trim()
	                .toLowerCase()
	                .chars()
	                .mapToObj(i->(char)i).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()))
	                .entrySet()
	                .stream()
	                .filter(i->i.getValue()==1).map(Map.Entry::getKey)
	                .collect(Collectors.toList()).get(0);
	        System.out.println(firstNonRepeatedChar);
	}
}
