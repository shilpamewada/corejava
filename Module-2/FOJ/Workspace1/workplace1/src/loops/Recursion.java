package loops;

public class Recursion {

	public static int sum ( int num){
		if( num == 1){
			return 1;
		}

			return num + sum (num - 1);
		}

	public static void main(String[] args) {
		System.out.println(sum(5));

	}

}
