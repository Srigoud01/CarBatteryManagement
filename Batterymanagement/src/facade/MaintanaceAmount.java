package facade;
import factory.*;
import main.*;
import singleton.*;
import strategy.*;


public class MaintanaceAmount implements Amount {
    @Override
    public void calculateAmount() {
        System.out.println("Your maintance bill generated ! plz pay the amount at the counter ;))");
    }
}
