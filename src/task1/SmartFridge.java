package task1;

public class SmartFridge extends SmartDevice {

    int coolingLevel;

    public SmartFridge(String brand,String model, int coolingLevel) {
        super(brand,model);
        this.coolingLevel=coolingLevel;
    }

    @Override
    public void connectToWifi() {
        super.connectToWifi();
        System.out.println("soyuducu mehsullarin siyahisini sinxronlasdirir");
    }

    @Override
    public void disconnect() {
        super.disconnect();
        System.out.println("soyuducu baglantini kesdi");
    }

    public void showTemperature(){
        System.out.println("soyutma seviyyesi -> " + coolingLevel);
    }

}
