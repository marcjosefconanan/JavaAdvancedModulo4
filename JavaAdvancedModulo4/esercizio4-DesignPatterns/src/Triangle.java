public class Triangle implements Shape {
    private double side;
    private double height;

    public Triangle(double side, double height) {
        this.side = side;
        this.height = height;
    }

    @Override
    public double area() {
        return (side * height) / 2;
    }

    @Override
    public void drawShape(EnumType type, double side, double height) {
        // Implementation of drawShape for Triangle
        System.out.println("Drawing Triangle");
    }

    @Override
    public String toString() {
        return "Triangle{ " +
                "side= " + side +
                ", height= " + height +
                " }";
    }
}