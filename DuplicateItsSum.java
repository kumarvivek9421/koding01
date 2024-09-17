package forInterview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateItsSum {
	public static void main(String[] args) {
		List<Integer> num= Arrays.asList(10,15,8,49,25,98,98,32,15); //output is: 98+15= 113
//		int[] num= {10,15,8,49,25,98,98,32,15};
		Map<Integer, Integer> numSum= new HashMap<>();
		for(int n: num) {
			numSum.put(n, numSum.getOrDefault(n, 0)+1);
		}
		int sum= 0;
		for(Map.Entry<Integer, Integer>entry: numSum.entrySet()) {
			if(entry.getValue()>1) {
				sum+= entry.getKey();
				System.out.println(entry.getKey()+": "+entry.getValue());
			}
		}
		System.out.println(sum);
//		Using Stream method
		Map<Integer, Long> collect = num.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		int result = collect.entrySet().stream().filter(n->n.getValue()>1).mapToInt(n->n.getKey()).sum();
		System.out.println("Duplicate and its Sum: "+result);
	}
}
