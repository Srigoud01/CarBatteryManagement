package singleton;
import factory.*;
import main.*;
import singleton.*;
import strategy.*;
import facade.*;


public class Battery {
    private static Battery battery = new Battery();

    private Battery() {

    }

    public static Battery getInstance() {
        return battery;
    }

    public void printMenu() {
        System.out.println("BATTERY MAINTANCE AND SERVICE SECTION  ||  WELCOME");
        System.out.println("1. Purchase Battery");
        System.out.println("2. Services and Maintanace");
        System.out.println("3. Generate total battery bill");
        System.out.println("4. Exit");
    }

    public void registerBattery(String type) {
        BatteryFactory batteryFactory = new BatteryFactory();
        BatteryType batteryType = batteryFactory.getInstance(type);
        batteryType.registerBattery();
    }

    public void addServices(String type) {

        if (type.equals("breakfast")) {
            Context context = new Context(new MeasurementUnit());
            context.addServices();
        }
        if (type.equals("lunch")) {
            Context context = new Context(new ControlUnit());
            context.addServices();
        }
        if (type.equals("dinner")) {
            Context context = new Context(new ChargerUnit());
            context.addServices();
        }
    }

    public void generateBill(String type) {
        AmountCalculator feeCalculator = new AmountCalculator();
        if (type.equals("service")) {
            feeCalculator.generateServicesAmount();
        } else {
            feeCalculator.generateMaintanaceAmount();
        }
    }

}


