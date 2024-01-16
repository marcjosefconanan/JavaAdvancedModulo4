//Crea una classe Person con i campi firstName, lastName, age e address, i getter and i setter
//Il costruttore accetterà un Builder in input
//Creare una classe Builder che attraverso il costruttore e dei metodi specifici (tranne nome e cognome, gli altri campi sono opzionali) per costruire l'oggetto Person.
//Creare due oggetti Person e stamparli a video
public class Main {
    public static void main(String[] args) {
        Builder builder = new Builder();
        builder.setFirstName("Marc Josef");
        builder.setLastName("Conanan");
        builder.setAge(24);
        builder.setAddress("Sotto il ponte di san marco");

        Person person1 = builder.Build();

        builder.setFirstName("Ciccio");
        builder.setLastName("Bello");
        builder.setAge(132);
        builder.setAddress("A Spaccanapoli ma a Milano");
        Person person2 = builder.Build();

        System.out.println(person1);
        System.out.println(person2);
    }
}