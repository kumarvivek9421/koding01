package forInterview;

import java.util.Optional;

public class OptionalClass {
	public static void main(String[] args) {
		String[] str= new String[10];
		str[5]= "This is Java";
		Optional<String> checkNull = Optional.ofNullable(str[5]);
		if(checkNull.isPresent()) {
			System.out.println(str[6].toUpperCase());
		}else {
			System.out.println("String is not present...");
		}
	}
}
