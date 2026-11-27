package OOP.ClassWork;

public class ThisKeyword {
    public static void main(String[] args){
        //this keyword is used to refer current class instance variable
        demo obj = new demo(10, 20);
        obj.display();

    }
}
class demo{
    int a = 70;
    int b = 80;
    demo (int a, int b){
        this.a = a;
        this.b = b;
        //a = a;
        //b = b;
    }
    void display(){
        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);
    }

}