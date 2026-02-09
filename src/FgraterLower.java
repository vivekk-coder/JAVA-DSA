import java.util.Scanner;

public class FgraterLower {
    public static String GreaterLower(int a, int b) {
        if (a > b) {
            return "A is greater the b";
        } else if (a < b) {
            return " B is greater then a";
        } else {
            return "Booth numbers are equal";
        }
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter the number a : ");
            int a = sc.nextInt();
            System.out.print("Enter the number b : ");
            int b = sc.nextInt();
            if (a == 0 && b == 0) break;

            String result = GreaterLower(a, b);
            System.out.println(result);
        }
    }
}
