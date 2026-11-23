import java.util.Scanner;

class printNTo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        while (n >= 1) {
            System.out.println(n);
            n--;
        }
        System.out.println("code updated");

        sc.close();
    }
}