import java.util.Scanner;

public class Fproduct {
    public static int calculateProduct(int a, int b) {
        return a * b;

    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Product of 2 number is : " + calculateProduct(a, b));
    }
}
