package OOP.ClassWork;

public class MethodOverloading {
        public static void main(String[] args){
            overloading obj = new overloading();
            obj.add(10, 20);
            obj.add(10.5, 20.5, 30.5);
            System.out.println(obj.add(10, 20));
            System.out.println(obj.add(10.5, 20.5, 30.5));
    
}
}

class overloading{
    int add(int a, int b){
        return a+b;
    }
    // int add(int a, int b){
    //     return a+b;
    // }// we cannot overload method with same parameter.
    double add(double a, double b, double c){
        return a+b+c;
    }
}