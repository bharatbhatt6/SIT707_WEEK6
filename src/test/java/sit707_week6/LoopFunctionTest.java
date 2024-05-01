package sit707_week6;


	// ConditionalLoopFunctionsTest.java
	import org.junit.Assert;
	import org.junit.Test;
	
	public class LoopFunctionTest {

	    @Test
	    public void testSumUpToN() {
	        // Test case for sumUpToN function
	        int result = LoopFunction.sumUpToN(5);
	        Assert.assertEquals(15, result);
	    }

	    @Test
	    public void testCountEvenNumbers() {
	        // Test case for countEvenNumbers function
	        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	        int result = LoopFunction.countEvenNumbers(numbers);
	        Assert.assertEquals(5, result);
	    }

	    @Test
	    public void testSumUpToNWithZero() {
	        // Test case for sumUpToN function with zero
	        int result = LoopFunction.sumUpToN(0);
	        Assert.assertEquals(0, result);
	    }

	    @Test
	    public void testCountEvenNumbersWithEmptyArray() {
	        // Test case for countEvenNumbers function with an empty array
	        int[] numbers = {};
	        int result = LoopFunction.countEvenNumbers(numbers);
	        Assert.assertEquals(0, result);
	    }

	    @Test
	    public void testSumUpToNWithNegativeNumber() {
	        // Test case for sumUpToN function with a negative number
	        int result = LoopFunction.sumUpToN(-5);
	        Assert.assertEquals(0, result); // Since the function expects a positive integer, it should return 0
	    }

	    @Test
	    public void testCountEvenNumbersWithNoEvenNumbers() {
	        // Test case for countEvenNumbers function with an array containing no even numbers
	        int[] numbers = {1, 3, 5, 7, 9};
	        int result = LoopFunction.countEvenNumbers(numbers);
	        Assert.assertEquals(0, result);
	    }
	}

