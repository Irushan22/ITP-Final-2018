/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vihanga_interfaces;
/**
 *
 * @author Vihanga
 */
import vihanga_class.DBConn;
import com.sun.glass.events.KeyEvent;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.TextField;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



public class AddEmployee extends javax.swing.JFrame {
    Connection con = null;
    PreparedStatement pre = null;
    ResultSet r = null;
    
 
    

    /**
     * Creates new form AddEmployee
     */
    public AddEmployee() {
        initComponents();
        con = DBConn.connect();
        
        updateCombo();
        setSize(1200,680);
        setResizable(false);
    }

     public void updateCombo()
    {
       
        String sql = "SELECT newpost FROM post";
        try {
            pre = con.prepareStatement(sql);
            r = pre.executeQuery();
            while(r.next())
            {
                pin.addItem(r.getString("newpost"));
            }
           
        } catch (Exception e) {
        }
      
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        namein = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nicin = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        addin = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        tpin = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        pin = new javax.swing.JComboBox<String>();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Add Employee");

        jLabel2.setText("Name");

        namein.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nameinKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nameinKeyTyped(evt);
            }
        });

        jLabel3.setText("NIC Number");

        nicin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nicinActionPerformed(evt);
            }
        });
        nicin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nicinKeyTyped(evt);
            }
        });

        jLabel4.setText("Date of birth");

        jLabel5.setText("Address");

        addin.setColumns(20);
        addin.setRows(5);
        addin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                addinKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(addin);

        jLabel6.setText("Telephone Number");

        tpin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tpinKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tpinKeyTyped(evt);
            }
        });

        jLabel7.setText("Post");

        jLabel8.setText("Index Date");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/akitha_interfaces/images/icons8-save-13.png"))); // NOI18N
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("Menu");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/akitha_interfaces/images/icons8-left-filled-13.png"))); // NOI18N
        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("V");

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 0, 0));
        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel10.setForeground(new java.awt.Color(204, 0, 51));
        jLabel10.setText("*");

        jLabel11.setForeground(new java.awt.Color(204, 0, 0));
        jLabel11.setText("*");

        jLabel12.setForeground(new java.awt.Color(204, 0, 0));
        jLabel12.setText("*");

        jLabel13.setForeground(new java.awt.Color(204, 0, 0));
        jLabel13.setText("*");

        jLabel14.setForeground(new java.awt.Color(204, 0, 0));
        jLabel14.setText("*");

        jLabel15.setForeground(new java.awt.Color(204, 0, 0));

        jButton5.setText("Demo");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton5)
                                .addGap(77, 77, 77)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 970, Short.MAX_VALUE)))
                        .addComponent(jButton3)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel5)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1)
                                    .addComponent(namein)
                                    .addComponent(tpin, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(pin, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(nicin, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jButton3))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(namein, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nicin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(12, 12, 12)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel11))
                                .addGap(25, 25, 25)))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(80, 80, 80)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(45, 45, 45))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tpin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))))
                        .addGap(7, 7, 7)
                        .addComponent(pin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5)
                    .addComponent(jButton4))
                .addContainerGap(268, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       int YesOrNo = JOptionPane.showConfirmDialog(null,"Are you sure you want to save these data..?","Save Data" ,JOptionPane.YES_NO_OPTION);
        if(YesOrNo == 0)
        {
           
            
            
       
          
               String Ename = namein.getText();
               String Enic = nicin.getText();
               java.util.Date bDate = birthin.getDate();
               SimpleDateFormat oDateFormat = new SimpleDateFormat("yyyy-MM-dd");
               String Ebirth = oDateFormat.format(bDate);
               String EAddress = addin.getText();
               String Etelephone = tpin.getText();
               String clas = pin.getSelectedItem().toString();
               java.util.Date EDate = index.getDate();
               SimpleDateFormat DateFormat = new SimpleDateFormat("yyyy-MM-dd");
               String Eindexdate = DateFormat.format(EDate);
               
               
              
               
               
               
               if(namein.getText().trim().isEmpty())
               {
                    JOptionPane.showMessageDialog(null,"Name is cannot be empty");
               }     
                    
               else if(nicin.getText().trim().isEmpty())
               {
                   
               JOptionPane.showMessageDialog(null,"NIC is cannot be empty");
                             
               }
               else if(nicin.getText().trim().length()!= 9)
               {
                       JOptionPane.showMessageDialog(null,"NIC number is cannot be less than 9 length");
                       
               }                 
               /*if(birthin.getDate().toString().trim().isEmpty())
               {
                   JOptionPane.showMessageDialog(null,"Date of Birth Cannot be empty");
                    
               }  */
               else if(birthin.getDate().toString().isEmpty()){
                     jLabel15.setText("Empty");
               }
                   
               else if(addin.getText().trim().isEmpty())
               {
                   JOptionPane.showMessageDialog(null,"Address cannot be empty");
                    
               }   
               else if(tpin.getText().trim().isEmpty())
               {
                   JOptionPane.showMessageDialog(null,"Telephone number cannot be empty");
                   
               }   
               else if(tpin.getText().length() != 10){
                   JOptionPane.showMessageDialog(null,"Telephone number is cannot be less than 10 length");
                }  
                   
               else if(index.getDate().toString().trim().isEmpty())
               {
                   JOptionPane.showMessageDialog(null,"Index date cannot be empty");
               }
                 else{
               
                   try {
                       
                       String A = "INSERT INTO addemp (name,nic,dob,address,tno,post,date) value ('"+Ename+"','"+Enic+"','"+Ebirth+"','"+EAddress+"','"+Etelephone+"','"+clas+"','"+Eindexdate+"')";
                       
                       pre = con.prepareStatement(A);
                       
                       pre.execute();
                       clear();
                       
                       
                   } catch (SQLException e) {
                   }
                   
               }
         
            
           
        }
        else{}
    }//GEN-LAST:event_jButton1ActionPerformed
     private void clear()
    {
        namein.setText(null);
        nicin.setText(null);
        birthin.setDate(null);
        addin.setText(null);
        tpin.setText(null);
        //pin.setText(null);
        index.setDate(null);
    }
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
         Main ob = new Main();
        ob.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jButton4ActionPerformed

  
    private void nameinKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameinKeyPressed
 
    }//GEN-LAST:event_nameinKeyPressed

    private void tpinKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tpinKeyPressed
    
    }//GEN-LAST:event_tpinKeyPressed

    private void nameinKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameinKeyTyped
        // TODO add your handling code here:
       char c=evt.getKeyChar();

    if(!((Character.isAlphabetic(c) || (c == '.')) ||  (c==KeyEvent.VK_BACKSPACE)||  (c==KeyEvent.VK_DELETE) ||(c==KeyEvent.VK_SPACE) )){
       
      
            getToolkit().beep();
            evt.consume();
  
    }  
    if(namein.getText().length()>=60) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_nameinKeyTyped

    private void tpinKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tpinKeyTyped
        // TODO add your handling code here:
         char c = evt.getKeyChar();
        if(!(Character.isDigit(c)||(c==KeyEvent.VK_BACKSPACE)||c==KeyEvent.VK_DELETE))
        {
            getToolkit().beep();
            evt.consume();
        }
        if(tpin.getText().length()>=10) {
            getToolkit().beep();
            evt.consume();
            
        }
       
    }//GEN-LAST:event_tpinKeyTyped

    private void nicinKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nicinKeyTyped
        // TODO add your handling code here:
          char c = evt.getKeyChar();
        if(!(Character.isDigit(c)||(c==KeyEvent.VK_BACKSPACE)||c==KeyEvent.VK_DELETE))
        {
            getToolkit().beep();
            evt.consume();
        }
        if(nicin.getText().length()>=9) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_nicinKeyTyped

    private void addinKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addinKeyTyped
        // TODO add your handling code here:
           char c=evt.getKeyChar();

    if(!((Character.isAlphabetic(c) || (Character.isDigit(c)) || (c == '.')) || (c == '/')|| (c == ',')|| (c == KeyEvent.VK_SPACE) ||  (c==KeyEvent.VK_BACKSPACE)||  c==KeyEvent.VK_DELETE )){
       
      
            getToolkit().beep();
            evt.consume();
  
    }  
    }//GEN-LAST:event_addinKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        clear();
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void nicinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nicinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nicinActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        namein.setText("Vihanga");
        nicin.setText("964560203");
        //birthin.setText("Vihanga");
        addin.setText("No 12, Yapanaya Junction, Anuradhapura.");
        tpin.setText("0765345923");
        pin.setSelectedItem("Doctor");
    }//GEN-LAST:event_jButton5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea addin;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField namein;
    private javax.swing.JTextField nicin;
    private javax.swing.JComboBox<String> pin;
    private javax.swing.JTextField tpin;
    // End of variables declaration//GEN-END:variables
    
   
            
    

}


