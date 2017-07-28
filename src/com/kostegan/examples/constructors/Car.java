package com.kostegan.examples.constructors;

public class Car {
    private final int id;
    private final String mark;
    private final String model;

    Car(CarBuilder carBuilder) {
        this.id = carBuilder.getId();
        this.mark = carBuilder.getMark();
        this.model = carBuilder.getModel();
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
    //    public Car(String mark){
//        this(11,mark,"TestModel");
//    }

    private void checkMark(String mark){
        if(!("Ford".equals(mark))){
            System.out.printf("It is %s","Ford");
        }
    }


}
