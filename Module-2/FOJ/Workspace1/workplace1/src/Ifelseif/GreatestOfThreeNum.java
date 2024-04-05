package Ifelseif;

public class GreatestOfThreeNum {
	
	public static void main(String[] args) {
		int num1 = 10 ;
		int num2 = 20 ;
		int num3 = 30 ;
		int  max ;
		
		
		max = num1;
		
		if(max < num2){
			max = num2 ;		
		}
		
		if(max < num3){
			max = num3;
		}
	
		System.out.println(max + " is greater");
	}

}
