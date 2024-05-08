package Hello;
import java.util.Scanner;
public class operators {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter the operation (+, -, *, /): ");
        char op = sc.next().charAt(0);

        int result = 0;
        switch (op) {
            case '+':
                result = num1 + num2;
                System.out.println("Sum of two number is: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Subtraction of two number is: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Multiplication of two number is: " + result);
                break;
            case '/':
                    result = num1 / num2;
                System.out.println("Division of two number is: " + result);
       
                break;
            default:
                System.out.println("Error: Invalid operation");
                break;
        }
        
        sc.close();
    }
}
