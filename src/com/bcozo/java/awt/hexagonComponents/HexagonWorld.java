package com.bcozo.java.awt.hexagonComponents;

import java.awt.Color;

public class HexagonWorld {
    private HexagonPane pane;
    private int rowCount;
    private int colCount;
    private int cellLengthOfSide;
    
    public HexagonWorld(int rowCount, int colCount, int cellLengthOfSide) {
        this.rowCount = rowCount;
        this.colCount = colCount;
        this.cellLengthOfSide = cellLengthOfSide;
    }

    public void init(HexagonPane hexagonPane){
        this.pane = hexagonPane;
        hexagonPane.setRowCount(rowCount);
        hexagonPane.setColumnCount(colCount);
        hexagonPane.setCellLengthOfSide(cellLengthOfSide);
        hexagonPane.init();
        HexagonCell cell;
        Color bgColor = new Color(0, 0xff, 0, 100);
        Color borderColor = new Color(0, 0, 0, 255);
        try {
            for(int i = 0; i < rowCount; i ++){
                for(int j = 0; j < colCount; j ++){
                    cell = new HexagonCell(cellLengthOfSide);
                    cell.setBackground(bgColor);
                    cell.setBorderColor(borderColor);
                    cell.init();
                    this.pane.add(i, j, cell);
                }
            }
        } catch (Exception exception) {
            System.err.println(exception.getMessage());
        }
    }
}
