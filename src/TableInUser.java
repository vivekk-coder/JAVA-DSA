import java.util.Scanner;

public class TableInUser {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number for print a table : ");
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            int table = n * i;
            System.out.println(table);
        }
//        System.out.println("result"+table);
    }
}
