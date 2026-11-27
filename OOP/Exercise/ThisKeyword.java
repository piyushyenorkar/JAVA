package OOP.Exercise;

public class ThisKeyword {
    public static void main(String[] args){
        person per = new person("piyush", 21);
        per.display();
}
}
class person{
    String name;
    int age;
    
    person(String name, int age){
        this.name = name;
        this.age = age;
        // name = name;
        // age = age;
    }
    void display(){
        System.out.println("Name: " + name + "\nAge: " + age);
    }
}