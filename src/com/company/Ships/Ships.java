package com.company.Ships;

 public abstract class Ships {
    protected String name;
    public abstract String signal();

    Ships(String nameShips) {
        this.name = nameShips;
    }

    public String getShips() {
        return name;
    }
 }