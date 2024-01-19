public class VeggieBurgerRestaurant extends Restaurant {
    @Override
    protected Burger createBurger() {
        return new VeggieBurger();
    }
}