public class largestNumber {
    public static void main(String[] args) {
        
        int num1=23;
        int num2=234;
        int num3=87;

        if (num1<num2 && num2>num3) {
            System.out.println(num2 + " is largest number ");
        }
        else if (num1>num2 && num1>num3) {
            System.out.println(num1 + " is laegest number");
        }
        else{
            System.out.println(num3 + " is largest number ");
        }
    }
}
