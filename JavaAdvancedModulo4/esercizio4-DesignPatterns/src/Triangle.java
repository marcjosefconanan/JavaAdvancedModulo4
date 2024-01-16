public class Triangle implements Shape {
    private double side;
    private double height;

    public Triangle(double side, double height) {
        this.side = side;
        this.height = height;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double area() {
        return (side * height) / 2;
    }
    @Override
    public void drawShape(EnumType type, double side, double height) {

    }
    @Override
    public String toString() {
        return "Rectangle{ " +
                "side= " + side +
                ", height= " + height +
                " }";
    }
}
