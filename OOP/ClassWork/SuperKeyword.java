package OOP.ClassWork;

public class SuperKeyword {
    public static void main(String[] args){
        derived obj = new derived();
        obj.display();
        derived obj1 = new derived(10, 20);
        obj1.display();


    }
}
//if names of methods same in both clasees then we use super keyword to call parent method in child class
class base{
    int num = 10;
    base(){
        System.out.println("i am base Constructer");
    }
    base(int x, int y){
        System.out.println("i am base param");
    }
    void display(){
        System.out.println("I am Base");
    }
}
class derived extends base{
    int num = 20;
    derived(){
        System.out.println("i am derived Constructer");
    }
    derived(int x, int y){
        super(10, 20);
        System.out.println("i am derived param");
    }
    void display(){
        super.display();//super use to call parent display if same name get to method/function
        System.out.println("I am Derived");
    }
}
