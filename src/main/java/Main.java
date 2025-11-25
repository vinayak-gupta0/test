import Feeds.*;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        EnvironmentalSystem environmentalSystem= new EnvironmentalSystem();
        Temperature temp1= new Temperature("North Ward",0,23);
        Temperature temp2 = new Temperature("Central Ward",1,22);
        Temperature temp3 = new Temperature("South Ward",2,20);
        Humidity humidity = new Humidity();
        Pollution pollution= new Pollution();
        System.out.println(pollution.getPm2());
        System.out.println(pollution.getPurifier());
        pollution.controlPollution();
        System.out.println(pollution.getPm2());
        System.out.println(pollution.getPurifier());

        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JLabel HeatingLabel1 = new JLabel(temp1.getWardName()+"Current Temperature: "+ temp1.getCurrentTemp()+"Ideal Temperature: " + temp1.getIdealTemp()+temp1.getHeating());
        JLabel HeatingLabel2 = new JLabel(temp2.getWardName()+"Current Temperature: "+ temp2.getCurrentTemp()+"Ideal Temperature: " + temp2.getIdealTemp()+temp2.getHeating());
        JLabel HeatingLabel3 = new JLabel(temp3.getWardName()+"Current Temperature: "+ temp3.getCurrentTemp()+"Ideal Temperature: " + temp3.getIdealTemp()+temp1.getHeating());



        }
    }
