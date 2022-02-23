package ua.shekhovtsov.hw11;

import lombok.Data;

import java.util.Random;

@Data
public class DialTelephone extends Phone {
    private int number;

    private int createPhoneNumber() {
        if(new Random().nextBoolean()) {
            this.setStatus(false);
            return -1;
        }
        return 12345678;
    }

    public boolean checkRing() {
        return this.isStatus();
    }

    DialTelephone(String model, String type, String manufacturer) {
        super(model, type, manufacturer);
        this.status = true;
        number = createPhoneNumber();
    }
    DialTelephone(String model, String manufacturer) {
        super();
        this.model = model;
        this.manufacturer = manufacturer;
        this.type = "dial";
        this.status = true;
        this.number = 12345678;
    }
}
