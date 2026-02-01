import java.util.Scanner;

public class FloydsTriangle {
    static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x number for (row) outer loop : ");
        int n = sc.nextInt();
        int number = 1;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;

            }
            System.out.println();
        }
    }
}
