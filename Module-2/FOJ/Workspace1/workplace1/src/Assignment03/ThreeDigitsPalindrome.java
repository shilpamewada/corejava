package Assignment03;

public class ThreeDigitsPalindrome {
	
	
	public static boolean threeDigitsPalindrome(int num){
//		int unitDigit = num % 10 ;
//		int hundredDigit = num / 100 ;
//		return hundredDigit == unitDigit;
		return ( (num/100) == (num % 10));
	}

	public static void main(String[] args) {
//		int number = 111 ;
//		if(threeDigitsPalindrome(number)){
//			System.out.println( number + " it is a palindrome ");
//		}else{
//			System.out.println(number + " it is not a palindrome ");
//		}
		System.out.println(threeDigitsPalindrome(121));

	}

}
