package Arrays;

public class EvenOddIndexValue {

	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50};
		for (int i = 0; i < arr.length; i += 2) {
		    System.out.print(" " + arr[i]); 
		}
		System.out.println();
	 for (int i = 1; i < arr.length; i += 2) {
		    System.out.print( " " + arr[i]); 
		}
	}

}
