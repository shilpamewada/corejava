package Ifelseif;

public class FindGreatestOfTwoNum {
	
    public static void main(String[] args) {
        
        int num1 = 10;
        int num2 = 8;
         
        if( num1 > num2) {
        	System.out.println( num1 + " is greater");
        }else{
        	System.out.println( num2  + " is greater ");
        }    
        
    	int num11 = 10 ;
		int num22 = 20 ;
		int  max ;
		
		
		max = num11;
		
		if(max < num22){
			max = num22 ;		
		}
		
		System.out.println(max + " is greater");
    }


}
