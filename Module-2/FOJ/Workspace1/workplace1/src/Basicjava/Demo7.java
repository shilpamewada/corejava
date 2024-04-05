package Basicjava;

public class Demo7 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		int temp;
		
		System.out.println("Before Swapping / Interchaning");
		System.out.println("num1 = " + num1 + "\nnum2 = " + num2 + "\n");
		
		//Swapping / Interchanging Using temp Variable (approach-1)
		temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println("After Swapping / Interchaning");
		System.out.println("num1 = " + num1 + "\nnum2 = " + num2 + "\n");
		

		//Swapping / Interchanging Without Using temp Variable (approach-2)
		num1 += num2;
		num2 = num1 - num2;
		num1 -= num2;
		
		System.out.println("After Swapping / Interchaning");
		System.out.println("num1 = " + num1 + "\nnum2 = " + num2 + "\n");

		
		
		

	}

}
