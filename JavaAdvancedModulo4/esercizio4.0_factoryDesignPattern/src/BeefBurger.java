import java.util.ArrayList;
import java.util.List;

public class BeefBurger implements Burger {
    private double baseCost = 5.99;
    private List<AddOnsEnum> addons = new ArrayList<>();

    @Override
    public void prepare() {
        System.out.println("Preparing beef burger...");
    }

    @Override
    public double cost() {
        return baseCost + addons.size() * 1.0; // addon costs $1.0
    }
    @Override
    public void addAddon(AddOnsEnum addonsEnum) {
        addons.add(addonsEnum);
        System.out.println("Adding " + addonsEnum + " to the beef burger.");
    }
}