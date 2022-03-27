/////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.salesinovicegenerator.model;

/**
 *
 * @author AhmedHazem
 */
    
/*..........................................................................................................*/
/*..........................................................................................................*/
/* ............................................. Class InoviceLine ........................................ */
    
public class InoviceLine {
    private String itemName;
    private double itemPrice;
    private int itemCount;
    private InoviceHeader header;

/////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    //constructor by arguments
    public InoviceLine(String itemName, double itemPrice, int itemCount, InoviceHeader header) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemCount = itemCount;
        this.header = header;
    }
    
/////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public InoviceHeader getHeader() {
        return header;
    }
    
/////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public void setHeader(InoviceHeader header) {
        this.header = header;
    }
        
/////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public String getItemName() {
        return itemName;
    }
    
/////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    
/////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public double getItemPrice() {
        return itemPrice;
    }
    
/////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }
    
/////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public int getItemCount() {
        return itemCount;
    }
    
/////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }
    
/////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    @Override
    public String toString() {
        return "InoviceLine{" + "itemName=" + itemName + ", itemPrice=" + itemPrice + ", itemCount=" + itemCount + '}';
    }
    
/////////////////////////////////////////////////////////////////////////////////////////////////////////
        
    public double getLineTotal(){
        return itemCount * itemPrice;
    }
    
/////////////////////////////////////////////////////////////////////////////////////////////////////////
        
    public String exportLineData(){
        return "" + getHeader().getInvNum()+ "," + getItemName() + "," + getItemCount();
    }
    
/////////////////////////////////////////////////////////////////////////////////////////////////////////
    
}
