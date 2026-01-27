import java.util.Scanner;

public class Patterns {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x number for (row) outer loop : ");
        int x = sc.nextInt();
        System.out.print("Enter Y number for (column) inner loop : ");
        int y = sc.nextInt();

        for (int i = 1; i <= x; i++) {

            for (int j = 1; j <= y; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
