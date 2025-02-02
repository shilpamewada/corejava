package Assignment;

public class CountNumberRepeated {

	public static void main(String[] args) 
	{ 

		int A[] = { 1, 6, 4, 6, 4, 8, 2, 4, 1, 1 }; 
		int max = Integer.MIN_VALUE; 
		for (int i = 0; i < A.length; i++) { 
			if (A[i] > max) 
				max = A[i]; 
		} 

		int B[] = new int[max + 1]; 
		for (int i = 0; i < A.length; i++) { 

			// increment in array B for every integer 
			// in A. 
			B[A[i]]++; 
		} 
		for (int i = 0; i <= max; i++) { 
			// output only if element is more than 
			// 1 time in array A. 
			if (B[i] > 1) 
				System.out.println(i + "-" + B[i]); 
		} 
	} 
}