package com.kostegan.examples.javafx.window.test.generics;

public class TuplyTwoType<T1, T2> {
    private final T1 left;
    private final T2 right;

    public TuplyTwoType(T1 left, T2 right) {
        this.left = left;
        this.right = right;
    }

    public T1 getLeft() {
        return left;
    }

    public T2 getRight() {
        return right;
    }
}
