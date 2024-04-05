package Ifelseif;

public class SumOfTwoDigits {

	public static int  sum (int num1 , int num2){  //parameters pass

		int unitdigit = num1 % 10 ;
		int tensdigit = num1 /10 ;
		int sum1 = unitdigit + tensdigit ;
		return sum1 ;
	}

	public static int  sumOfTwoDigitsNum(int num){  // shortcut method
		return (num%10) + (num/10) ;
	}

	public static void main(String[] args) {  //simple method
		int num = 45 ;
		int unitdigit = num % 10 ;
		int tensdigit = num /10 ;
		int sum = unitdigit + tensdigit ;

		System.out.println("the sum of two digits is " + sum);

		int result = sum( 25,0);
		System.out.println("the sum of two digits is " + result);

		System.out.println(sumOfTwoDigitsNum(23));

	}

}
