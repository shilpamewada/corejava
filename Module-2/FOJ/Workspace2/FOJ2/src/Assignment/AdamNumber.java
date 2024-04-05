package Assignment;
// Adam number is a number when reversed, the square of the number and the square of the reversed number should be numbers which are reverse of each other.
/*Input : 12
Explanation: 
Square of 12 = 144
Reverse of 12 = 21
Square of 21 = 441
Now Square of 12 and square of reverse of 12 are 
reverse of each other. Therefore 12 is Adam number.*/



public class AdamNumber {
    public static boolean isAdamNumber(int num) {
        // Calculate the square of the given number
        int squareNum = num * num;

        // Reverse the digits of the given number
        int reverseOriginalNum = reverseDigits(num);

        // Calculate the square of the reversed number
        int squareReverseNum = reverseOriginalNum * reverseOriginalNum;

        // Reverse the digits of the square of the original number
        int reverseSquareNum = reverseDigits(squareNum);

        // Check if the square of the reversed number equals the reverse of the square of the original number
        return squareReverseNum == reverseSquareNum;
    }

    // Function to reverse the digits of a number
    public static int reverseDigits(int num) {
        int reversed = 0;
        for (int temp = num; temp != 0; temp /= 10) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
        }
        return reversed;
    }

    public static void main(String[] args) {
        int num = 4; 

        if (isAdamNumber(num)) {
            System.out.println(num + " is an Adam Number");
        } else {
            System.out.println(num + " is not an Adam Number");
        }
    }
}
