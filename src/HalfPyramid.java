import java.util.Scanner;

public class HalfPyramid {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x number for (row) outer loop : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
