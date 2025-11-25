import Feeds.*;

public class Temperature {
    private String WardName;
    private int WardID;
    private float currentTemp;
    private float idealTemp;
    private boolean heating;
    private EnvironmentalSystem environmentalSystem;
    private TemperatureFeed temp;

    public Temperature(String WardName, int WardID,float idealTemp){
        this.WardName = WardName;
        this.WardID = WardID;
        this.idealTemp = idealTemp;
        this.environmentalSystem = new EnvironmentalSystem();
        this.heating = environmentalSystem.isHeatingOn(WardID);
        this.temp = environmentalSystem.getTempFeed();
    }

    public float getCurrentTemp() {
       return temp.getTemperature(WardID);
    }
    public void controlHeat(){
        float v = getCurrentTemp() - idealTemp;
        double v1 = 0.5;
        double v2 = -0.5;
        boolean b1 = v > v1;
        boolean b2 = v <v2;
        if(b1){
            boolean heating = false;
        }
        if(b2){
            boolean heating = true;
        }
        environmentalSystem.turnHeatingOn(WardID,heating);

    }
    public String getWardName(){
        return WardName;
    }
    public float getIdealTemp(){
        return idealTemp;

    }
    public String getHeating(){
        if(heating == true)return ",Heating is on";
        if (heating == true) return ",Heating is off"
    }

}
