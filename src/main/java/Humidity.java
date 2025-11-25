import Feeds.*;

public class Humidity {
    private int insideHum;
    private int outsideHum;
    private boolean dehumidifier;
    private int diff;
    private EnvironmentalSystem environmentalSystem;
    private HumidityFeed feed;

    public Humidity(){
        this.insideHum = feed.getInsideHumidity();
        this.outsideHum = feed.getOutsideHumidity();
        this.diff = outsideHum - insideHum;
        this.dehumidifier = environmentalSystem.isDehumudifierOn();
    }

    public void controlHum() {
        if(insideHum>(1.1*outsideHum)) environmentalSystem.turnDehumudifierOn(true);
        else{
            environmentalSystem.turnDehumudifierOn(false);
        }
    }
}
