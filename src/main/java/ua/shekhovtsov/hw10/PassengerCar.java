package ua.shekhovtsov.hw10;

public class PassengerCar extends Car{
    private Passenger[] passengers;

    public PassengerCar(String series, int year, String color, int fuel) {
        super(series, year, color, fuel);
        this.passengers = new Passenger[3];
    }

    public void addPassanger() {
        for (int i = 0; i < passengers.length; i++) {
            if(passengers[i] == null) {
                passengers[i] = new Passenger();
                System.out.println("Done!");
                return;
            }
        }
        System.out.println("Can't add more passangers!");
    }

    private class Passenger {
        private String name;
    }
}
