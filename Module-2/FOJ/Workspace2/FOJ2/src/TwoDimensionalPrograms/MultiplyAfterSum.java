package TwoDimensionalPrograms;

public class MultiplyAfterSum {
	public static int[][] matrixMul(int matrix1[][], int matrix2[][]) {
		int mul[][] = new int[3][3];
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				
				mul[i][j] = 0;
				
				for (int k = 0; k < 3; k++) {
					mul[i][j] = mul[i][j] + matrix1[i][k] * matrix2[k][j];
				}
			}
		}		
		
		return mul;
	}
	
	public static void displayArray(int arr[][]) {
		for (int i = 0; i < 3; i++) {			
			for (int j = 0; j < 3; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {		
		int arr1[][] = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};				
		int arr2[][] = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		
		int mul[][] = matrixMul(arr1, arr2);
		displayArray(arr1);
		displayArray(arr2);
		displayArray(mul);
	}
}
