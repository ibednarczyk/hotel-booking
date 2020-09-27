package decorator;



public class Booking {

    public static void main(String[] args) {
        PremiumRoomPackage premiumRoom = new PremiumRoomPackage(new DoubleRoom(), Premium.CONCIERGE, Premium.FITNESS);
        StandardRoomPackage standardRoom = new StandardRoomPackage(new DoubleRoom(), Standard.BREAKFAST, Standard.EXTRA_CLEANING);

        System.out.println(premiumRoom.book());
        System.out.println(standardRoom.book());

    }
}


