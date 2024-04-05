package NumbersPatterns;

public class ZeroOneTriangle {

	public static void main(String[] args) {
		 int i, j;
	        for (i = 1; i <= 5; i++) {
	            for (j = 1; j <= i; j++) {
	                // if the sum of (i+j) is even then print 1
	                if ((i + j) % 2 == 0) {
	                    System.out.print(1 + " ");
	                }
	                // otherwise print 0
	                else {
	                    System.out.print(0 + " ");
	                }
	            }
	            System.out.println();
	        }
	    }
	 
	}


