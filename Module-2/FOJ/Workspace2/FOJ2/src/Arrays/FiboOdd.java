package Arrays;

public class FiboOdd {

	public static boolean isFib(int n) {
		int a = 0, b = 1;
		while (b <= n) { 
			if (b == n)
				return true; 
			int temp = a + b;
			a = b;
			b = temp;
		}
		return false ;
	}
	boolean oddCountFib(int[] arr) {
		int count = 0;
		for (int num : arr) {
			if (isFib(num))
				count++;
		} 
		return count % 2 == 1;
	}
}




