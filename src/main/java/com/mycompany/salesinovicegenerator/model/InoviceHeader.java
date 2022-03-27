/////////////////////////////////////////////////////////////////////////////////////////////////////////
    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.salesinovicegenerator.model;

/* ............................................. imports ............................................. */

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
    
/////////////////////////////////////////////////////////////////////////////////////////////////////////
    

/**
 *
 * @author AhmedHazem
 */
    
/*..........................................................................................................*/
/*..........................................................................................................*/
/* ............................................. Class InoviceHeader ...................................... */
    
public class InoviceHeader {
    private int invNum;
    private String customerName;
    private Date invDate;
    private ArrayList<InoviceLine> lines; 
    
/////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public ArrayList<InoviceLine> getLines() {
        if(lines == null)
            lines = new ArrayList<>();
        return lines;
    }
    
/////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public void setLines(ArrayList<InoviceLine> lines) {
        this.lines = lines;
    }
    
/////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public InoviceHeader(int invNum, String customerName, Date invDate) {       //constructor by arguments
        this.invNum = invNum;
        this.customerName = customerName;
        this.invDate = invDate;
    }
    
/////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public Date getInvDate() {
        return invDate;
    }
    
/////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public void setInvDate(Date invDate) {
        this.invDate = invDate;
    }
    
/////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public int getInvNum() {
        return invNum;
    }
    
/////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public void setInvNum(int invNum) {
        this.invNum = invNum;
    }
    
/////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public String getCustomerName() {
        return customerName;
    }
    
/////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    
/////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    @Override
    public String toString() {
         String str = "InvoiceHeader{" + "invNum=" + invNum + ", customerName=" + customerName + ", invDate=" + invDate + '}';
        for (InoviceLine line : getLines()) {
            str += "\n\t" + line;
        }
        return str;
    }
    
/////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public double getInvTotal() {
        double total = 0.0;
        for(InoviceLine line : getLines()){
            total += line.getLineTotal();
        }
        return total;
    }
   
/////////////////////////////////////////////////////////////////////////////////////////////////////////
        
    public void addInvLine(InoviceLine line){
        getLines().add(line);
    }
    
/////////////////////////////////////////////////////////////////////////////////////////////////////////
     
    public String exportHeaderData(){
        DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        return "" + getInvNum() + "," + df.format(getInvDate()) + "," + getCustomerName() ;
    }
    
/////////////////////////////////////////////////////////////////////////////////////////////////////////
    
}
