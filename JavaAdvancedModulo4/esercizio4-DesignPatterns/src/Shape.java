public interface Shape {
    void drawShape(EnumType type, double side, double height);
    default double area() {
        return 0;
    }
}
