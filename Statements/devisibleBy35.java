public class devisibleBy35 {
    public static void main(String[] args) {
        
        int num=30;

        if (num>0) {
            if (num%3==0 && num%5==0) {
            System.out.println(num + " is divisible by 3 & 5");
        }
        else if (num%3==0) {
            System.out.println(num + "Is divisible by 3");
        }
        else if (num%5==0) {
            System.out.println(num + "Is divisible by 5");
        }
       
        else{
            System.out.println("divisible by athore numbers ");
        }
        }
      
    }
}
