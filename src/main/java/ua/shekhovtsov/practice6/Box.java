package ua.shekhovtsov.practice6;

public class Box {
    private String value = "SomeBox";
    public static void main(String[] args) {
        Box box = new Box();
        System.out.println(box.getValue());
        box.setValue("MyBox");
        System.out.println(box.getValue());
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
