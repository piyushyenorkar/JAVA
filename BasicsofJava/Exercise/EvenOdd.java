package BasicsofJava.Exercise;

public class EvenOdd {
    //write a program to print even and odd number from 1 to 1000
    public static void main(String[] args){
        for (int i=1; i<=1000; i++) {
            if (i % 2 == 0){
            System.out.println("even");
            }else {
            System.out.println("odd");
            }
        }
    }
}