package Basicjava;

public class Demo5 {

	public static void method1(){
		System.out.println("method1() called...");
		
	}
	public static void sum(){  //static type of program
		int num1 = 10;
		int num2 = 3;   
		int sum;
		
		sum = num1 + num2;
		System.out.println(" sum = " + sum);
	}

	 
		public static int  sum (int num1 , int num2){
			return num1 + num2;
			
		}
	
	public static void sum1(int num1 , int num2){  //dynamic program
		int sum1 = num1 + num2 ;  
		System.out.println( " sum1 = " + sum1);
		
	}
	
	
	
	public static void main(String[] args) {
		method1();
		sum();
		sum1( 10,13);
		sum1( 11,2);
		
		int result = sum(10,3);
		System.out.println("sum = " + result + "\n");
		
		System.out.println("sum = " + sum (20, 3));
		
	}

}
