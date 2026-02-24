import java.util.Scanner;

public class Fcircumfarance {
    public static float Curcumfarance(float r) {
        // circumfarance = 2* pi * r;
        float result = (float) (2 * 3.14 * r);
        return result;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Enter the value of radius for curcumfarance : ");
                float r = sc.nextFloat();

                if (r == 0) break;

                float result = Curcumfarance(r);

                System.out.println("The Circumfarance is : " + result);

            } catch (Exception e) {
                System.out.println("Enter digits only ! ");
                sc.nextLine();
            }
        }
    }
}
