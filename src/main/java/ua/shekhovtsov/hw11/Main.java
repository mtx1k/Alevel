package ua.shekhovtsov.hw11;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new MobilePhone("iphone", "mobile", "apple");
        Phone phone2 = new DialTelephone("homePhone", "dial", "motorola");
        Phone phone3 = new SatellitePhone("some satellite model", "satellite", "nokia");
        PhoneService service = new PhoneService();
        service.servicePhone(phone1);
        service.servicePhone(phone2);
        service.servicePhone(phone3);
    }
}
