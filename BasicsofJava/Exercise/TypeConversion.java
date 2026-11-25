package BasicsofJava.Exercise;

public class TypeConversion {
    public static void main(String[] args) {
    int a = 20;
    double b = (double)a;//widenening Conversion
    System.out.println("print age " + b);

    double c = 19.67; 
    int d =(int)c;//narrowing conversion
    System.out.println("print age " + d);
}
}