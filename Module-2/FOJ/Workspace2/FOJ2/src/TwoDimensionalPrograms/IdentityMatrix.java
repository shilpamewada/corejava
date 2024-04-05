package TwoDimensionalPrograms;

public class IdentityMatrix {

	public static boolean isIdentityMatrix(int arr[][]){
		int i,j;

		for( i = 0; i < 3; i++){
			for( j = 0; j < 3; j++){
				if ( i == j && arr[i][j] != 1){
				return false ;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int arr1[][] = new int[][]{{1,0,0},{0,1,0},{0,0,1}};
		int arr2[][] = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
		int arr3[][] = new int[][]{{1,0,0},{0,1,0},{0,0,1}};

		System.out.println(isIdentityMatrix(arr1));
		System.out.println(isIdentityMatrix(arr2));
		System.out.println(isIdentityMatrix(arr3));
	}

}
