

import java.util.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.stream.Collectors;

class Hotel {
    int id;
    String name;
    int rating;
    int weekdayPrice;
    int weekendPrice;

    public Hotel(int id, String name, int rating, int weekdayPrice, int weekendPrice) {
        this.id = id;
        this.name = name;
        this.rating = rating;
        this.weekdayPrice = weekdayPrice;
        this.weekendPrice = weekendPrice;
    }

    public Integer getWeekdayPrice() {
        return weekdayPrice;
    }

    public void createHotel() {
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Enter HotelName: ");
        name = scan2.nextLine();
        System.out.println("Enter HotelRating: ");
        rating = scan2.nextInt();
        System.out.println("Enter weekdayPrice: ");
        weekdayPrice = scan2.nextInt();
        System.out.println("Enter weekendPrice: ");
        weekendPrice = scan2.nextInt();
    }
}

class Main {
    public static void main(String[] args) throws Exception {

        int id;
        String name;
        int rating;
        int weekdayPrice;
        int weekendPrice;
        int hotelCount = 3;
        String userDate;
        List<Hotel> hotelsList = new ArrayList<Hotel>();
        Scanner scan2 = new Scanner(System.in);

        hotelsList.add(new Hotel(1, "Lakewood", 3, 110, 90));
        hotelsList.add(new Hotel(2, "Bridgewood", 4, 150, 50));

        hotelsList.add(new Hotel(3, "ridgewood", 5, 220, 150));


        System.out.println("\n----Menu---" +
                "\n1: AddHotel" +
                "\n2: ShowHotels" +
                "\n3: AddRatings" +
                "\n4: ShowCheapestHotel" +
                "\nPress 0 to QUIT!..");
        System.out.println("Enter your choice => ");
        int choice = scan2.nextInt();

        do {
            switch (choice) {
                case 1:
                    //----- UC1
                    hotelCount++;
                    System.out.println("Enter HotelName: ");
                    name = scan2.next();
                    System.out.println("Enter HotelRating: ");
                    rating = scan2.nextInt();
                    System.out.println("Enter weekdayPrice: ");
                    weekdayPrice = scan2.nextInt();
                    System.out.println("Enter weekendPrice: ");
                    weekendPrice = scan2.nextInt();
                    // productsList.add(new Product(1,"HP Laptop",25000f));    

                    hotelsList.add(new Hotel(hotelCount, name, rating, weekdayPrice, weekendPrice));
                    System.out.println("Hotel added Successfully...\n");

                    System.out.println("\n----Menu---" +
                            "\n1: AddHotel" +
                            "\n2: ShowHotels" +
                            "\n3: AddRatings" +
                            "\n4: ShowCheapestHotel" +
                            "\nPress 0 to QUIT!..");
                    System.out.println("Enter your choice => ");
                    choice = scan2.nextInt();

                    break;

                case 2:
                    System.out.println("----------- Hotels List ----------\n");
                    System.out.println("Id \t" + "Name\t" + "Rating\t" + "weekdayPrice\t" + "weekendPrice\t");
                    hotelsList.stream()
                            .forEach(hotel -> System.out.println(hotel.id + "\t" +
                                    hotel.name + "\t" +
                                    hotel.rating + "\t" +
                                    hotel.weekdayPrice + "\t\t" +
                                    hotel.weekendPrice));
                    System.out.println("----------------------------------------------------------\n");

                    System.out.println("\n----Menu---" +
                            "\n1: AddHotel" +
                            "\n2: ShowHotels" +
                            "\n3: AddRatings" +
                            "\n4: ShowCheapestHotel" +
                            "\nPress 0 to QUIT!..");
                    System.out.println("Enter your choice => ");
                    choice = scan2.nextInt();

                    break;

                case 3:
                    System.out.println("----------- Add Rating to each Hotel ----------\n");
                    System.out.println("Id \t" + "Name\t" + "Rating\t");
                    hotelsList.stream()
                            .forEach(hotel -> System.out.println(hotel.id + "\t" +
                                    hotel.name + "\t" +
                                    hotel.rating + "\t"));
                    System.out.println("----------------------------------------------------------\n");
                    System.out.println("\n----Menu---" +
                            "\n1: AddHotel" +
                            "\n2: ShowHotels" +
                            "\n3: AddRatings" +
                            "\n4: ShowCheapestHotel" +
                            "\nPress 0 to QUIT!..");
                    System.out.println("Enter your choice => ");
                    choice = scan2.nextInt();
                    break;

                case 4:
                    //----UC 4
                    System.out.println("----------- Cheapest Hotel ----------\n");
                    System.out.println("Id \t" + "Name\t" + "Rating\t" + "weekdayPrice\t" + "weekendPrice\t");
                    Hotel hotel1 = hotelsList.stream()
                            .min(Comparator.comparingInt(Hotel::getWeekdayPrice)).get();

                    System.out.println(hotel1.id + "\t" +
                            hotel1.name + "\t" +
                            hotel1.rating + "\t" +
                            hotel1.weekdayPrice + "\t\t" +
                            hotel1.weekendPrice);

                    System.out.println("\n----Menu---" +
                            "\n1: AddHotel" +
                            "\n2: ShowHotels" +
                            "\n3: AddRatings" +
                            "\n4: ShowCheapestHotel" +
                            "\nPress 0 to QUIT!..");
                    System.out.println("Enter your choice => ");

                    choice = scan2.nextInt();
                    break;
            }
        } while (choice != 0);
    }
}  