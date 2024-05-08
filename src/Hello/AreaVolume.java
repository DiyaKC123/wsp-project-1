package Hello;
import java.util.Scanner;

public class AreaVolume {
	 // Method to calculate area
    public static double getArea(double length, double breadth) {
        return length * breadth;
    }

    // Method to calculate volume
    public static double getVolume(double length, double breadth, double height) {
        return length * breadth * height;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input length and breadth for area
        System.out.print("Enter length for area: ");
        double lengthArea = sc.nextDouble();

        System.out.print("Enter breadth for area: ");
        double breadthArea = sc.nextDouble();

        // Calculate and display area
        double area = getArea(lengthArea, breadthArea);
        System.out.println("Area: " + area);

        // Input length, breadth, and height for volume
        System.out.print("Enter length for volume: ");
        double lengthVolume = sc.nextDouble();

        System.out.print("Enter breadth for volume: ");
        double breadthVolume = sc.nextDouble();

        System.out.print("Enter height for volume: ");
        double heightVolume = sc.nextDouble();

        // Calculate and display volume
        double volume = getVolume(lengthVolume, breadthVolume, heightVolume);
        System.out.println("Volume: " + volume);

        sc.close();
    }
}
