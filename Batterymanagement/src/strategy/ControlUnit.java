package strategy;
import factory.*;
import main.*;
import singleton.*;
import strategy.*;
import facade.*;

public class ControlUnit implements Services {
    @Override
    public void addServices() {
        System.out.println("Control unit is used to regulate voltage");
    }
}
