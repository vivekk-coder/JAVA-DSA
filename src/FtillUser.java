import java.util.Scanner;

public class FtillUser {
    public static int[] manynum(int num) {
        int positive = 0;
        int negative = 0;
        int zero = 0;

        if (num > 0) {
            positive++;
        } else if (num < 0) {
            negative++;
        } else {
            zero++;
        }
        return new int[]{positive, negative, zero};


    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char choose;
        int num;
        do {
            System.out.print("Enter number for counter pos/neg/zero : ");
            num = sc.nextInt();


            System.out.print("Are you Enter the number (y/n) : ");
            choose = sc.next().charAt(0);

        } while (choose == 'y' || choose == 'y');


        int[] result = manynum(num);

        System.out.println("positive number is " + result[0]);
        System.out.println("negative number is " + result[1]);
        System.out.println("zero number is " + result[2]);


        // Incomplete and stub code
    }
}
