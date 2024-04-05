package Assignment03;

public class ThreeDigitSum {
	
	public static int sumofthreeDigit(int num){
		int unitDigit = num % 10 ;
		int tensDigit = (num /10) % 10 ;
		int hundredDigit = num /100 ;
		return unitDigit + tensDigit + hundredDigit ;
	}

	public static void main(String[] args) {
		int num = 143 ;
		int sum = sumofthreeDigit(num);
		System.out.println("The sum of three digits number is :- " + sum);
	}

}
