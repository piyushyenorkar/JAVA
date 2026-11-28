package OOP.Exercise;

public class PerstuInheritance {
    public static void main(String[] args) {
        person obj = new student(71, "computer");
        obj.display();
    }
}
class person{
    String name = "piyush";
    int age = 21;

    person(String name, int age){
        this.name = name;
        this.age = age;
    }
    void display(){ 
        System.out.println("name: " + name + "\nage : " + age);
    }
}
class student extends person{
    int rollno;
    String branch;
    
    student(int rollno, String branch){
        super("Piyush", 21);
        this.rollno = rollno;
        this.branch = branch;
    }
    void display(){
        super.display();
        System.out.println("rollno : " + rollno + "\nbranch : " + branch);
    }
}