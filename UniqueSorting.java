package forInterview;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class UniqueSorting {
	public static void main(String[] args) {
		String[] arr= {"jfa", "2jdf", "fj", "5klgj", "9nf"};
		Object[] array = Arrays.stream(arr).filter(n->n.matches("^[a-z].*")).toArray();
		System.out.println("after sorting: "+Arrays.toString(array));
		
		List<String> words= Arrays.asList(arr);
		Collections.sort(words);
		System.out.println("after sorting: "+words);
		
		List<String> sortedList = words.stream().filter(n->n.matches("^[0-9].*")).collect(Collectors.toList());
		System.out.println("after sorting: "+sortedList);
	}
}
