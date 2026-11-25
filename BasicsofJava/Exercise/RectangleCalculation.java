package BasicsofJava.Exercise;

public class RectangleCalculation {
    public static void main(String[] args) {
        int length = 20;
        int breadth = 30;
        int area = length*breadth;
        System.out.println("Area:" + area);
        int perimeter = 2 * (length+breadth);
        System.out.println("Perimeter:" + perimeter);
}
}