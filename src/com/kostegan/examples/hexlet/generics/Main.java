package com.kostegan.examples.hexlet.generics;

public class Main {
    public static void main(String[] args) {
        TupleString ts = new TupleString("left", "right");
        System.out.println("Print TupleString class implementation: "+ts.getLeft()+" - "+ts.getRight());

        Tuple<String> ts2 = new Tuple<String>("left_string", "right_string");
        System.out.println("Print generics Tuple class implementation: "+ts2.getLeft()+" - "+ts2.getRight());

        Tuple<Car> tc = new Tuple<>(new Car(), new Car());
        System.out.println("Print generics Tuple class implementation: "+tc.getLeft()+" - "+tc.getRight());
    }
}

class Car{
    @Override
    public String toString() {
        return "It is class Car";
    }
}
