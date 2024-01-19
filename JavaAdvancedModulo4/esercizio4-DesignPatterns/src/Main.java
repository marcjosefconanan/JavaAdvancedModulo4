//Crea un'interfaccia Shape e un metodo draw, crea 2 o più classi che implementino Shape.
//Cre una enum che abbia tutti i tipi di shape che hai creato ( cerchio, rettangolo etc etc)
//Crea una factory class che abbia un metodo che ritorni la forma corretta (shape) in base all'enum in input.
//Stampa a video il risultato della funzione draw di ogni shape creata
public class Main {
    public static void main(String[] args) {
        // Creating l'istanza per il factory
        ShapeFactory shapeFactory = new ShapeFactory();

        // creo un triangolo e uso il factory
        Shape shape = shapeFactory.createShape(EnumType.TRIANGLE, 6, 8);
        shape.drawShape(EnumType.TRIANGLE, 6, 8);
    }
}