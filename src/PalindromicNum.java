import java.util.Scanner;

public class PalindromicNum {
    static void main(String[] atgs) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x number for (row) outer loop : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            //print 1st half
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            //print second half
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
