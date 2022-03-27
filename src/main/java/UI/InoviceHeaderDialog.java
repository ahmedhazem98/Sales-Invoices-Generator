/////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UI;

/* ............................................. imports ............................................. */

import com.mycompany.salesinovicegenerator.InoviceFrame;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

/////////////////////////////////////////////////////////////////////////////////////////////////////////

/**
 *
 * @author AhmedHazem
 */
/*..........................................................................................................*/
/*..........................................................................................................*/
/* ........................................ Class InoviceHeaderDialog ..................................... */

public class InoviceHeaderDialog extends JDialog{
    private JTextField custNameField;
    private JTextField invDateField;
    private JLabel custNameLbl;
    private JLabel invDateLbl;
    private JButton okBtn;
    private JButton cancelBtn;
    
/////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public InoviceHeaderDialog(InoviceFrame frame) {                            //constructor by arguments
        custNameField = new JTextField(20);
        invDateField = new JTextField(20);
        custNameLbl = new JLabel("Customer Name : ");
        invDateLbl = new JLabel("Inovice Date : ");
        
        okBtn = new JButton("OK");
        cancelBtn = new JButton("Cancel");
        
        okBtn.setActionCommand("CreateInvOk");
        cancelBtn.setActionCommand("CreateInvCancel");
        
        okBtn.addActionListener(frame);
        cancelBtn.addActionListener(frame);
        
        setLayout(new GridLayout(3,2));
        add(custNameLbl);
        add(custNameField);
        add(invDateLbl);
        add(invDateField);
        add(okBtn);
        add(cancelBtn);
        pack();
        
        
        
    }
    
/////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public JTextField getCustNameField() {
        return custNameField;
    }
    
/////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public JTextField getInvDateField() {
        return invDateField;
    }  
    
/////////////////////////////////////////////////////////////////////////////////////////////////////////
       
}
