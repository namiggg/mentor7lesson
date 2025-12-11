public class SmartWatch extends SmartDevice{


    public SmartWatch(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void connectToWifi() {
        super.connectToWifi();
        System.out.println("Smart watch melumat toplayir");

    }

    @Override
    public void disconnect() {
        super.disconnect();
        System.out.println("smart watch baglantini kesdi");

    }

    public void trackHeartRate(){
        System.out.println("Smart saat urek doyuntuzu izleyir");
    }

}
