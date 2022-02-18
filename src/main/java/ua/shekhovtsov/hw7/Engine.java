package ua.shekhovtsov.hw7;

public class Engine {
    private double power;
    private String type;

    Engine(double power, String type) {
        this.power = power;
        this.type = type;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
