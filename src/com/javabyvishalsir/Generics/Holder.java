package com.javabyvishalsir.Generics;

public class Holder<T> {
    public Holder(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    private T value;

}
