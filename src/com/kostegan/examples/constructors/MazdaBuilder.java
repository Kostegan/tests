package com.kostegan.examples.constructors;

public class MazdaBuilder extends CarBuilder {
    private String engine;

    public MazdaBuilder engine(String engine) {
        this.engine = engine;
        return this;
    }

    public String getEngine() {
        return engine;
    }

    @Override
    public Mazda build() {
        return new Mazda(this);
    }
}
