package OOP.ClassWork;

public class HierarchicalInheritance {
    public static void main(String[] args){
        box obj = new box();
        triangle obj1 = new triangle();
        System.out.println("HierarchicalInheritance");
        obj1.display0();
        obj.display1();
        obj1.display2();
    }
}
class shape{
    int num = 10;
    void display0(){
        System.out.println("I am shape");
    }
}
class box extends shape{
    int num = 20;
    void display1(){
        System.out.println("I am box");
    }
}
class triangle extends shape{
    int num = 30;
    void display2(){
        System.out.println("I am triangle");
    }
}

