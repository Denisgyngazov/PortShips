package com.company.Ships;

public final class War extends Ships {
    public War(String nameShips) {
        super(nameShips);
    }

    @Override
    public String signal() {
        return "Залп!";
    }
}
