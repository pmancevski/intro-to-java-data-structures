import java.util.Scanner;

public class Exercise2_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius and length of a cylinder: ");
        double radius = input.nextDouble();
        double length = input.nextDouble();

        double cylinderArea = radius * radius * Math.PI;
        double cylinderVolume = cylinderArea * length;

        System.out.println("The area of the cylinder is " + cylinderArea);
        System.out.println("The volume of the cylinder is " + cylinderVolume);
    }
}
