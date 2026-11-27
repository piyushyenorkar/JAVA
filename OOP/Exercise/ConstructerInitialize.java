package OOP.Exercise;

public class ConstructerInitialize {
    public static void main(String[] args){
        bookClass book1 = new bookClass("Java Programming", "John Doe", 500);
        bookClass book2 = new bookClass("Python Programming", "Jane Smith", 600);
        book1.display();
        book2.display();
    }
    
}
class bookClass{
    String Title;
    String Author;
    int Price;

    bookClass(String Title, String Author, int Price){
        this.Title = Title;
        this.Author = Author;
        this.Price = Price;
    }
    void display(){
        System.out.println(" Title: " + Title + " | Author: " + Author + " | Price: " + Price);
    }
}