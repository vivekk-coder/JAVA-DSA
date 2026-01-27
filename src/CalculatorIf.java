import java.util.Scanner;

public class CalculatorIf {

    static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number a : ");
        float a = sc.nextFloat();
        System.out.print("Enter the number b : ");
        float b = sc.nextFloat();
        System.out.print("Enter the operator (+, -, *, /, %) : ");
        char op = sc.next().charAt(0);

        if(op == '+'){
            System.out.println("Sum of a and b is : " + (a+b));
        }else if(op == '-'){
            System.out.println("Sub of a and b is : " + (a-b));
        }else if(op == '*'){
            System.out.println("Mul of a and b is : " + (a*b));
        }else if(op == '/'){
            System.out.println("Div of a and b is : " + (a/b));
        }else if(op == '%'){
            System.out.println("remander of a and b is : " + (a%b));
        }else{
            System.out.println("Invalid operato");
        }

    }

}
