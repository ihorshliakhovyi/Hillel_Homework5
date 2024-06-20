package Homework_5;

public class Cat extends Animal {
    private String color;

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public Cat(boolean vegetarian, String eats, int numOfLegs, String color) {
        super(vegetarian, eats, numOfLegs);
        this.color = color;
    }
    public Cat(boolean vegetarian, String eats, int numOfLegs) {
        super(vegetarian, eats, numOfLegs);
        this.color = "Red";
    }

}
