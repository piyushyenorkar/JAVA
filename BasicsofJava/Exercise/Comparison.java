package BasicsofJava.Exercise;

public class Comparison {
    public static void main(String[] args) {
        int a = 40;
        int b = 40;
        boolean equal = a==b;
        boolean notequal = a!=b;
        boolean greater = a>b;
        boolean smaller = a<b;
        boolean greaterequal = a>=b;
        boolean smallerequal = a<=b;
        System.out.println("a==b:" + equal);
        System.out.println("a!=b:" + notequal);
        System.out.println("a>b:" + greater);
        System.out.println("a<b:" + smaller);
        System.out.println("a>=b:" + greaterequal);
        System.out.println("a<=b:" + smallerequal);
    }
}
