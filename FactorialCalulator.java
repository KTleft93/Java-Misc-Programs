public class FactorialCalculator {

	public static void main(String[] args) {
		
		int test = factorial(5);
		System.out.println(test);
}
	
	
	public static int factorial(int n) {
		
		if(n <= 0) 
			return 1;
		
		else 
			return n*factorial(n-1);
		}
		
	}
