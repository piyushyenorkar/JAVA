package BasicsofJava.Exercise;

public class LogicalOperator {
    public static void main(String[] args) {
        boolean hasRegistration = true;
        boolean hasPaidfees = true;
        boolean exam = hasRegistration && hasPaidfees;
        System.out.println("Student can attend Exam? " + exam);
}
}