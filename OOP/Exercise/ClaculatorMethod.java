package OOP.Exercise;

public class ClaculatorMethod {
    public static void main(String[] args){
        claculator calc = new claculator();
        int sum = calc.add(5, 10);
        int sub = calc.sub(10, 5);
        int mul = calc.mul(5, 10);
        System.out.println("Sum: " + sum);
        System.out.println("Subtraction: " + sub);
        System.out.println("Multiplication: " + mul);
        calc.display();
    }
}
class claculator{
    int add(int a, int b){
        return a+b;
    }
    int sub(int a, int b){
        return a-b;
    }
    int mul(int a, int b){
        return a*b;
    }
    int div(int a, int b){
        if (b==0){
            System.out.print("Division by zero is not allowed");
            return 0;
        }else{
            return a/b;
        }
    }
    void display(){
        System.out.println(" div: " + div(3, 0));
    }

}