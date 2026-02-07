import java.util.Scanner;

public class Function {
    public static void PrintMyName(String name) {
        System.out.println(name);
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        PrintMyName(name);
        PrintMyName(name);
    }
}
