/////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.salesinovicegenerator.model;

/* ............................................. imports ............................................. */

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.table.AbstractTableModel;
    
/////////////////////////////////////////////////////////////////////////////////////////////////////////
    
/**
 *
 * @author AhmedHazem
 */

/*..........................................................................................................*/
/*..........................................................................................................*/
/* ........................................ Class InoviceLineTableModel ................................... */

public class InoviceLineTableModel extends AbstractTableModel {
     private List<InoviceLine> inovicesLines;
        private DateFormat df = new SimpleDateFormat("dd-MM-yyyy");

    public InoviceLineTableModel(List<InoviceLine> inovicesLines) {             //constructor by arguments
        this.inovicesLines = inovicesLines;
        
    }
    
/////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    @Override
    public int getRowCount() {
        return inovicesLines.size();
    }
    
/////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    @Override
    public int getColumnCount() {
        return 4;
    }
    
/////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    @Override
    public String getColumnName(int columnIndex) {
        return switch (columnIndex) {
            case 0 -> "Item Name";
            case 1 -> "Item Price";
            case 2 -> "Count";
            case 3 -> "Line Total";
            default -> "";
        };
    }
    
/////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return switch (columnIndex) {
            case 0 -> String.class;
            case 1 -> Double.class;
            case 2 -> Integer.class;
            case 3 -> Double.class;
            default -> Object.class;
        };
    }
    
/////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }
    
/////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        InoviceLine row = inovicesLines.get(rowIndex);
        return switch (columnIndex) {
            case 0 -> row.getItemName();
            case 1 -> row.getItemPrice();
            case 2 -> row.getItemCount();
            case 3 -> row.getLineTotal();
            default -> "";
        };
    }
    
/////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public List<InoviceLine> getInovicesLines() {
        return inovicesLines;
    }
    
/////////////////////////////////////////////////////////////////////////////////////////////////////////
        
}
