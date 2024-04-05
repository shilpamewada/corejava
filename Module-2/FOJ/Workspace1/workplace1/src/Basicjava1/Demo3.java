package Basicjava1;
import java.util.Scanner;
public class Demo3 {

	public static void main(String[] args) {
		int a;
		double b;
		boolean c;
		String d;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Int Value: ");
		a = scan.nextInt();
		
		System.out.print("Enter Double Value: ");
		b = scan.nextDouble();
		
		System.out.print("Enter Boolean Value: ");
		c = scan.nextBoolean();
		
		System.out.print("Enter String Value: ");
		d = scan.next();
		
		System.out.println();
		System.out.println("a = " + a + "\nb = " + b);
		System.out.println("c = " + c + "\nd = " + d);
		System.out.println();
	}

}
