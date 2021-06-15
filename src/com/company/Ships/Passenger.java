package com.company.Ships;

public class Passenger extends Ships {
    public Passenger(String nameShips) {
        super(nameShips);
    }

    @Override
    public String signal() {
        return "Гудок!";
    }
}