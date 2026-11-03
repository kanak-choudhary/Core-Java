
public class passFail {

    public static void main(String[] args) {

        int marks = 91;

        if (marks < 100) {

            if (marks >= 33) {

                System.out.println("student is pass");
            } 
            else if (marks < 33) {
                System.out.println("student is fail");
            }
        }
        else {
            System.out.println("invalid marks");
        }

    }
}
