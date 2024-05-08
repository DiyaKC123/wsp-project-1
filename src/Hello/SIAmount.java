package Hello;
import java.util.Scanner;
public class SIAmount {
	
	 // Method for input
    public static double[] input() {
        Scanner sc = new Scanner(System.in);
        double[] inputValues = new double[3];

        // Input principal amount
        System.out.print("Enter the principal amount (P): ");
        inputValues[0] = sc.nextDouble();

        // Input rate of interest
        System.out.print("Enter the rate of interest (R): ");
        inputValues[1] = sc.nextDouble();

        // Input time period in years
        System.out.print("Enter the time period (T): ");
        inputValues[2] = sc.nextDouble();

        sc.close();

        return inputValues;
    }

    // Method for processing to calculate Simple Interest and Amount
    public static double[] processing(double principal, double rate, double time) {
        double[] result = new double[2];

        // Calculate Simple Interest
        double si = (principal * rate * time) / 100;
        result[0] = si;

        // Calculate Amount
        double amount = principal + si;
        result[1] = amount;

        return result;
    }

    // Method for output
    public static void output(double si, double amount) {
        System.out.println("Simple Interest (SI): " + si);
        System.out.println("Amount (Principal + SI): " + amount);
    }

    public static void main(String[] args) {
        // Get input values
        double[] inputValues = input();
        double principal = inputValues[0];
        double rate = inputValues[1];
        double time = inputValues[2];

        // Calculate Simple Interest and Amount
        double[] result = processing(principal, rate, time);
        double si = result[0];
        double amount = result[1];

        // Output results
        output(si, amount);
    }
}