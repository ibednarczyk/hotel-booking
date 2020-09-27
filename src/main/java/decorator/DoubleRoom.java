package decorator;

public class DoubleRoom implements Accommodation {

    @Override
    public String book() {

        return "Dear Guest, you have booked double room with following services: ";
    }

    @Override
    public double price() {
        return 300;
    }
}
