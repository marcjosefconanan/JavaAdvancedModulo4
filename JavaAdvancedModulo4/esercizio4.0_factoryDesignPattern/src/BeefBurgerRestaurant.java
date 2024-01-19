public class BeefBurgerRestaurant extends Restaurant {
    @Override
    protected Burger createBurger() {
        return new BeefBurger();
    }
}