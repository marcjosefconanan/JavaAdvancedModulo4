public class Rectangle implements Shape {
    private double side;
    private double height;

    public Rectangle(double side, double height) {
        this.side = side;
        this.height = height;
    }

    @Override
    public double area() {
        return side * height;
    }

    @Override
    public void drawShape(EnumType type, double side, double height) {
        // implementa drawshape per il triangolo
        System.out.println("Drawing Rectangle");
    }

    @Override
    public String toString() {
        return "Rectangle{ " +
                "side= " + side +
                ", height= " + height +
                " }";
    }
}