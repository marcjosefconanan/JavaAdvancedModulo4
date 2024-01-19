public class ShapeFactory {
    public Shape createShape(EnumType type, double side, double height) {
        if (type == EnumType.TRIANGLE) {
            return new Triangle(side, height);

        } else if (type == EnumType.RECTANGLE) {
            return new Rectangle(side, height);

        } else {
            throw new IllegalArgumentException("shape non valido");
        }
    }
}












































/*
public class ShapeImp implements Shape {

    @Override
    public void drawShape(EnumType type, double side, double height) {
        if (type == EnumType.TRIANGLE) {
            Triangle triangle = new Triangle(side, height);
            double area = triangle.area();
            System.out.println("Il triangolo " + triangle + "\n" + "di Area: " + area);

        } else if (type == EnumType.RECTANGLE) {
            Rectangle rectangle = new Rectangle(side, height);
            double area = rectangle.area();
            System.out.println("Il rettangolo " + rectangle + "\n" + "di Area: " + area);

        } else {
            System.out.println("Forma non trovata");
        }
    }

    @Override
    public double area() {
        return 0;
    }
}*/