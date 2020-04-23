package com.dojo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WorldTest {

    @Test
    public void returnEmptyString_whenGridIsEmpty() {
        String expectedGrid = "";

        World world = new World(expectedGrid);

        assertEquals(expectedGrid, world.toString());
    }

    @Test
    public void returnWorld_whenGridIsFilled() {
        String expectedGrid = """
                XXX
                X X
                XXX
                """;

        World world = new World(expectedGrid);

        assertEquals(expectedGrid, world.toString());
    }
}
