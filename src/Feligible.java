import java.util.Scanner;

public class Feligible {
    public static String Eligible(int age) {
        if (age >= 18) {
            return "you are Eligible for voting";
        } else {
            return "You are not Eligible for voting";
        }
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Enter your age for voting you are eligible or not : ");
                int age = sc.nextInt();
                if (age == 0) break;

                String result = Eligible(age);
                System.out.println(result);
            } catch (Exception e) {
                System.out.println("Enter age not character or Symbol ! ");
                sc.nextLine();
            }
        }
    }
}
