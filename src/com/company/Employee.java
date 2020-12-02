package com.company;

public class Employee {
        String name;
        Position position;

    public Employee(String name, Position position) {
        this.name = name;
        this.position = position;
    }

    @Override
    public String toString() {
        return  name +" " +  position;
    }
}
