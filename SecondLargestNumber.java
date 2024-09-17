package forInterview;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SecondLargestNumber {
public static void main(String[] args) {
	Integer [] arr= {7,6,5,10,11,10,11};
	int largestNum= 0;
	Arrays.sort(arr);
	for(int i=0; i<arr.length; i++) {
		if(largestNum< arr[i]) {
			largestNum= arr[i];
		}
	}
	System.out.println(largestNum);
	
//	------Using Stream method------
	Object[] array = Arrays.stream(arr).sorted((a,b)->b.compareTo(a)).toArray();
	System.out.println(Arrays.toString(array)); // sorted array with duplicate
	
	List<Integer> collect = Arrays.stream(arr).sorted().collect(Collectors.toList());
	System.out.println(collect); // sorted array with duplicate
	
	System.out.println(
			Arrays.stream(arr).sorted((a,b)->b.compareTo(a)).skip(1).findFirst().orElse(null)
			); // 2nd largest num
	
//	-----2nd Rule-----
	
	findSecondLargestNum(arr);
	}

private static void findSecondLargestNum(Integer[] arr) {
	Arrays.sort(arr, Collections.reverseOrder());
	for(int i=0; i<arr.length; i++) {
		if(arr[i]!= arr[0]) {
			System.out.println(arr[i]); // Output- 10
			break;
			}
		}
//	----- 3rd Rule Using Set interface -----
	
	Set<Integer> set= new HashSet<>();
	for(int val: arr) {
		if(!set.contains(val)) {
			set.add(val);
		}
	}
	System.out.println(
	set.stream().sorted((a,b)->b.compareTo(a)).skip(1).findFirst().orElse(null)
			);
//	---4rth Rele using Swepping method---
	
	for(int i=0; i<arr.length; i++) {
		for(int j=i+1; j<arr.length; j++) {
			if(arr[i]<arr[j]) {
				int temp= arr[i];
				arr[i]= arr[j];
				arr[j]= temp;
				}
			}
		}
	System.out.println(arr[2]);
	
//	-----5th Rule-----
	
	}
}