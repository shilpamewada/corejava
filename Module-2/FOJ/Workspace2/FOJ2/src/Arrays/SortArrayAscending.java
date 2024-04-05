package Arrays;

public class SortArrayAscending {

    public static void ascendingOrder(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    // Swap 
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {70, 60, 50, 30, 40};
        ascendingOrder(arr);
        System.out.println("Sorted array in ascending order:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
