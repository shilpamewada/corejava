package Assignment03;

public class CheckTheNUmberIsDivisible {
    
    public static String checkTheNumberIsDivide(int num){
//        if (num % 3 == 0 && num % 5 == 0) {
//            System.out.println(num + " is divisible by both 3 and 5");
//           
//        } else if (num % 3 == 0 && num % 5 != 0) {
//            System.out.println(num + " is divisible by 3 but not 5");
//          
//        } else if(num % 3 != 0 && num % 5 == 0){
//        	 System.out.println(num + " is divisible by 5 but not 3");
//        }
//        else {
//            System.out.println(num + " is not divisible by both 3 and 5");
//           
//        }
    	
    	
    	String result = " ";
    	
    	if (num % 3 == 0)
    		result += "Fizz";
    	
    	if(num % 5 == 0)
    		result += "Bizz";
    	
    	 return result ;
    }

    public static void main(String[] args) {
//        int number = 15;
//        checkTheNumberIsDivide(number);  
    	
    	System.out.println(checkTheNumberIsDivide(3));
    	System.out.println(checkTheNumberIsDivide(15));
    }
}
