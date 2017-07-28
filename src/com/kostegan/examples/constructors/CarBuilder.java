package com.kostegan.examples.constructors;

public class CarBuilder {
    private int id;
    private String mark;
    private String model;

    public CarBuilder id(int id) {
        this.id = id;
        return this;
    }

    public CarBuilder mark(String mark) {
        this.mark = mark;
        return this;
    }

    public CarBuilder model(String model) {
        this.model = model;
        return this;
    }

    public int getId() {
        return id;
    }

    public String getMark() {
        return mark;
    }

    public String getModel() {
        return model;
    }

    public Car build(){
        return new Car(this);
    }
}
