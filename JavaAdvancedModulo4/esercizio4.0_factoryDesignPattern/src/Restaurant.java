public abstract class Restaurant {
    public Burger orderBurger() {
        Burger burger = createBurger(); // Using the factory method to create a burger
        burger.prepare();
        return burger;
    }

    // Factory method to be implemented by concrete subclasses
    protected abstract Burger createBurger();
}