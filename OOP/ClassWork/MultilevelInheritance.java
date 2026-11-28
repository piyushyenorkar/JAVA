package OOP.ClassWork;

public class MultilevelInheritance {
    public static void main(String[] args){
        child obj = new child();
        System.out.println("MultilevelInheritance");
        obj.display0();
        obj.display1();
        obj.display2();
    }
}
class grandfather{
    int num = 10;
    void display0(){
        System.out.println("I am grandfather");
    }
}
class father extends grandfather{
    int num = 20;
    void display1(){
        System.out.println("I am father");
    }
}
class child extends father{
    int num = 30;
    void display2(){
        System.out.println("I am child");
    }
}