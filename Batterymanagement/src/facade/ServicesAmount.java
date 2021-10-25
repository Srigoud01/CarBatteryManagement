package facade;
import factory.*;
import main.*;
import singleton.*;
import strategy.*;


public class ServicesAmount implements Amount {
    @Override
    public void calculateAmount() {
        System.out.println("services bill has been generated!!\n Thank you :)");
    }
}
