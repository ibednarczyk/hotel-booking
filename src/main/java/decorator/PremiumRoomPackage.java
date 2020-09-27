package decorator;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PremiumRoomPackage extends Decorator {

    private List<Premium> premiums = new ArrayList<>();
    PremiumRoomPackage(Accommodation accommodation, Premium... premiums) {
        super(accommodation);
        this.premiums.addAll(Arrays.asList(premiums));

    }

    @Override
    public String book() {
        return orderPremiumServices(super.book()) + " in the total price of " + price() + " ";
    }

    @Override
    public double price() {
        return super.price() + 200 * premiums.size();

    }

    public String orderPremiumServices(String extras) {
        return extras + "services from Premium package: " + premiums;
    }
}
