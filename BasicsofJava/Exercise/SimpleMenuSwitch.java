package BasicsofJava.Exercise;

public class SimpleMenuSwitch {
    public static void main(String[] args){
        //SImple menu using switch, create menu option 1 to 4 for addtion & etc, use switch to perform selected operation
        int choice = 4;
        double num1 = 10.0;
        double num2 = 5.0;
        switch (choice){
            case 1:
                System.out.println("Add " + (num1 + num2));
                break;
            case 2:
                System.out.println("Subtract " + (num1 - num2));
                break;
            case 3:
                System.out.println("Multiply " + (num1 * num2));
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println("Divide " + (num1 / num2));
                } else {
                    System.out.println("Cannot divide by zero");
                }
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
