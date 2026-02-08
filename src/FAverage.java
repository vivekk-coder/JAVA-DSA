import java.util.Scanner;

public class FAverage {
    public static int Average(int a, int b, int c) {

        int ave = (a + b + c) / 3;
        return ave;

    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();
        System.out.print("Enter third number : ");
        int c = sc.nextInt();

        int ave = Average(a, b, c);
        System.out.println("Averrage of three number is : " + ave);

    }
}
