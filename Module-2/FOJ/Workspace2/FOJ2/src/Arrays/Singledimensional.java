package Arrays;

public class Singledimensional {

	public static void main(String[] args) {
		
		int[] arr = {10, 20, 30, 40, 50};
		int Length = arr.length;
		int sum = 0 ;
		long product = 1;
		
		System.out.print("Size  of array : " + Length);
		System.out.println();
		
		for (int i = 0; i < Length; i++) {
            System.out.println( "arr[] = " +arr[i]);
            sum += arr[i];
            product *= arr[i];
            
        }
		System.out.println("Sum = " + sum);
		System.out.println("Product = " + product);
	}

}
