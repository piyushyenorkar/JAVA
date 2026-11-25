package BasicsofJava.HomeWork;

public class SimpleInterest {
    public static void main(String[] args) {
        double principal = 1011.0;
        double rate = 5.0;
        double time = 2.0;
        double simpleInterest = (principal * rate * time)/100;
        System.out.println("Simple Interest is: " + simpleInterest);
    }
}
//output: Simple Interest is: 101.1
