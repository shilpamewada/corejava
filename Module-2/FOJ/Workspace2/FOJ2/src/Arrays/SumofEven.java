package Arrays;

public class SumofEven {

	    public static int sumOfEvenNumbers(int[] numbers) {
	        int sum = 0;
	        for (int num : numbers) {
	            
	            if (num % 2 == 0) {
	                // Add the even number to the sum
	                sum += num;
	            }
	        }
	        // Return the sum of even numbers
	        return sum;
	    }

	    public static void main(String[] args) {
	        // Test the sumOfEvenNumbers method
	        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	        int result = sumOfEvenNumbers(array);
	        System.out.println("Sum of even numbers: " + result); // Output: Sum of even numbers: 30
	    }
	}


