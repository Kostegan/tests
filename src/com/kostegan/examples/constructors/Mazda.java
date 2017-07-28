package com.kostegan.examples.constructors;

public class Mazda extends Car {
    private String engine;
    public Mazda(MazdaBuilder mazdaBuilder) {
        super(mazdaBuilder);
        this.engine = mazdaBuilder.getEngine();
    }

    public String getEngine() {
        return engine;
    }
}
