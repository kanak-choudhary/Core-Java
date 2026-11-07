public class SmallesrNumFind {
    public static void main(String[] args) {
        
        int num1=90;
        int num2=4;
        int num3=22;

        if (num1<num2 && num2 <=num3) {
            System.out.println(num1 + " is smaller");
        }
        else if (num2<num1 && num1<=num3) {
            System.out.println(num2 + " Is Smaller");
        }
        else if (num3<num2 && num1>=num2) {
            System.out.println(num3 + " IS smoller");
        }
        else{
            System.out.println(
                " error"
            );
        }
    }
}
