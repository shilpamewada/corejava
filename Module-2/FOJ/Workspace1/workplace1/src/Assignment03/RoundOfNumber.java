package Assignment03;

public class RoundOfNumber {
	
	public static int nearestRoundNum(int number){
//		return (int) (Math.round(number/10)*10);
		
		int remainder =  number % 10 ;
		if(remainder < 5){
			return  number - remainder ;
		}else{
			return number +(10 - remainder) ;
		}
	}

	public static void main(String[] args) {
		int number  = 56 ;
		  int roundedNumber = nearestRoundNum(number);
		  
		  System.out.println(" original number "  + number);
		  System.out.println(" rounded number " + roundedNumber);
	}

}
