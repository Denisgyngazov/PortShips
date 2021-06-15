package com.company.Fleet;

import com.company.Ships.Ships;
import java.util.ArrayList;

public final class FleetShips {

    private final ArrayList<Ships> newShips = new ArrayList<>();
    public ArrayList<Ships> getShips()
    {
        return newShips;
    }

    public void addShips(Ships ships) {
        newShips.add(ships);
    }

    public int countShips() {
        return newShips.size();
    }
}