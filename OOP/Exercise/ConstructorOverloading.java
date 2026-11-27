package OOP.Exercise;

public class ConstructorOverloading {
    public static void main(String[] args){
        product pro = new product();
        pro.display();
    }
      
}
class product{
    String name;
    int price;
    product(){
        name = "milk";
        price = 90;
    }
    product(String name){
        this.name = name;
    }
    product(String name, int price){
        this.name = name;
        this.price = price;
    }
    void display(){
        System.out.println("Name: " + name + "\nPrice: " + price);
    }
        
}