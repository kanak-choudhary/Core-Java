
public class formEligible {

    public static void main(String[] args) {

        int age = 24;
        
        System.out.println("the age is "+ age);
        if (age > 0) {
            if (age >= 20) {
                System.out.println("Candidate is eligible to fill the form");
            } else {
                System.out.println("Candidate not eligible to fill the form");
            }
        }
    }

}
