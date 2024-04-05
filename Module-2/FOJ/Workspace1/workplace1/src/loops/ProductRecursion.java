package loops;

public class ProductRecursion {

	public static int product( int num){
		if( num == 1){
			return 1;
		}

			return num * product(num - 1);
		}

	public static void main(String[] args) {
		System.out.println(product(5));

	}

}
