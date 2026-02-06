import java.util.Scanner;

public class SolidRhombus {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n number for solid rhombus : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            //Space print
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            //Print Stars
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
