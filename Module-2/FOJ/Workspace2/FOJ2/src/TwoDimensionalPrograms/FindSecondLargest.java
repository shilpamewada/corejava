package TwoDimensionalPrograms;

public class FindSecondLargest {
	

	public static int[] sortArray(int arr[]) {
		int temp = 0;
		
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] < arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		
		return arr;
	}

	public static int findSecondLarget(int arr[]) {		
		return sortArray(arr)[1];
	}
	
	public static void main(String[] args) {
		int arr1[] = {10, 20, 30, 40, 50};
		int arr2[] = {83, 96, 125, 183, 458, 329};
		int arr3[] = {430, 480, 350};
		int arr4[] = {480, 350};
		
		System.out.println(findSecondLarget(arr1));	//40
		System.out.println(findSecondLarget(arr2));	//329
		System.out.println(findSecondLarget(arr3));	//430
		System.out.println(findSecondLarget(arr4));	//350
	}
}
