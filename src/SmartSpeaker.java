public class SmartSpeaker extends SmartDevice {

    public SmartSpeaker(String brand,String model) {
        super(brand,model);
    }

    @Override
    public void connectToWifi() {
        super.connectToWifi();
        System.out.println("sesguclendirici musiqi yayimlamaga hazirdir");

    }

    @Override
    public void disconnect() {
        super.disconnect();
        System.out.println("sesguclendirici baglantini kesdi");


    }
    public void playMusic(){
        System.out.println("musiqi seslendirildi");
    }
}
