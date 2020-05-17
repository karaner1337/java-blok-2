package everything.creatures;

import everything.creatures.Animal;
import everything.devices.Car;
import everything.devices.Phone;

import java.util.Date;

public class Human {

    public Animal pet;
    private Car myCar;
    Double salary;
    double cash;
    Phone phone;


    Date date = new Date();


    public String toString() {
        return pet + " " + myCar + "  " + salary;
    }


    public Human() {
    }

    public void addMyCar(Car car) {
        this.myCar = car;
    }

    public Double setSalary(Double salary) {

        if (salary < 0) {
            System.out.println("musi byc dodatnie !");
        } else {
            System.out.println("zaksięgowano pensje ");
            System.out.println("aneks do umowy !");
            System.out.println("zmiany plac ");

            return this.salary = salary;
        }
        return this.salary = salary;
    }

    public Animal getPet() {
        return pet;
    }

    public Car getMyCar() {
        return myCar;
    }


    public void setMyCar(Car myCar) {
        if (salary >= myCar.price) {
            System.out.println("mozesz zakupic nowy wóz");
            addMyCar(myCar);
        } else if (salary > (myCar.price / 12)) {
            System.out.println("mozesz go kupic na kredyt");
            addMyCar(myCar);
        } else {
            System.out.println("nie masz siana");
        }
    }


    public Double getSalary() {
        System.out.println(date + " " + " " + salary);
        return salary;
    }


    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public void setPet(Animal pet) {
        this.pet = pet;
    }

    public double getCash() {
        return cash + salary;
    }

    public void setCash(double cash) {
        this.cash = this.cash + cash;
    }

    public void setCash() {
        this.cash = cash + cash;
    }
}
