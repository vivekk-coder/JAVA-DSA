import java.util.Scanner;

public class Ffactorial {
    public static void Factorial(int n) {

        if (n < 0) {
            System.out.println("Invalid number : " + n);
            return;
        }

        int factorial = 1;
        for (int i = n; i >= 1; i--) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Factorial(n);
    }
}
