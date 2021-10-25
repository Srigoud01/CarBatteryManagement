package factory;
import main.*;
import singleton.*;
import strategy.*;
import facade.*;



public class CarBattery implements BatteryType{
    @Override
    public void registerBattery() {
        System.out.println("Car battery has been purchased!");
    }
}
