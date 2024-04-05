package string;

public class String1EqualsToOthers {

    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = " Java";
        String str3 = new String("Java");

        if (str1 == str2) {
            System.out.println("Same things");
        } else if (str1 == str3) {
            System.out.println("It is not same");
        }
    }
}
