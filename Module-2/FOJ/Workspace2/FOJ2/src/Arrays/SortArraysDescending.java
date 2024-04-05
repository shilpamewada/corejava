package Arrays;

public class SortArraysDescending {
   
    public static void descendingOrder(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] < arr[j]) {
                	
                	//swap
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        descendingOrder(arr);
        System.out.println("Sorted array in descending order:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
