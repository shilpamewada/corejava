package NumbersPatterns;

public class PalindromeNumberPattern {

	public static void main(String[] args) {
		int i, j;
		 
        for (i = 1; i <= 5; i++) {
            // inner loop to print the spaces
            for (j = 1; j <= 2*(5 - i); j++) {
                System.out.print(" ");
            }
            // inner loop to print the first part
            for (j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            // inner loop to print the second part
            for (j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
	}

