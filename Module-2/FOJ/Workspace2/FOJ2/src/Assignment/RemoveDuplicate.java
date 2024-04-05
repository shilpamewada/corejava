package Assignment;

public class RemoveDuplicate {
	public static int removeDuplicates(int[] arr) {
		if (arr.length == 0) {
			return 0;
		}
		int unique = 1;

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != arr[i - 1]) {
				arr[unique++] = arr[i];
			}
		}
		return unique;
	}

	public static void main(String[] args) {
		int[] arr = {1, 1, 2, 2, 2};
		int length = removeDuplicates(arr);
		for (int i = 0; i < length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
//https://docs.oracle.com/javase/8/docs/api/