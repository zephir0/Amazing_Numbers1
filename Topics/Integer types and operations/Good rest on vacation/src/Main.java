import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //System.out.println("How many days?");
        int daysInHotel = scanner.nextInt();
       // System.out.println("Food cost per day:");
        int foodCostPerDay = scanner.nextInt();
       // System.out.println("One-way flight cost:");
        int oneWayFlight = scanner.nextInt();
       // System.out.println("How much is one night in that hotel?");
        int hotelNightCost = scanner.nextInt();
        int foodCostInTotal = daysInHotel * foodCostPerDay;
        int flightCostInTotal = oneWayFlight *2;
        int hotelNightCostIntotal = hotelNightCost *(daysInHotel -1);
        int totalAmount = foodCostInTotal + flightCostInTotal + hotelNightCostIntotal;
       // System.out.println("It will cost you:");
        System.out.println(totalAmount);

    }
}