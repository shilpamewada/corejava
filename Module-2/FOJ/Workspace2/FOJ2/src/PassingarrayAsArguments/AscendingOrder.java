package PassingarrayAsArguments;

public class AscendingOrder {
	
	public static int[] sortAscendingOrder(int arr[]){
		
		int temp = 0;
		//bubble sort
		for(int i = 0; i < arr.length - 1; i++){
			for(int j = 0; j < arr.length -1 - i; j++){
				if(arr[j] > arr[j+1]){
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp ;
				}
			}
			
		}
		return arr;
		
		
	}

	public static void main(String[] args) {
		int arr[] = {20,30,10,50,40,60};
		 sortAscendingOrder(arr);
		
		System.out.println("After Sorting");
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
			
		}
		

	}

}
