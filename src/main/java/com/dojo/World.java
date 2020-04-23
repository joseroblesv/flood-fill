package com.dojo;

public class World {

    private String grid;

    public World(String grid) {

        this.grid = grid;
    }

    @Override
    public String toString() {
        return grid;
    }
}
