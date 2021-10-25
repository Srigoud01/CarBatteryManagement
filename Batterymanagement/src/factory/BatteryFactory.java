package factory;
import main.*;
import singleton.*;
import strategy.*;
import facade.*;



public class BatteryFactory {
    public BatteryType getInstance(String type){
        if(type.equals("bike")){
            return new BikeBattery();
        }else{
            return new CarBattery();
        }
    }
}

