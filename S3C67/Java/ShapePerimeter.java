class ShapePerimeter {
    private double radius;
    private double length;
    private double width;

    
    public ShapePerimeter(double radius) {
        this.radius = radius;
    }

    
    public ShapePerimeter(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getPerimeter() {
        double pi = 3.141592653589793;
        return 2 * pi * radius;
    }

    public double getPerimeterRectangle() {
        return 2 * (length + width);
    }

    public static void main(String[] args) {
        ShapePerimeter circle = new ShapePerimeter(5.0);
        ShapePerimeter rectangle = new ShapePerimeter(4.0, 6.0);

        System.out.println("Perimeter of the circle: " + circle.getPerimeter());
        System.out.println("Perimeter of the rectangle: " + rectangle.getPerimeterRectangle());
    }
}
