package Hello;
import java.util.Scanner;

public class SIcalculate {

	    // Method for input
	    public static double[] getInput() {
	        Scanner sc = new Scanner(System.in);
	        double[] inputValues = new double[3];

	        // Input principal amount
	        System.out.print("Enter the principal amount: ");
	        inputValues[0] = sc.nextDouble();

	        // Input rate of interest
	        System.out.print("Enter the rate of interest: ");
	        inputValues[1] = sc.nextDouble();

	        // Input time period in years
	        System.out.print("Enter the time period (in years): ");
	        inputValues[2] = sc.nextDouble();

	        sc.close();

	        return inputValues;
	    }

	    // Method for processing
	    public static double calculateSimpleInterest(double[] inputValues) {
	        double principal = inputValues[0];
	        double time = inputValues[1];
	        double rate = inputValues[2];

	        return (principal * time * rate) / 100;
	    }

	    // Method for output
	    public static void displayResult(double simpleInterest) {
	        System.out.println("Simple Interest: " + simpleInterest);
	    }

	    public static void main(String[] args) {
	        // Get input values
	        double[] inputValues = getInput();

	        // Calculate simple interest
	        double simpleInterest = calculateSimpleInterest(inputValues);

	        // Display the result
	        displayResult(simpleInterest);
	    }
	}

