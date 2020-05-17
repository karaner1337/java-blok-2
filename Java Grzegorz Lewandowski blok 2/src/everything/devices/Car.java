package everything.devices;

import everything.creatures.Human;
import everything.Salleable;

public abstract class Car extends Device  {


    public String model;

    public String producer;

    public String colour;

    public int price = 500;


    public abstract String refuel();

    public Salleable salleable = new Salleable() {
        @Override

        public void sell(Human seller, Human buyer, Double price) {
            if(buyer.getCash()>=price) {
                if (seller.getPet() == null) {
                    System.out.println("nie ma zwierzat na sprtzedaz");
                } else {
                    System.out.println("zwierzeta na sprzedaz");

                }

                if (seller.getMyCar() == null) {
                    System.out.println("nie ma samochodow na sprzedaz");
                } else {
                    System.out.println("samochody na sprzedaz");
                    buyer.setCash(-price);
                    buyer.setMyCar(seller.getMyCar());
                    seller.setCash(+price);
                }

                if (seller.getPhone() == null) {
                    System.out.println("nie ma telefonow na sprzedaz");
                } else {
                    System.out.println("telefony na sprzedaz");
                }
            }else {
                System.out.println("zabraklo kasy");
            }


        }

    };

    public String toString() {

        return model + " " + price + " " + colour + " " + producer;
    }

    @Override

    public boolean turnOn() {
        System.out.println("Turn On");
        return true;
    }

    public int getPrice() {
        return price;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public String getProducer() {
        return producer;
    }

    public String getColour() {
        return colour;
    }
}