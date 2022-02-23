package ua.shekhovtsov.hw10;

public class Car implements Recovery{
    private final int FULL_CHARGE;

    private String series;
    private int year;
    private String color;
    private int fuel;


    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public Car(String series, int year, String color, int fuel) {
        this.series = series;
        this.year = year;
        this.color = color;
        this.fuel = fuel;
        FULL_CHARGE = fuel;
    }

    public void moveCar() throws InterruptedException {
        while (true) {
            if (fuel <= 0) {
                System.out.println("Not Enouhg Fuel!");
                break;
            }
            System.out.println("Move, Car! Fuel: " + fuel);
            Thread.sleep(100);
            fuel--;
        }

    }

    public void getStats() {
        System.out.println("Generate some Statistics...");
    }

    @Override
    public void refuel() {
        System.out.println("Refuel success!");
        this.setFuel(FULL_CHARGE);
    }
}

