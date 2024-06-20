package Homework_5;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal(true, "grain", 16);
        animal.setEats("salmon");
        String whatEats = animal.getEats();
        System.out.println(whatEats);

        Cat cat = new Cat(false, "Mice", 4);
        cat.setNumOfLegs(123);
        int catLegs = cat.getNumOfLegs();
        System.out.println(catLegs);
    }
}
