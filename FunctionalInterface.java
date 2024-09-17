package forInterview;

interface Function{
	int add(int a, int b);
}
public class FunctionalInterface {
	public static void main(String[] args) {
		Function fun= (a, b)->a+b;
		int addtion = fun.add(15, 12);
		System.out.println(addtion);
	}
}
