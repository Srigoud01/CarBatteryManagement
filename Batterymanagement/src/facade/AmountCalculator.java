package facade;
import factory.*;
import main.*;
import singleton.*;
import strategy.*;

public class AmountCalculator {
    private ServicesAmount servicesAmount;
    private MaintanaceAmount maintanaceAmount;

    public AmountCalculator() {
        servicesAmount = new ServicesAmount();
        maintanaceAmount = new MaintanaceAmount();
    }

    public void generateServicesAmount() {
        servicesAmount.calculateAmount();
    }

    public void generateMaintanaceAmount() {
        maintanaceAmount.calculateAmount();
    }
}
