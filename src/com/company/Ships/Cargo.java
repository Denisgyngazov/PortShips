package com.company.Ships;

public final class Cargo extends Ships{
    public Cargo(String nameShips) {
        super(nameShips);
    }

    @Override
    public String signal() {
        return "Молча стартует!";
    }
}