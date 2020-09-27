package decorator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StandardRoomPackage extends Decorator {

    List<Standard> standards = new ArrayList<>();

    StandardRoomPackage(Accommodation accommodation, Standard... standards) {
        super(accommodation);
        this.standards.addAll(Arrays.asList(standards));
    }

    @Override
    public String book() {
        return orderStandardServices(super.book()) + " in the total price of " + price() + " ";
    }

    @Override
    public double price() {
        return super.price() + 100 * standards.size();
    }

    public String orderStandardServices(String extras) {

       return extras + "services from Standard package: " + standards;

    }
}
