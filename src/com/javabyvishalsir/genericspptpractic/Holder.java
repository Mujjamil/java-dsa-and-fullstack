package com.javabyvishalsir.genericspptpractic;

public class Holder<T>{

    private T data;

    public Holder(){
        data = null;
    }

    public Holder(T data){
        this.data = data;
    }
    public T getData(){
        return data;
    }

    public void setData(T data){
        this.data = data;
    }

}
