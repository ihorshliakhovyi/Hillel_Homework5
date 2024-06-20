package Homework_5;

public class Animal {
    private boolean vegetarian;
    private String eats;
    private int numOfLegs;


    public Animal(boolean vegetarian, String eats, int numOfLegs) {
        this.vegetarian = vegetarian;
        this.eats = eats;
        this.numOfLegs = numOfLegs;
    }

    public Animal() {

    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public String getEats() {
        return eats;
    }

    public int getNumOfLegs() {
        return numOfLegs;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public void setEats(String eats) {
        this.eats = eats;
    }

    public void setNumOfLegs(int numOfLegs) {
        this.numOfLegs = numOfLegs;
    }
}
