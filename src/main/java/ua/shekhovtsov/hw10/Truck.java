package ua.shekhovtsov.hw10;

import java.util.Arrays;

public class Truck extends Car {
    private String[] cargos;

    public Truck(String series, int year, String color, int fuel) {
        super(series, year, color, fuel);

    }

    public void loadCargo(String cargo) {
        if (this.cargos == null) {
            cargos = new String[1];
            cargos[0] = cargo;
            System.out.println("New Cargo!");
            return;
        }
        String[] tempCargoBox = new String[cargos.length + 1];
        for (int i = 0; i < tempCargoBox.length; i++) {
            if (i == tempCargoBox.length - 1) {
                tempCargoBox[i] = cargo;
                System.out.println("Good Job!");
                continue;
            }
            tempCargoBox[i] = cargos[i];
        }
        cargos = tempCargoBox;
    }

    public void unloadCargo(String cargo) {
        boolean mark = false;
        if (this.cargos == null) {
            System.out.println("There are not cargos to unload!");
            return;
        }
        String[] tempCargoBox = new String[cargos.length - 1];
        for (int i = 0, j = 0; i < cargos.length; i++) {
            if (cargos[i].equals(cargo)) {
                mark = true;
                System.out.println("Great Job!");
                continue;
            }
            tempCargoBox[j++] = cargos[i];
        }
        if (!mark) {
            System.out.println("Cargo not fond!");
            return;
        }
        cargos = tempCargoBox;
    }

    @Override
    public void getStats() {
        System.out.println("Cargos: " + Arrays.toString(cargos));
    }

    @Override
    public void moveCar() throws InterruptedException {
        while (true) {
            if (this.getFuel() <= 0) {
                System.out.println("Not Enouhg Fuel!");
                break;
            }
            System.out.println("Move, Car! Fuel: " + this.getFuel());
            Thread.sleep(100);
            this.setFuel(this.getFuel() - 2);
        }
    }
}
