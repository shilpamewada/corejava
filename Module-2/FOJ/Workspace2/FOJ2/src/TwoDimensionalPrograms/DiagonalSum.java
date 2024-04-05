package TwoDimensionalPrograms;

public class DiagonalSum {

    public static int diagonalSum(int arr[][]) {
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {

        int arr1[][] = new int[][] {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};
        int arr2[][] = new int[][] {{10, 11, 12}, {13, 14, 15}, {16, 17, 18}};
        int arr3[][] = new int[][] {{80, 90, 70}, {50, 30, 20}, {40, 60, 90}};
        
        System.out.println(diagonalSum(arr1));
        System.out.println(diagonalSum(arr2));
        System.out.println(diagonalSum(arr3));

    }
}
