import java.util.Scanner;

public class Diamond {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x number for (row) outer loop : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            //print space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            //print stsrs
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //lower half
        for (int i = n - 1; i >= 1; i--) {
            //print space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            //print stsrs
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
