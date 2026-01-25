import java.util.*;

public class CalculatorSw {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number a : ");
        int a = sc.nextInt();
        System.out.print("Enter the number b : ");
        int b = sc.nextInt();
        System.out.print("Choose an operator (+, -, *, /, %) : ");
        char op = sc.next().charAt(0);

        switch(op){
            case '+' : System.out.println("Sum of a and b is : " +(a + b));
            break;
            case '-' : System.out.println("Sub of a and b is : " +(a - b));
            break;
            case '*' : System.out.println("Mul of a and b is : " +(a * b));
            break;
            case '/' : System.out.println("Div of a and b is : " +(a / b));
            break;
            case '%' : System.out.println("Remander of a and b is : " +(a % b));
            break;
            default : System.out.println("Choose an right operator ");
        }

    }
}
