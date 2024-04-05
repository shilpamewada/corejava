package Arrays;

class Solution {
    boolean rev_sum_of_odd_pos(int n) {
        int sum = 0;
        int position = 1; // Starting from the least significant digit

        while (n > 0) {
            int digit = n % 10; // Extract the least significant digit
            if (position % 2 == 1) { // Check if the position is odd
                sum += digit; // Add the digit to the sum
            }
            n /= 10; // Move to the next digit
            position++; // Move to the next position
        }

        return sum % 2 == 0; // Check if the sum of digits at odd positions is even
    }
}
