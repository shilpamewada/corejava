package Assignment03;

public class TwoDigitPalindrome {
    
    public static boolean twoDigitsPalindrome(int num) {
        int unitDigit = num % 10;
        int tensDigit = num / 10;
        
        return tensDigit == unitDigit; 
    }

    public static void main(String[] args) {
        int number = 33;
        
        if (twoDigitsPalindrome(number)) {
            System.out.println(number + " is a  palindrome.");
        } else {
            System.out.println(number + " is not a  palindrome.");
        }
    }
}
