package com.kostegan.examples.constructors;

public class Main {
    public static void main(String[] args) {
        Car car = new CarBuilder().id(21).mark("Lada").model("2111").build();
        System.out.printf("Car has id - %s, mark - %s, model - %s%n",car.getId(),car.getModel(),car.getMark());
        Mazda mazda =(Mazda) new MazdaBuilder().engine("new engine").id(27).mark("asb").model("32 del").build();
        System.out.printf("This car is Mazda, it has id - %s,mark - %s, model - %s, end engine - %s%n",mazda.getId(),mazda.getMark(),mazda.getModel(),mazda.getEngine());
    }
}
