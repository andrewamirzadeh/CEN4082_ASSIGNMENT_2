
public class Amirzadehasl_Main {

	public static void main(String[] args) {
		
		int n = 10;
		
		System.out.println("The " + n + "th term of the Fibonacci sequence is " + fib(n));
		
		
		
		//"The nth term of the Fibonacci sequence is y." 
		//Don't hard-code the results; output the appropriate variables.

	}
	
	static int fib(int n) {
		if (n <= 1) {
			return n;
		}
		else {
			return fib(n-1) + fib(n-2);
		}
	}

}
