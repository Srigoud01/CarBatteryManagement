package main;
import factory.*;
import main.*;
import singleton.*;
import strategy.*;
import facade.*;


import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Testing {



    @Test
    public void batteryFactoryTest(){
        BatteryFactory factory=new BatteryFactory();
        BatteryType type=factory.getInstance("bike");

        assertTrue(type instanceof BikeBattery);
    }

    @Test
    public void batterySingletonTest(){
        Battery h1=Battery.getInstance();
        Battery h2=Battery.getInstance();

        assertEquals(h1,h2);
    }

}

