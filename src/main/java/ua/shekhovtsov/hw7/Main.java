package ua.shekhovtsov.hw7;

/*Создайте класс Car который содержит четыре свойства (дополнительных объектов создавать не требуется)
manufacturer
engine
colour
petrol
Создайте несколько экземпляров Car, установите значения свойствам (с помощью set’ров)
и выведите информацию на консоль (toString)

Добавьте методы:
startEngine принимающий параметр name. Метод выводит в консоль “{name} запустил двигатель”
isEnoughPetrolLevel проверяет количество бензина, если значение ниже 50 - возвращает - false, если больше - true

Добавить конструктор в класс, который принимает на вход 3 параметра (manufacturer, engine, colour),
устанавливает их и дополнительно задает значение petrol = 100
*/

public class Main {
    public static void main(String[] args) {
       /* Car car1 = new Car();
        car1.setManufacturer("Audi");
        car1.setEngine(3.6);
        car1.setColor("Black");
        car1.setPetrol(55);
        Car car2 = new Car();
        car2.setManufacturer("Ford");
        car2.setEngine(4.6);
        car2.setColor("Red");
        car2.setPetrol(122);
        Car car3 = new Car();
        car3.setManufacturer("Peugeot");
        car3.setEngine(1.6);
        car3.setColor("White");
        car3.setPetrol(49);
        printCar(car1);
        printCar(car2);
        printCar(car3);
        if (Car.isEnoughPetrolLevel(car1)) {
            Car.startEngine(car1.getManufacturer());
        }
        if (Car.isEnoughPetrolLevel(car2)) {
            Car.startEngine(car2.getManufacturer());
        }
        if (Car.isEnoughPetrolLevel(car3)) {
            Car.startEngine(car3.getManufacturer());
        }*/
        Car car1 = new Car(Manufacturer.AUDI, new Engine(200, "diesel"), "Green");
        System.out.println(car1);
    }

    private static void printCar(Car car) {
        System.out.println("manufacturer: " + car.getManufacturer());
        System.out.println("engine: " + car.getEngine());
        System.out.println("color: " + car.getColor());
        System.out.println("patrol: " + car.getPetrol());
    }
}
