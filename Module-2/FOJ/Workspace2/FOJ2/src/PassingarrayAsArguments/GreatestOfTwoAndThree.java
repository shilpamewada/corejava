package PassingarrayAsArguments;

public class GreatestOfTwoAndThree {
	//conditon ? : true : false
	public static int greatestOfTwoNumbers(int num1 , int num2){
		return (num1 > num2) ? num1 : num2;	
	}

	public static int greatestOfThreeNumbers(int num1 , int num2 , int num3){
		  return (num1 > num2) ? ((num1 > num3) ? num1 : ((num2 > num3) ? num2 : num3)) : ((num2 > num3) ? num2 : num3);
	}

	public static void main(String[] args) {
		System.out.println(greatestOfTwoNumbers(5,4));
		System.out.println(greatestOfThreeNumbers(5,6,7));

	}

}
