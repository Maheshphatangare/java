import java.util.Scanner;

class Area {
    private double length;
    private double breadth;

    public Area(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double returnArea() {
        return length * breadth;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        double length = input.nextDouble();

        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = input.nextDouble();

        // Create an instance of the Area class
        Area rectangle = new Area(length, breadth);

        // Calculate and print the area of the rectangle
        double area = rectangle.returnArea();
        System.out.println("Area of the rectangle: " + area);

        input.close();
    }
}
