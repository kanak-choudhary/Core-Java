import java.util.Scanner;

public class squareNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int square = i * i;
            System.out.println("Square of " + i + " = " + square);
        }

        sc.close();
    }
}