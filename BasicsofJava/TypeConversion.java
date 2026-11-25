package BasicsofJava;

public class TypeConversion {
    public static void main(String[] args) {
    int age = 20;
    double age2 = age;//widenening Conversion
    System.out.println("print age" + age2);

    double age3 = 19.67; 
    int age4 =(int)age3;//narrowing conversion
    System.out.println("print age" + age4);

    double amount = 9999.75;
    byte amount2 = (byte)amount;
    System.out.println("print age" + amount2);

    int score = 5;
    score = score + 10;
    score += 1;
    // or score += 1 or score ++}
    System.out.println("print score" + score);
}
}