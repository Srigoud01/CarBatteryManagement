package facade;
import factory.*;
import main.*;
import singleton.*;
import strategy.*;


public class Context{
    private Services services;

    public Context(Services services){
        this.services = services;
    }

    public void addServices(){
        services.addServices();
    }
}

