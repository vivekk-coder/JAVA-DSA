import java.util.Scanner;

public class FgreaterLowerN {
    public static int GreaterLowerN(int a, int b) {
        if (a > b) {
            return 1;
        } else if (a < b) {
            return 2;
        } else {
            return 0;
        }
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Enter the number a : ");
                int a = sc.nextInt();
                System.out.print("Enter the number b : ");
                int b = sc.nextInt();

                if (a == 0 && b == 0) break;
                int result = GreaterLowerN(a, b);

                if (result == 1) {
                    System.out.println("A is greater the b");
                } else if (result == 2) {
                    System.out.println("B is greater then a");
                } else {
                    System.out.println("Both values are equal ");
                }

            } catch (Exception e) {
                System.out.println("Please enter valid numbers only");
                sc.nextLine();
            }


        }
    }
}
