package BasicsofJava.HomeWork;

public class CompareAge {
    public static void main(String[] args) {
        //compare the age and print the boolean result
        int age1 = 34;
        int age2 = 37;
        boolean isEqual = age1 == age2;
        boolean isNotEqual = age1 != age2;
        boolean isGreater = age1 > age2;
        boolean isSmaller = age1 < age2;
        System.out.println("age1 == age2: " + isEqual);
        System.out.println("age1 != age2: " + isNotEqual);
        System.out.println("age1 > age2: " + isGreater);
        System.out.println("age1 < age2: " + isSmaller);
    }
}
