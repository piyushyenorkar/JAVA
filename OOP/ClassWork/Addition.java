package OOP.ClassWork;

public class Addition {
    public static void main(String[] args){
        int sum = 0;
        arithmetic obj = new arithmetic(10, 20);//creating object of class arithmetic
        sum = obj.add(10, 20);
        System.out.println("Sum of 10 and 20 is: " + sum);


    }
    // static int add (int a, int b){
    //     return a + b;

}

// we can call the add method without creating object of class because it is static method.

class arithmetic{
    int m = 10;
    int add (int a, int b){
        return a + b;
    }
    arithmetic(){
        System.out.println("This is default constructor");
    }
    arithmetic (int x, int y){
        System.out.println("This is parameterised constructor");
    }
}
//we can create object of class arithmetic and call the add method using that object.


//default and paramnetrised constructor are used to initialize the object of class. Default constructor is called when we create object without passing any parameter. Parameterised constructor is called when we create object by passing parameters.
