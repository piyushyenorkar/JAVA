package OOP.Exercise;

public class EmployDetails {
    public static void main(String[] args){
        employee emp1 = new employee(101, "Piyush", 50000);
        employee emp2 = new employee(102, "Debss", 200000);

        emp1.displayDetails();
        emp2.displayDetails();
    
}
}
class employee{
    int empid;
    String enpName;
    int salary;

    employee(int empid, String empName, int salary){
        this.empid = empid;
        this.enpName = empName;
        this.salary = salary;
    }
    void displayDetails(){
        System.out.println("EmpID: " + empid + " | EmpName: " + enpName + " | Salary: " + salary);
    }
}
