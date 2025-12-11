public class Maain {
    public static void main(String[] args) {
        SmartWatch watch = new SmartWatch("Apple","Watch series 9");
        SmartSpeaker speaker = new SmartSpeaker("Amazon","Echo Dot");
        SmartFridge fridge = new SmartFridge("Samsung","Smart cool 3000",7);


        watch.connectToWifi();
        watch.trackHeartRate();
        System.out.println();
        speaker.connectToWifi();
        speaker.playMusic();
        System.out.println();
        fridge.connectToWifi();
        fridge.showTemperature();
        System.out.println("---------------------------");


        watch.disconnect();
        System.out.println();
        speaker.disconnect();
        System.out.println();
        fridge.disconnect();


    }
}
