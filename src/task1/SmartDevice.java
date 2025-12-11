package task1;

public abstract class SmartDevice {
    protected String brand,model;
    boolean isOnline=false;

    public SmartDevice(String brand, String model) {
        this.brand = brand;
        isOnline = false;
        this.model = model;
    }

    public void connectToWifi(){
        isOnline = true;
        System.out.println(brand+" "+model+" internete qosuldu");

    }
    public void disconnect(){
        isOnline = false;
        System.out.println(brand+" "+model+" oz funksiyasini isletdi ve wifi den ayrildi");
    }

}
