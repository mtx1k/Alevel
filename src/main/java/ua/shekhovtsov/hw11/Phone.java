package ua.shekhovtsov.hw11;

import lombok.Data;

@Data
public class Phone implements Phoneable{
    protected String model;
    protected String type;
    protected String manufacturer;
    protected boolean status;

    public Phone(String model, String type, String manufacturer) {
        this.model = model;
        this.type = type;
        this.manufacturer = manufacturer;
        this.status = true;
    }

    public Phone() {

    }

    @Override
    public void takeCall() {
        if(status) {
            System.out.println("take call");
            return;
        }
        System.out.println("error");
    }

    @Override
    public void makeCall(int number) {
        if(status) {
            System.out.println("make call: " + number);
            return;
        }
        System.out.println("error");
    }
}
