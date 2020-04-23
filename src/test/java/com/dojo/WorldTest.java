package com.dojo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WorldTest {

    @Test
    public void returnEmptyString_whenGridIsEmpty() {
        String expectedGrid = "";
        int expectedWidth = 0;
        int expectedHeight = 0;
        World world = new World(expectedWidth, expectedHeight, expectedGrid);

        assertEquals(expectedGrid, world.toString());
    }

    @Test
    public void returnWorld_whenGridIsCreated() {
        String expectedGrid = """
                XXX
                X.X
                XXX
                """;

        World world = new World(3, 3, expectedGrid);

        assertEquals(expectedGrid, world.toString());
    }

    @Test
    public void returnWorld_whenGridIsFilled3x3() {
        String initialGrid = """
                XXX
                X.X
                XXX
                """;
        World world = new World(3, 3, initialGrid);
        world.fill(1,1,"@");

        String expectedGrid = """
                XXX
                X@X
                XXX
                """;
        assertEquals(expectedGrid, world.toString());
    }

    @Test
    public void returnWorld_whenGridIsFilled4x4() {
        String initialGrid = """
                XXXX
                X..X
                XXXX
                XXXX
                """;
        World world = new World(4, 4, initialGrid);
        world.fill(1,1,"@");

        String expectedGrid = """
                XXXX
                X@@X
                XXXX
                XXXX
                """;
        assertEquals(expectedGrid, world.toString());
    }
}
