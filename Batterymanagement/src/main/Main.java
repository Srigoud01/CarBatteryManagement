package main;
import factory.*;
import main.*;
import singleton.*;
import strategy.*;
import facade.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Battery battery = Battery.getInstance();
        int option = 0;
        Scanner sc = new Scanner(System.in);
        String input = "";
        while (option != 4) {
            battery.printMenu();
            input = sc.nextLine();
            option = Integer.parseInt(input);
            if (option == 1) {
                //Register battery
                System.out.println("Register battery for car or bike");
                System.out.println("1. Car battery registration");
                System.out.println("2. Bike battery registration");
                input = sc.nextLine();
                int selection = Integer.parseInt(input);
                if (selection == 1) {
                    battery.registerBattery("car");
                } else {
                    battery.registerBattery("bike");
                }
            }
            if (option == 2) {
                int selection = 0;
                boolean isMeasurementAdded = false;
                boolean isChargingAdded = false;
                boolean isControlAdded = false;
                while (selection != 4) {
                    System.out.println("Select the battery options");
                    System.out.println("1. Measurement Unit");
                    System.out.println("2. charging Unit");
                    System.out.println("3. ControlUnit");
                    System.out.println("4. Exit");
                    input = sc.nextLine();
                    selection = Integer.parseInt(input);
                    if (selection == 1) {
                        if (isMeasurementAdded) {
                            System.out.println("battery selected");
                        } else {
                            battery.addServices("Measurent battery levels");
                            isMeasurementAdded = true;
                        }
                    }
                    if (selection == 2) {
                        if (isChargingAdded) {
                            System.out.println("Charging unit is done");
                        } else {
                            battery.addServices("charging");
                            isChargingAdded = true;
                        }

                    }
                    if (selection == 3) {
                        if (isControlAdded) {
                            System.out.println("Control unit is done ");
                        } else {
                            battery.addServices("contrl");
                            isControlAdded = true;
                        }

                    }
                }

            }
            if (option == 3) {
                //generate battery bill
                System.out.println("Which bill ?");
                System.out.println("1.services bill");
                System.out.println("2.maintainance bill");
                input = sc.nextLine();
                int selection = Integer.parseInt(input);
                if (selection == 1) {
                    battery.generateBill("service");
                } else {
                    battery.generateBill("maintanance");
                }

            }
            if (option == 4) {
                System.out.println("Thanks for visiting our battery shop! :)");
            }

        }
    }
}
