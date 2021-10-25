package strategy;
import factory.*;
import main.*;
import singleton.*;
import strategy.*;
import facade.*;

public class ChargerUnit implements Services{
    @Override
    public void addServices() {
        System.out.println("Charger unis is used to charge the battery");
    }
}

