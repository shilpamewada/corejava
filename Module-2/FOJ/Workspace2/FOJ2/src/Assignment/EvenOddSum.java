package Assignment;

public class EvenOddSum {

	public static int evenSum(int num){
		int sum = 0;
		for(int i = 0 ; i <=num; i++){
			if(i % 2 == 0){
				sum += i;
				
			}
		}
		return sum ;
	}
	public static int oddSum(int num){
		int sum = 0;
		for(int i = 0 ; i <= num; i++){
			if(i % 2 != 0){
				sum += i;
				
			}
		}
		return sum ;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(evenSum(25));
		System.out.println(oddSum(25));

	}

}
