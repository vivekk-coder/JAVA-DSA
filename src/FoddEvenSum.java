import java.util.Scanner;

public class FoddEvenSum {
    public static int[] SumOddEven(int n) {
        int oddsum = 0, evensum = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                oddsum = oddsum + i;
            } else {
                evensum += i;
            }
        }
        return new int[]{oddsum, evensum};

    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        do {
            System.out.print("enter positive number : ");
            n = sc.nextInt();

        } while (n <= 0);

//        System.out.print("Enter the n number : ");
//        int n = sc.nextInt();

        int[] result = SumOddEven(n);
//        int sumeven = SumOddNum(n);
        System.out.println("Sum of all odd number is : " + result[0]);
        System.out.println("Sum of all even number is : " + result[1]);

    }
}
