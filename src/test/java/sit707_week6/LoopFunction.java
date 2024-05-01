package sit707_week6;

public class LoopFunction {
	// ConditionalLoopFunctions.java

	    // Function with a conditional loop (for loop) containing simple instructions in the loop body
	    public static int sumUpToN(int n) {
	        int sum = 0;
	        for (int i = 1; i <= n; i++) {
	            sum += i;
	        }
	        return sum;
	    }

	    // Function with a conditional loop (while loop) containing a conditional statement in the loop body
	    public static int countEvenNumbers(int[] numbers) {
	        int count = 0;
	        int i = 0;
	        while (i < numbers.length) {
	            if (numbers[i] % 2 == 0) {
	                count++;
	            }
	            i++;
	        }
	        return count;
	    }
	}
