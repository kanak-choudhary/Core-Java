// 6. Find the sum of numbers from 1 to N.

import java.util.Scanner;

public class sumOfNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        
System.out.println("loop end");
        System.out.println("Sum = " + sum);

        sc.close();
    }
}