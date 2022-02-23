package ua.shekhovtsov.hw11;

import lombok.Data;

@Data
public class PhoneService {
    public void servicePhone(Phone phone) {
        if(phone.isStatus()) {
            System.out.println(phone.type + " not damaged!");
        }
        switch (phone.type) {
            case "mobile":
                phone = (MobilePhone) phone;
                repairMobilePhone((MobilePhone) phone);
                break;
            case "dial":
                repairDialPhone((DialTelephone) phone);
                break;
            case "satellite":
                repairSatellitePhone((SatellitePhone) phone);
                break;
            default:
                System.out.println("phone not supported");
                return;
        }
    }
    private void repairMobilePhone(MobilePhone phone) {
        if(!phone.chargeBattery()) {
            phone.setBatteryStatus(100);
            phone.setStatus(true);
            System.out.println("mobile repaired");
        }
        checkMobileWithDefault(phone);
    }
    private void checkMobileWithDefault(MobilePhone phone){
        MobilePhone model = new MobilePhone(phone.getModel(), phone.getManufacturer());
        if(model.hashCode() == phone.hashCode()) {
            if(model.equals(phone)) {
                System.out.println("success hashCode and equals");
                return;
            }
        }
        System.out.println("Battery not equal 100%! Battery status: " + phone.getBatteryStatus());
    }
    private void repairDialPhone(DialTelephone phone) {
        if (!phone.checkRing()) {
            phone.setStatus(true);
            phone.setNumber(12345678);
            System.out.println("dial repaired");
        }
        checkDialWithDefault(phone);
    }
    private void checkDialWithDefault(DialTelephone phone){
        DialTelephone model = new DialTelephone(phone.getModel(), phone.getManufacturer());
        if(model.hashCode() == phone.hashCode()) {
            if(model.equals(phone)) {
                System.out.println("success hashCode and equals");
                return;
            }
        }
        System.out.println("error");
    }
    private void repairSatellitePhone(SatellitePhone phone) {
        if(!phone.isConnected()) {
            phone.setConnection(true);
            phone.setStatus(true);
            System.out.println("satellite repaired");
        }
        checkSatelliteWithDefault(phone);
    }
    private void checkSatelliteWithDefault(SatellitePhone phone){
        SatellitePhone model = new SatellitePhone(phone.getModel(), phone.getManufacturer());
        if(model.hashCode() == phone.hashCode()) {
            if(model.equals(phone)) {
                System.out.println("success hashCode and equals");
                return;
            }
        }
        System.out.println("error");
    }
}
