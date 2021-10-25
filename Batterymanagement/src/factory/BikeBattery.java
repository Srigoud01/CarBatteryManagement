package factory;
import main.*;
import singleton.*;
import strategy.*;
import facade.*;



public class BikeBattery implements BatteryType{
    @Override
    public void registerBattery() {
        System.out.println("Bike battery has been purchased!!");
    }
}

