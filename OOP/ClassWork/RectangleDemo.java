package OOP.ClassWork;

public class RectangleDemo {
    public static void main(String[] args){
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(5);
        Rectangle r3 = new Rectangle(4, 6);

        r1.display();
        r2.display();
        r3.display();

    }
}
class Rectangle {
    int length;
    int breadth;
    Rectangle(){
        length = 1;
        breadth = 1;
    }
    Rectangle(int side){
        length = side;
        breadth = side;
    }
    Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    int area(){
        return length * breadth;
    }

    int perimeter(){
        return 2 * (length + breadth);
    }
    void display(){
        System.out.println(length + " x " + breadth + " | Area: " + area() + " | Perimeter: " + perimeter());
}
}