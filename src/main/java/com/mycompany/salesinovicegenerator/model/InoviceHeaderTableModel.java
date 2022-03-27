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
/* ........................................ Class InoviceHeaderTableModel ................................. */

public class InoviceHeaderTableModel extends AbstractTableModel {

    private List<InoviceHeader> inovicesList;
    private DateFormat df = new SimpleDateFormat("dd-MM-yyyy");

        
/////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public InoviceHeaderTableModel(List<InoviceHeader> inovicesList) {          //constructor by arguments
        this.inovicesList = inovicesList;
        
    }
    
/////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    @Override
    public int getRowCount() {
        return inovicesList.size();
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
            case 0 -> "Inovice Num";
            case 1 -> "Customer Name";
            case 2 -> "Inovice Date";
            case 3 -> "Inovice Total";
            default -> "";
        };
    }
    
/////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return switch (columnIndex) {
            case 0 -> Integer.class;
            case 1 -> String.class;
            case 2 -> String.class;
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
        InoviceHeader row = inovicesList.get(rowIndex);
        return switch (columnIndex) {
            case 0 -> row.getInvNum();
            case 1 -> row.getCustomerName();
            case 2 -> df.format(row.getInvDate());
            case 3 -> row.getInvTotal();
            default -> "";
        };
    }
    
/////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public List<InoviceHeader> getInovicesList() {
        return inovicesList;
    }
    
/////////////////////////////////////////////////////////////////////////////////////////////////////////
        
}
