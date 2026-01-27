import java.util.Scanner;

public class Loop {
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

    }
}
