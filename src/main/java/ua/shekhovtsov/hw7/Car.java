package ua.shekhovtsov.hw7;

public class Car {
    Manufacturer manufacturer;
    Engine engine;
   // private double engine;
    private String color;
    private double petrol;

    Car (Manufacturer manufacturer, Engine engine, String color) {
        this.manufacturer = manufacturer;
        this.engine = engine;
        this.color = color;
        this.petrol = 100;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPetrol() {
        return petrol;
    }

    public void setPetrol(int petrol) {
        this.petrol = petrol;
    }

    public static void startEngine(String name){
        System.out.println(name + " starts engine");
    }
    public static boolean isEnoughPetrolLevel(Car car) {
        if(car.getPetrol() > 50) {
            return true;
        }
        return false;
    }
    public String toString() {
        return getManufacturer().toString();
    }
}
