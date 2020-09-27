package decorator;

public abstract class Decorator implements Accommodation {
    private Accommodation decoratedAccommodation;

    Decorator(Accommodation accommodation) {
        this.decoratedAccommodation = accommodation;

    }

    @Override
    public String book() {
        return decoratedAccommodation.book();

    }

    @Override
    public double price() {
        return decoratedAccommodation.price();
    }


}