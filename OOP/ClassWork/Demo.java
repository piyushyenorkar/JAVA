package OOP.ClassWork;

public class Demo {
    public static void main(String[] args){
        int res1 = 0;
        demo1 obj = new demo1();
        res1 = obj.num1;
        int res2 = 0;
        demo2 obj2 = new demo2();
        res2 = obj2.num3;
        System.out.println(res1);
        System.out.println(res2);
    }
}
class demo1{
    int num1 = 10;
    int num2 = 20;
    void display(){
        System.out.println("inside display 1");
    }
    void fun(){
        System.out.println("inside fun 1");
    }
}
class demo2{
    int num3 = 30;
    int num4 = 20;
    void display2(){
        System.out.println("inside display 2");
    }
    void fun2(){
        System.out.println("inside fun 2");
    }
}