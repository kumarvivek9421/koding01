package forInterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeArrays {

	public static void main(String[] args) {
		
/*	There are following ways to merge two arrays:
		>	Java arraycopy() method
		>	Without using arraycopy() method
		>	Java Collections
		>	Java Stream API
	*/	
		
//	>	Java arraycopy() method
		int[] arr1= {4,5,7,6};
		int[] arr2= {1,5,6,4};
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int a = arr1.length;    //determines length of firstArray  
		int b = arr2.length;   //determines length of secondArray  
		int[] result = new int[a + b];  //resultant array of size first array and second array 
		
		for(int i=0; i<arr1.length; i++) {
			result[i]= arr1[i];
		}
		for(int i=0; i<arr2.length; i++) {
			result[arr1.length+i]= arr2[i];
		}
		for(int i=0; i<result.length; i++) {
			System.out.print(result[i]+" ");
		}
		System.out.println();
		System.arraycopy(arr1, 0, result, 0, a);  
		System.arraycopy(arr2, 0, result, a, b);  
		System.out.println(Arrays.toString(result));    //prints the resultant array  
/*	
//	 >	Without using arraycopy() method
 
	  	int[] arr1= {4,5,7,6};
		int[] arr2= {1,5,6,4};
		int[] arr3= {9,5,7,2};

			Arrays.sort(arr1);
			Arrays.sort(arr2);
			Arrays.sort(arr3);
			// add the length of firstArray into secondArray into thirdArray
			int[] result= new int[arr1.length + arr2.length + arr3.length]; // resultant array
			int index= 0;
			for(int element: arr1) {  //copying elements of first Array using for-each loop 
				result[index++]= element;   //[index++] increases position by 1
			}for(int element: arr2) {
				result[index++]= element;
			}for(int element: arr3) {
				result[index++]= element;
			}
				System.out.println(Arrays.toString(result)); //prints the resultant array
	*/
		
/*
//	 > Java Collections Stream API
	  
	  		String[] str1= {"E", "F", "S"};
			String[] str2= {"D", "T", "X"};
			String[] str3= {"R", "O", "J"};

			List<String> li= new ArrayList(Arrays.asList(str1));
			li.addAll(Arrays.asList(str2));
			li.addAll(Arrays.asList(str3));
			
			Object[] arr= li.toArray();
			System.out.println(Arrays.toString(arr));
			
//			Using Stream method for String (flatMap)
			List<String> li = Stream.of(str1, str2, str3)
							.flatMap(Arrays::stream)
							.collect(Collectors.toList());
			
			Object[] arr= li.toArray();
			System.out.println(Arrays.toString(arr));

	 /* 
//	  		Using Stream method for Integer (flatMapToInt)
		int[] arr1= {4,5,7,6};
		int[] arr2= {1,5,6,4};
		int[] arr3= {9,5,7,2};
	
		List<Integer> li = Stream.of(arr1, arr2, arr3)
				.flatMapToInt(Arrays::stream)
				.boxed().collect(Collectors.toList());
		Object[] arr= li.toArray();
		System.out.println(Arrays.toString(arr));
*/
	}
}
