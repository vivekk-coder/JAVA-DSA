import java.util.Scanner;

public class FcalculateSum {
    public static int calculateSum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = calculateSum(a, b);
        System.out.print("sum of two number is : " + sum);
    }
}
