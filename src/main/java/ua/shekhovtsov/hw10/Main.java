package ua.shekhovtsov.hw10;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        PassengerCar car = new PassengerCar("1111", 2000, "blue", 20);
        car.addPassanger();
        car.addPassanger();
        car.addPassanger();
        car.addPassanger();
        car.moveCar();


        Truck truck = new Truck("Truck", 2004, "Red", 20);
        truck.unloadCargo("1");
        truck.loadCargo("1");
        truck.loadCargo("2");
        truck.loadCargo("3");
        truck.loadCargo("4");
        truck.getStats();
        truck.unloadCargo("3");
        truck.getStats();
        truck.moveCar();
        truck.refuel();
        truck.moveCar();
    }
}
