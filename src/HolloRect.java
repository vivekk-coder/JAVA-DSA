import java.util.Scanner;

public class HolloRect {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x number for (row) outer loop : ");
        int x = sc.nextInt();
        System.out.print("Enter Y number for (column) inner loop : ");
        int y = sc.nextInt();

        for (int i = 1; i <= x; i++) {

            for (int j = 1; j <= y; j++) {
                if (i == 1 || j == 1 || i == x || j == y) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
