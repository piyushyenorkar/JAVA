package OOP.Exercise;

public class StudentRegistration {
            public static void main(String[] args){
//create two objects of student class
                student s1 = new student("Piyush", 101, "CSE");
                student s2 = new student("Debsss", 102, "AIML");
                s1.displayDetails();
                s2.displayDetails();
}}

class student{
    String name;
    int rollno;
    String branch;

    student(String name, int rollno, String branch){
        this.name = name;
        this.rollno = rollno;
        this.branch = branch;
    }
    void displayDetails(){
        System.out.println("Name: " + name + " | Roll No: " + rollno + " | Branch: " + branch);
    }
}
