import java.util.ArrayList;

class Hotel {
    String hotelName;
    double rates;
    int rating;


    public Hotel(String hotelName, double rates, int rating) {
        this.hotelName = hotelName;
        this.rates = rates;
        this.rating = rating;
    }

    public Hotel(String hotelName, double rates) {
        this.hotelName = hotelName;
        this.rates = rates;
    }

    public double getRate() {
        return rates;
    }

    public String getName() {
        return hotelName;
    }

    @Override
    public String toString() {
        String str = "Hotel name : " + this.hotelName + " rates for regular customer : " + this.rates;
        return str;
    }

}

class HotelReservation {
    static ArrayList<Hotel> hotelList = new ArrayList<Hotel>();

    public boolean addHotel(String hotelName, int rates, int rating) {
        Hotel hotel = new Hotel(hotelName, rates, rating);
        hotelList.add(hotel);
        System.out.println(hotelList.isEmpty());
        if (hotelList.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    static Hotel addHotel(String name, Double rates) {
        Hotel hotel = new Hotel(name, rates);
        hotelList.add(hotel);

        return hotel;
    }


    public static void main(String[] args) {
        ArrayList<Hotel> hotelArrayList = new ArrayList<>();

        hotelArrayList.add(addHotel("Lakewood", 110.0));
        hotelArrayList.add(addHotel("Bridgewood", 160.0));
        hotelArrayList.add(addHotel("Ridgewood", 220.0));

        System.out.println(hotelArrayList);
    }
}