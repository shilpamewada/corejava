package PassingarrayAsArguments;

public class SearchArray {

	public static int searchArraysValue(int arr[] , int num){
		for(int i = 1 ; i < arr.length; i++){
			if( num == arr [i]){
				return i;
			}
		}

		return -1 ;
	}

	public static void main(String[] args) {
		int arr[] = { 10,20,30,40,50};

		System.out.println(searchArraysValue(arr , 40));
		System.out.println(searchArraysValue(arr , 100));
		
	}
}



