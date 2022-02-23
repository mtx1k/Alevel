package ua.shekhovtsov.hw11;

import lombok.Data;

import java.util.Random;

@Data
public class MobilePhone extends Phone {
    private int batteryStatus;

    MobilePhone(String model, String type, String manufacturer) {
        super(model, type, manufacturer);
        this.status = true;
        this.batteryStatus = createPhoneBatteryStatus();
    }
    MobilePhone(String model, String manufacturer) {
        super();
        this.model = model;
        this.manufacturer = manufacturer;
        this.type = "mobile";
        this.status = true;
        this.batteryStatus = 100;
    }

    public boolean chargeBattery() {
        if(batteryStatus == -1) {
            return false;
        }
        return true;
    }

    private int createPhoneBatteryStatus() {
        if(new Random().nextBoolean()) {
            this.setStatus(false);
            return -1;
        }
        return 1 + new Random().nextInt(101);
    }


}
