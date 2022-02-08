package ua.shekhovtsov.hw7;

enum Manufacturer {
    AUDI("АУДИ"),
    FORD("ФОРД"),
    PEUGEOT("ПЕЖО");
    private String russianName;

    Manufacturer(String name) {
        this.russianName = name;
    }

    public String getManufacturer() {
        return russianName;
    }

    public String toString() {
        return russianName;
    }
}
