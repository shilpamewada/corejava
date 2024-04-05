package TwoDimensionalPrograms;

public class FindColumnSum {

	public static void  findcolumSum(int arr[][]){
		int i ,j ;
		for(i = 0; i < 3; i++) {
			int sum = 0;
			for(j = 0; j < 3; j++) {
				sum += arr[j][i];
			}
			System.out.print(sum + " ");
		}

		System.out.println(" ");
	}
	
public static void main(String[] args) {
	int arr1[][] = new int[][] {{10,20,30},{40,50,60},{70,80,90}};
	int arr2[][] = new int[][] {{10,11,12},{13,14,15},{16,17,18}};
	int arr3[][] = new int[][] {{80,90,70},{50,30,20},{40,60,90}};

	findcolumSum(arr1);
	findcolumSum(arr2);
	findcolumSum(arr3);

}

}