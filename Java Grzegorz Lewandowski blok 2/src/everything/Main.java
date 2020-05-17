package everything;

import everything.creatures.Animal;
import everything.creatures.FarmAnimal;
import everything.creatures.Human;
import everything.creatures.Pet;
import everything.devices.*;

public class Main {

    public static void main(String[] args) {


        Animal animal = new Pet();
        animal.feed();
        animal.takeForAWalk();
        animal.takeForAWalk();

        Animal animal_1 = new FarmAnimal("fox",14.00);


        Car bmw = new Disel();
        bmw.setColour("space grey");
        bmw.setModel("M5");
        bmw.setPrice(900);
        bmw.setProducer("bawaria motors");

        Car seat = new LPG();
        seat.setColour("white");
        seat.setModel("leaon FR");
        seat.setPrice(500);
        seat.setProducer("seat s.a");

        Car tesla = new Electric();
        tesla.setColour("blue");
        tesla.setModel("S");
        tesla.setPrice(950);
        tesla.setProducer("tesla s.a");

        Human human = new Human();
        human.addMyCar(bmw);
        human.getSalary();
        System.out.println("________________________");


        System.out.println(human.toString());
        System.out.println(bmw.toString());
        System.out.println(animal.toString());


        System.out.println("-----------------------------");


        Device device = new Phone();

        device.turnOn();

        Phone phone = new Phone();
        phone.setModel("Iphone x");

        Human seller = new Human();
        seller.setPhone(phone);
        seller.setPet(animal);
        seller.setSalary(0.0);

        Human buyer = new Human();
        buyer.setSalary(1500.0);
        buyer.setCash();

        System.out.println("---------------");


        animal.salleable.sell(seller, buyer, 250.00);
        System.out.println("---------------");
        animal_1.salleable.sell(seller, buyer, 150.00);
        System.out.println("---------------");
        tesla.salleable.sell(seller, buyer, 300.00);
        System.out.println("---------------");
        System.out.println("buyer money:" + buyer.getCash());
        System.out.println("seller money:" + seller.getCash());

        System.out.println(buyer.pet.toString());

        System.out.println(Phone.serverAddress);


    }
}
