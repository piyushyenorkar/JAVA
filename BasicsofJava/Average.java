package BasicsofJava;

public class Average {
    public static void main(String[] args) {
    int num1 = 10;
    int num2 = 30;
    // int avg = 0; avg = total/3; but with this avg come in integer
    int total = 0;
    total = num1+num2;
    System.out.println("total: " + total);
    double average = total/3.0;// with this avg come in decimal points 
    System.out.println("avg: " + average);

}
}