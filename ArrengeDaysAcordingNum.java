package forInterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrengeDaysAcordingNum {

	public static void main(String[] args) {
		List<String> days= Arrays.asList("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday");
		List<Integer> num= Arrays.asList(6, 3, 5, 4, 1, 0, 2);
		
//		Create a new List and put the all days in new list
		List<String> numOfDays= new ArrayList<>();
		for(int index: num) {
			numOfDays.add(days.get(index));
		}
		System.out.println(numOfDays);
		
//		usign stream method
		System.out.println(
		num.stream().map(days::get).collect(Collectors.toList()) //map(n->days.get(n))
		);
	}
}
