package everything.devices;

import everything.creatures.Human;
import everything.Salleable;

import java.util.List;

public class Phone extends Device {


    public String model;
    public static final String appName = "gra";
    public static final String version = "5.2";
    public static final String serverAddress = "567486356";
    public List<String> appList;
    public URL url;
    public static


    Salleable salleable = new Salleable() {

        @Override

        public void sell(Human seller, Human buyer, Double price) {
            if (buyer.getCash() >= price) {
                if (seller.getPet() == null) {
                    System.out.println("nie ma zwierzat na sprtzedaz");
                } else {
                    System.out.println("zwierzeta na sprzedaz");

                }

                if (seller.getMyCar() == null) {
                    System.out.println("nie ma samochodow na sprzedaz");
                } else {
                    System.out.println("samochody na sprzedaz");
                }

                if (seller.getPhone() == null) {
                    System.out.println("nie ma telefonow na sprzedaz");
                } else {
                    buyer.setCash(-price);
                    buyer.setPhone(seller.getPhone());
                    seller.setCash(+price);
                }
            } else {
                System.out.println("zabraklo kaski");
            }

        }


    };

    public Phone() {

    }

    public String toString() {
        return "";
    }

    @Override

    public boolean turnOn() {
        System.out.println("wlacz telefon");
        return true;
    }

    public String getModel() {
        return model;
    }

    public String installAnnApp(String appName) {

        return appName;
    }

    public String installAnnApp(String appName, String version) {

        return appName + version;
    }

    public String installAnnApp(String appName, String version, String serverAddress) {

        return appName + version + serverAddress;
    }

    public String installAnnApp(List<String> appList) {

        return appList.toString();
    }

    public String installAnnApp(URL url) {

        return url.toString();
    }


    public void setModel(String model) {
        this.model = model;
    }
}