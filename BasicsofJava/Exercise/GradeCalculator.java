package BasicsofJava.Exercise;

public class GradeCalculator {
    public static void main(String[] args) {
        int marks = 85;
        if (marks >= 90) {
            System.out.println("grade A");
        }else if (marks >= 80) {
            System.out.println("grade B");
        }else if (marks >= 70) {
            System.out.println("grade C");
        }else if (marks >= 60) {
            System.out.println("grade D");
        }else if (marks >= 50) {
            System.out.println("grade E");
        }else {
            System.out.println("grade F");
        }
}
}