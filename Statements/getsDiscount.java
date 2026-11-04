public class getsDiscount {
    public static void main(String[] args) {
        
        int amount=1000;

        if (amount >= 1500) {
            System.out.println("Customer gets a discount");
        }
        else{
            System.out.println("Customer can't gets discount because purchase amount is less than 1500 $");
        }
    }
}
