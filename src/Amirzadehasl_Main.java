

public class Amirzadehasl_Main {

	public static void main(String[] args) {
		
		int n = 10;
		
		System.out.println("The " + n + "th term of the Fibonacci sequence is " + fib(n));
		
		
		
		//"The nth term of the Fibonacci sequence is y." 
		//Don't hard-code the results; output the appropriate variables.

	}

	/** Recursive method that returns value based upon the adding of a
	 * particular sequence of numbers
	 * @author Bijan Amirzadehasl
	 * @param n integer that is the value of steps to be taken
	 * @return n total value after the generated number of steps in equation
	 */
	public static int fib(int n) {
		if (n <= 1) {
			return n;
		}
		else {
			return fib(n-1) + fib(n-2);
		}
	}

}
