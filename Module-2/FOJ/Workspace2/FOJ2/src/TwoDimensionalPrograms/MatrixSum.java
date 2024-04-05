package TwoDimensionalPrograms;

public class MatrixSum {

	public static int [][] matrixSum ( int matrix1[][] , int matrix2[][]){
		int sum [][] = new int [3][3];
		for(int i = 0 ; i < 3; i++){
			for( int j = 0; j < 3; j++){
				sum[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}
		return sum;
	}
	public static void  displayArray(int arr[][]){
		for(int i = 0 ; i < 3; i++){
			for( int j = 0; j < 3; j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}


	public static void main(String[] args) {
		int arr1[][] = new int [][]{{10,20,30},{40,51,60},{10,20,30}};
		int arr2[][] = new int [][]{{11,12,13},{14,15,16},{17,18,19}};

		int sum [][] = matrixSum(arr1 , arr2);
		displayArray(arr1);
		displayArray(arr2);
		displayArray(sum);


	}
}
