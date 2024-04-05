package Assignment;

public class CollazSequence {
    /* The Collatz sequence is a sequence of numbers where each term is generated from the previous term according to specific rules. 
    If n is even, divide it by 2.
    If n is odd, multiply it by 3 and add 1.
    Repeat the process with the new number obtained.
    The sequence ends when the number becomes 1. */

    public static void collazSequence(int n) {
        for (; n != 1;) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        collazSequence(10);
    }
}
