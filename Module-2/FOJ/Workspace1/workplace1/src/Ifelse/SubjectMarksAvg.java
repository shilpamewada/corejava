package Ifelse;

public class SubjectMarksAvg {
//nested if 
    public static void main(String[] args) {
        int sub1 = 89;
        int sub2 = 79;
        int sub3 = 76;
        double total = sub1 + sub2 + sub3;
        double avg = total / 3;

        System.out.println("sub1: " + sub1);
        System.out.println("sub2: " + sub2);
        System.out.println("sub3: " + sub3);
        System.out.println("total: " + total);
        System.out.println("avg: " + avg);

        if (sub1 > 39 && sub2 > 39 && sub3 > 39) {
            if (avg >= 75) {
                System.out.println(" Passed in distinction division");
            } else if (avg >= 60) {
                System.out.println("Passed in I division");
            } else if (avg >= 50) {
                System.out.println("Passed in II division");
            } else {
                System.out.println("Passed in III division");
            }
        } else {
            System.out.println(" Failed");
        }
    }
}
