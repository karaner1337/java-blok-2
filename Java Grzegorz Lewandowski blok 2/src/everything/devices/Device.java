package everything.devices;

public abstract class   Device {


    public String producer;

    public String mode;

    public String yearOfProduction;


    public String toString(){

        return producer+" "+mode+" "+yearOfProduction;
    }
    public abstract boolean turnOn();
}
