public class vote18 {
    public static void main(String[] args) {
        
        int age = 12;

        if (age<0) {
            System.out.println("invalid age");
        }

        else  if
         (age<18) {
            System.out.println("you are not eligible for vote");
        }
        
        else if (age>=18) {
            System.out.println("you are eligible for vote");
        }
       
    }
}
