package com.bitcode.questions.mysql.birtday;

import java.util.Date;

public class Birthday {


    @Override
    public String toString() {
        return "Birthday{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthDay=" + birthDay +
                '}';
    }

    public Birthday(int id, String name, Date birthDay) {
        this.id = id;
        this.name = name;
        this.birthDay = birthDay;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    private int id;
    private String name;
   private Date birthDay;




}
