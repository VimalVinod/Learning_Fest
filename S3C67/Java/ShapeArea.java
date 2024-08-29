import java.util.Scanner;

class ShapeArea {

    public double calculateArea(double radius) {
        double pi = 3.141592653589793;
        return pi * radius * radius;
    }

    public double calculateArea(double length, double width) {
        return length * width;
    }

    public double calculateArea(double base, double height, boolean isTriangle) {
        if (isTriangle) {
            return 0.5 * base * height;
        }
        return 0;
    }

    public static void main(String[] args) {
        ShapeArea shapeArea = new ShapeArea();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select shape to calculate area:");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Triangle");
        System.out.print("Enter your choice (1/2/3): ");
        int choice = scanner.nextInt();

        double area = 0;
        switch (choice) {
            case 1:
                System.out.print("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();
                area = shapeArea.calculateArea(radius);
                System.out.println("Area of the circle: " + area);
                break;
            case 2:
                System.out.print("Enter the length of the rectangle: ");
                double length = scanner.nextDouble();
                System.out.print("Enter the width of the rectangle: ");
                double width = scanner.nextDouble();
                area = shapeArea.calculateArea(length, width);
                System.out.println("Area of the rectangle: " + area);
                break;
            case 3:
                System.out.print("Enter the base of the triangle: ");
                double base = scanner.nextDouble();
                System.out.print("Enter the height of the triangle: ");
                double height = scanner.nextDouble();
                area = shapeArea.calculateArea(base, height, true);
                System.out.println("Area of the triangle: " + area);
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }

        scanner.close();
    }
}
