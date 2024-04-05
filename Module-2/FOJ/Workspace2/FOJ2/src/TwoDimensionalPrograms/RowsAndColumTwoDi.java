package TwoDimensionalPrograms;

public class RowsAndColumTwoDi {
	
	public static void displayArray(int arr[][]){
		int i, j ;
		for( i = 0; i < 3; i++){
			for( j = 0; j < 3; j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println(" ");
		}
		System.out.println(" ");
	}

	public static void main(String[] args) {
		
		int arr1[][] = new int[][] {{10,20,30},{40,50,60},{70,80,90}};
		int arr2[][] = new int[][] {{10,11,12},{13,14,15},{16,17,18}};
		int arr3[][] = new int[][] {{80,90,70},{50,30,20},{40,60,90}};
		 displayArray(arr1);
		 displayArray(arr2);
		 displayArray(arr3);

	}

}
