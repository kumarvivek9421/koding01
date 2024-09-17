package forInterview;

public class StringChallenge {

	public static void main(String[] args) {
//		Test case
		System.out.println(StringChallenge(3));
		System.out.println(StringChallenge(8));
	}
	private static String StringChallenge(int num) {
		StringBuilder sb= new StringBuilder();
		for(int i=1; i<=num; i++) {
			if(i%3==0 && i%5==0) {
			sb.append("FizzBuzz");
			}else if(i%3==0) {
				sb.append("Fizz");
			}else if(i%5==0){
				sb.append("Buzz");
			}else {
				sb.append(i).append(" ");
			}
		}
		return sb.toString().trim();
	}
}
