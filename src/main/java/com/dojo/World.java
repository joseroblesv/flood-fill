package com.dojo;

public class World {

    private int width;
    private int height;
    private String grid;


    public World(int width, int height, String grid) {
        this.width = width;
        this.height = height;
        this.grid = grid;
    }

    @Override
    public String toString() {
        return grid;
    }

    public void fill(int x, int y, String character) {
        String[][] matrix = fillMatrix(character);
        StringBuilder paintedGrid = paintMatrix(matrix);

        this.grid = paintedGrid.toString();
    }

    private StringBuilder paintMatrix(String[][] matrix) {
        StringBuilder paintedGrid = new StringBuilder();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                paintedGrid.append(matrix[i][j]);
            }
            paintedGrid.append("\n");
        }
        return paintedGrid;
    }

    private String[][] fillMatrix(String character) {
        String[][] matrix = new String[this.width][this.height];
        String[] chars = grid.replaceAll("\n", "").split("");
        int count = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                matrix[i][j] = chars[count].equals(".") ? character : chars[count];
                count++;
            }
        }
        return matrix;
    }
}
