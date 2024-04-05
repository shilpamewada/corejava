package loops;

public class FibboSeries {

    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 1;
        int num3;

        System.out.print("0 1 "); 

        for (int i = 0; i <= 10; i++) {
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            System.out.print(num3 + " ");
        }
    }
}
