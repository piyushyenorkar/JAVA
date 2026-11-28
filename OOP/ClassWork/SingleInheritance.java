package OOP.ClassWork;

public class SingleInheritance {
    public static void main(String[] args){
        int res1 = 0;
        derived obj = new derived();
        obj.fun();
        res1 = obj.num1;
        System.out.println(res1);
        obj.displaynum6();
    }
}
class base{
    int num1 = 10;
    int num2 = 20;
    //private int num5 = 40;//not assessible out of base class 
    protected int num6 = 50;// only access who inherit the class base (for ex here derived is )
    void display(){
        System.out.println("inside display 1");
    }
    void fun(){
        System.out.println("inside fun 1");
    }
}
class derived extends base{
    int num3 = 30;
    int num4 = 20;
    void display2(){
        System.out.println("inside display 2");
    }
    void fun2(){
        System.out.println("inside fun 2");
    }
    void displaynum6(){
        System.out.println(num6);
    }
}