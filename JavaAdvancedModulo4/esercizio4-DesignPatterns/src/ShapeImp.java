public class ShapeImp implements Shape {
    @Override
    public void drawShape(EnumType type, double side, double height) {
        if (type == EnumType.TRIANGLE) {
            Triangle triangle = new Triangle(side, height);
            double area = triangle.area();
            System.out.println("Il Triangolo " + triangle + "\n" + "di Area: " + area);

        } else if (type == EnumType.RECTANGLE) {
            Rectangle rectangle = new Rectangle(side, height);
            double area = rectangle.area();
            System.out.println("Il Rettangolo " + rectangle + "\n" + "di Area: " + area);

        } else {
            System.out.println("Forma non trovata");
        }
    }
}
