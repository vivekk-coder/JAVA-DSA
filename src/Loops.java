import java.util.Scanner;

public class Loops {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        //for loop
        System.out.println("for loop start");

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }


        //while loop
        System.out.println("while loop start");

        int b = 1;
        while (b < 10) {
            System.out.println(b);

            b++;
        }

        //do while loop
        System.out.println("do while loop start");

        int c = 1;
        do {
            System.out.println(c);
            c++;
        } while (c <= 8);


        // Difference b/t while and do while loop

        System.out.println("diffeerence");

        int x = 10;
        while (x <= 9) {
            System.out.println(x);
            x++;
        }


        int y = 12;
        do {
            System.out.println(y);
            y++;
        } while (y <= 11);
    }
}
