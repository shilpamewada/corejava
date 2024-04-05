package Assignment;

public class ArmStrongNumber {

	public static boolean isArmstrongNumber(int num) {
		int sum = 0;
		int length = String.valueOf(num).length();

		for (int temp = num; temp > 0; temp = temp / 10) {
			int lastDigit = temp % 10;
			sum += Math.pow(lastDigit, length);
		}

		return sum == num;
	}

	public static void main(String[] args) {
		int num = 153;
		if (isArmstrongNumber(num)) {
			System.out.println(num + " is an Armstrong number.");
		} else {
			System.out.println(num + " is not an Armstrong number.");
		}
	}
}
