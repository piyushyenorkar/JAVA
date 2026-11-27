package OOP.Exercise;

public class RectangleClass {
    public static void main(String[] args){
        Rectangle rec = new Rectangle(4, 6);

        rec.display();

    }
}
class Rectangle {
    int length;
    int breadth;
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
    

