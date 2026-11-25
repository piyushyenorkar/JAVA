package BasicsofJava.Exercise;

public class SimpleBill {
    public static void main(String[] args) {
        int itemPrice = 190;
        int quantity = 20;
        int subtotal = itemPrice * quantity;
        int tax = subtotal * 18/100;
        int finalBill = subtotal + tax;
        System.out.println("Subtotal:" + subtotal);
        System.out.println("Tax:" + tax);
        System.out.println("FinalBill:" + finalBill);
    }
}
