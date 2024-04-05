package Ifelse;

public class EvenOrOddReturn {
	
	public static int evenOrOdd(int num){
		if(num <= 0){
            return -1; 
        }else if(num % 2 == 0){
            return 1; 
        } else {
            return 0; 
        }
    }

	public static void main(String[] args) {
		System.out.println(evenOrOdd(27)); 
		System.out.println(evenOrOdd(24)); 
		System.out.println(evenOrOdd(0));
		System.out.println(evenOrOdd(-8));
	}
}
