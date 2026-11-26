// 3. Print all even numbers from 1 to N.

import java.util.Scanner;

class evenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        
        System.out.println("Loop end");
        
        sc.close();
    }
}