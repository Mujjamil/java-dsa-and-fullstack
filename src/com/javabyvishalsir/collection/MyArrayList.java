package com.javabyvishalsir.collection;

import javax.lang.model.element.Element;
import javax.swing.*;
import java.util.Arrays;
import java.util.Iterator;

public class MyArrayList<T>{
    private Object[] data;
    private int size;
    private int DefaultCapacity = 10;

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            result.append(data[i]);
            if (i < size - 1) {
                result.append(", ");
            }
        }
        result.append("]");
        return result.toString();
    }

    public  MyArrayList(){
        data = new Object[DefaultCapacity];
        size = 0;
    }

    public void add(T Element){
        if(size == data.length){
            Object[] newData = new Object[data.length * 2];
            for (int i = 0; i < size; i++) {
                newData[i] = data[i];
            }
            data = newData;
        }
        data[size] = Element;
        size++;
    }

    public T get(int index){
        return(T) data[index];
    };


    public void set(int index , T Element){
            data[index] = Element;
    }


    public void sort() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                Comparable<T> current = (Comparable<T>) data[j];
                if (current.compareTo((T) data[j + 1]) > 0) {
                    Object temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }


    public void Iterator(){
            
    }
}
