package everything.creatures;

public class FarmAnimal extends Animal implements Edbile {

    String species = "dog";
    private Double weight;



    public FarmAnimal(String species, Double weight) {
        super(species,weight);
    }



    @Override

    public void beEaten() {

    }

    @Override

    public void feed(Double foodWeight) {

    }
}