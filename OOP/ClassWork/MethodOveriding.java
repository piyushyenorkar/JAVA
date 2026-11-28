package OOP.ClassWork;

public class MethodOveriding {
    public static void main(String[] args) {
        derived obj = new derived();
        obj.display();
    }
}
class base{
    void display(){
        System.out.println("I am Base");
    }
}
class derived extends base{
@Override // to override similar method
    void display(){
        System.out.println("I am Derived");
    }
}