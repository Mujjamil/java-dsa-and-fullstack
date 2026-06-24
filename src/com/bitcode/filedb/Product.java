package com.bitcode.filedb;

import java.io.*;

public class Product implements Externalizable {


    private Long serialVersionUID = 11L;
    private int pId;
    private String pName;
    private int pPrice;


    public Product() {
        System.out.println("no arg constructor ");
    }

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }


    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public int getpPrice() {
        return pPrice;
    }

    public void setpPrice(int pPrice) {
        this.pPrice = pPrice;
    }

    public Product(int pId, String pName, int pPrice) {
        this.pId = pId;
        this.pName = pName;
        this.pPrice = pPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "pId=" + pId +
                ", pName='" + pName + '\'' +
                ", pPrice=" + pPrice +
                '}';
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        //Todo auto genereated method stub

        System.out.println("Writtn succes");
        out.writeInt(pId);
        out.writeUTF(pName);
        out.writeInt(pPrice);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        this.pId = in.readInt();
        this.pName = in.readUTF();
        this.pPrice = in.readInt();
    }
}
