package ua.shekhovtsov.hw11;

import lombok.Data;

import java.util.Random;

@Data
public class SatellitePhone extends Phone {
    private boolean connection;

    public boolean isConnected() {
        return connection;
    }

    SatellitePhone(String model, String type, String manufacturer) {
        super(model, type, manufacturer);
        connection = satelliteConnect();
        this.status = connection;
    }
    SatellitePhone(String model, String manufacturer) {
        super();
        this.model = model;
        this.manufacturer = manufacturer;
        this.type = "satellite";
        this.status = true;
        this.connection = true;
    }
    private boolean satelliteConnect() {
        Random random = new Random();
        connection = random.nextBoolean();
        if(!connection) {
            this.setStatus(false);
        }
        return connection;
    }
}
