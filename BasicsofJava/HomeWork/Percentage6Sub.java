package BasicsofJava.HomeWork;

public class Percentage6Sub {
    public static void main(String[] args) {
        int sub1 = 80;
        int sub2 = 90;
        int sub3 = 40;
        int sub4 = 80;
        int sub5 = 65;
        int sub6 = 98;

        int totalMarks = sub1 + sub2 + sub3 + sub4 + sub5 + sub6;
        int percentage = (totalMarks / 600) * 100;

        System.out.println("Percentage of 6 subjects is : " + percentage);
    }
}
//output: Percentage of 6 subjects is : 75.5