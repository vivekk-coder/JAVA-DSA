import java.util.Scanner;

public class FAverageCheckAgain {
    public static int AverageCheck(int a, int b, int c) {
        int ave = (a + b + c) / 3;
        return ave;

    }

    static void main(String[] args) {

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("If you Enter zero number then you Exit the code ");
            System.out.print("Enter 1st number : ");
            int a = sc.nextInt();
            System.out.print("Enter 2nd number : ");
            int b = sc.nextInt();
            System.out.print("Enter 3rd number : ");
            int c = sc.nextInt();

            if (a == 0 || b == 0 || c == 0) break;
            if (a < 0 || b < 0 || c < 0) {
                System.out.println("Invalid number ! tryagain ");
                continue;
            }
            int average = AverageCheck(a, b, c);
            System.out.println("Average of " + a + ", " + b + ", " + c + " is : " + average);

        }

    }

}

