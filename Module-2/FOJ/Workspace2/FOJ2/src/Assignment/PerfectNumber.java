package Assignment;

public class PerfectNumber {
	
	public static boolean  isPerfectNumberOrNot(int num){
		if(num <= 0){
			return false;
		}
	int sum = 0;
	for( int i = 1; i <= num/2; i++){
		if(num % i == 0){
			sum += i;
		}
		
	}
	return sum == num ;
	}

	public static void main(String[] args) {
		int num = 28;
		if ( isPerfectNumberOrNot(num)) {
			System.out.println(num + " is a perfect number.");
		} else {
			System.out.println(num + " is not a perfect number.");
		}
	}
	}


