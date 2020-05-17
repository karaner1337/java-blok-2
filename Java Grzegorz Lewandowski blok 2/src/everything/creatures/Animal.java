package everything.creatures;

import everything.Salleable;

public abstract class Animal implements Feedable {

    public Salleable salleable = new Salleable() {

        @Override

        public void sell(Human seller, Human buyer, Double price) {

            if(buyer.getCash()>=price) {
                if (seller.getPet() == null) {
                    System.out.println("nie mam zwierzakow na sprzedaz");
                } else {
                    System.out.println("mam zwierzeta na sprzedaz");
                    buyer.setCash(-price);
                    buyer.setPet(seller.getPet());
                    seller.setCash(+price);
                }

                if (seller.getMyCar() == null) {
                    System.out.println("nie ma samochodow na sprzedaz");
                } else {
                    System.out.println("mam samochody na sprzedaz");
                }

                if (seller.getPhone() == null) {
                    System.out.println("nie mam telefonow na sprzedaz");
                } else {
                    System.out.println("mam telefony na sprzedaz");
                }
            }else {
                System.out.println("nie masz wystarczajaca siana");
            }


        }

    };


    String species = "dog";

    private Double weight;

    public Animal(String species, Double weight) {
        this.species = species;
        this.weight = weight;
    }

    public Animal() {
        this.weight = 12.0;
    }

    public void feed() {

        weight += 3;


    }

    public   void takeForAWalk() {

        if (weight > 0) {
            weight -= 3;
            System.out.println("+3kg");

            System.out.println("waga =" + weight);
        } else {
            System.out.println("dyntka z glodu");
        }
    }

    public String toString() {
        return species + " " + weight;
    }
}