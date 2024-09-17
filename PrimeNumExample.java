package forInterview;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PrimeNumExample {
	
	public static void main(String[] args) {
	/*	for(int i=2; i<10; i++) {
			int count= 0;
			for(int j=2; j<i; j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==0) {
				System.out.println(i);
			}
		}
	*/
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Input");
		int num= sc.nextInt();
		int count= 0;
		
		if(num<2) {
			System.out.println(num+" Its not prime");
		}else {
			for(int i=2; i<num; i++) {
				if(num%i==0) {
					System.out.println(num+" Its not prime");
					count++;
					break;
				}
			}
			if(count==0) {
				System.out.println(num+" Its prime");
			}
		}
		
/*
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 20);
        // Prime number 
       List<Integer> primeNum = numbers.stream().filter(PrimeNumExample::isPrime).collect(Collectors.toList());
       System.out.println(primeNum);
    }

    public static boolean isPrime(int number) {
    	if(number<2) {
    		return false;
    	}
//    	int count=0;
        for (int i = 2; i <= number/2; i++) {
            if (number % i == 0) {
//            	count++;
                return false;
            }
        }
        return true;
     */
    }
}
