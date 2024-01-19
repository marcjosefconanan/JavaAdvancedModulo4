public class Main {
    public static void main(String[] args) {
        // Creating a BeefBurgerRestaurant and ordering a beef burger with addons
        Restaurant beefBurgerRestaurant = new BeefBurgerRestaurant();
        Burger beefBurger = beefBurgerRestaurant.orderBurger();
        customizeBurger(beefBurger);
        printOrderDetails(beefBurger);

        System.out.println();

        // Creating a VeggieBurgerRestaurant and ordering a veggie burger with addons
        Restaurant veggieBurgerRestaurant = new VeggieBurgerRestaurant();
        Burger veggieBurger = veggieBurgerRestaurant.orderBurger();
        customizeBurger(veggieBurger);
        printOrderDetails(veggieBurger);
    }

    private static void customizeBurger(Burger burger) {
        // Add addons to the burger
        burger.addAddon(AddOnsEnum.CHEESE);
        burger.addAddon(AddOnsEnum.TOMATO);
    }

    private static void printOrderDetails(Burger burger) {
        System.out.println("Burger Details:");
        System.out.println("Type: " + burger.getClass().getSimpleName());
        System.out.println("Cost: $" + burger.cost());
        System.out.println();
    }
}