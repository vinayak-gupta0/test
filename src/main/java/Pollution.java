import Feeds.*;

public class Pollution {
    private float pm2;
    private boolean purifier;
    private EnvironmentalSystem environmentalSystem;
    private PollutionFeed feed;

    public Pollution(){
        this.pm2 = feed.getPollution();
        this.purifier = environmentalSystem.isAirPurifierOn();
    }

    public boolean controlPollution(){
        if(pm2>5){
            environmentalSystem.turnAirPurifierOn(True);
        }
        else{
            environmentalSystem.turnAirPurifierOn(False);
        }
    }

    public float getPm2() {
        return pm2;
    }

    public boolean getPurifier(){
        return purifier;
    }
}
