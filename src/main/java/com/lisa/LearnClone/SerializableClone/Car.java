package com.lisa.LearnClone.SerializableClone;

import java.io.Serializable;

public class Car implements Serializable {
    private static final long serialVersionUID = -7633040136520448512L;
    private String name;
    private String color;

    public Car() {}

    public Car(String name, String color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car [name=" + name + ", color=" + color + "]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}