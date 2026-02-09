import java.util.Scanner;

public class FgraterAndLower {
    public static void greaterLower(int a, int b) {
        if (a < b) {
            System.out.println("b is greater then a ");
        } else if (b > a) {
            System.out.println("a is greater then b ");
        } else {
            System.out.println("booth are equals");
        }

    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a number : ");
            int a = sc.nextInt();
            System.out.print("Enter b number : ");
            int b = sc.nextInt();

            greaterLower(a, b);

        }
    }
}
