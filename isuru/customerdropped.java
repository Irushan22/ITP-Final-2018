/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isuru;

import akitha_db.vehicledb;
import java.awt.Color;
import java.sql.*;

import java.util.*;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Isuru
 */
public class customerdropped extends javax.swing.JFrame {

    
     Connection conR = null;
     PreparedStatement pstR = null;
       
     ResultSet rsR = null;
    
    public customerdropped() throws ClassNotFoundException {
        initComponents();
        
        conR = vehicledb.connect();
        
         tableload();
         
         getContentPane().setBackground(Color.white);
         //setSize(1080,608);
         setSize(1200,680);
        setResizable(false);
    }
    
   
        public void tableload(){
        
            
            String q = "SELECT regno, tyrebrand, tyresize, quantity, date,state FROM cusdroped";

        try{

        pstR= (PreparedStatement) conR.prepareStatement(q);
        rsR=pstR.executeQuery();
        jTable2.setModel(DbUtils.resultSetToTableModel(rsR));
        
        }
        catch(Exception e)
        {
        
        }
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        dq = new javax.swing.JComboBox<String>();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        dbrand = new javax.swing.JComboBox<String>();
        dsize = new javax.swing.JComboBox<String>();
        jTextField7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Staut = new javax.swing.JComboBox<String>();
        jTextField2 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("founded retreading");

        jLabel7.setText("tyre size");

        jLabel8.setText("tyre quantity");

        dq.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "15", " " }));
        dq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dqActionPerformed(evt);
            }
        });

        jLabel12.setText("tyre brand");

        jLabel10.setText("REGISTER NO:");

        jLabel3.setText("date:");

        jButton1.setText("REGISTER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jButton3.setText("update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Refresh");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        dbrand.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "DUNLOP", "Firestone", "GOODYEAR", "BRIDGESTONE", "CONTINENTAL", "FIRELLI", "MICHELIN", "DUNLOP", "DSI", "MRF", "CEAT", " " }));

        dsize.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "155/60R15", "165/50R15", "165/55R15", "175/60R15", "175/65R15", "175/55R15", "185/55R15", "185/60R15", "185/65R15", "195/45R15", " " }));

        jLabel4.setText("tire set stautes:");

        Staut.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PENDING", "FINISHED" }));

        jButton5.setText("search");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/akitha_interfaces/images/icons8-left-filled-13.png"))); // NOI18N
        jButton7.setText("Back");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(Staut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel12))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGap(23, 23, 23)
                                                .addComponent(dbrand, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(dq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(dsize, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addComponent(jLabel1))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton7)
                                .addGap(39, 39, 39)
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton4))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(301, 301, 301))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(698, 698, 698)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel10))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(94, 94, 94))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 706, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(275, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel1)
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(dbrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(dsize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(dq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(Staut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton7)
                    .addComponent(jButton4))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void dqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dqActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       String tbrand = dbrand.getSelectedItem().toString();
       String tsize = dsize.getSelectedItem().toString();
       String que = dq.getSelectedItem().toString();
       String state = Staut.getSelectedItem().toString();
       //String tdate = ddate.getText();
       
               java.util.Date bDate = ddate.getDate();
               SimpleDateFormat oDateFormat = new SimpleDateFormat("yyyy-MM-dd");
               String tdate = oDateFormat.format(bDate);
       
               String d = "INSERT INTO cusdroped (tyrebrand, tyresize, quantity, date,state) values('"+tbrand +"','"+tsize+"','"+que+"','"+tdate+"','"+state+"')";

        try {
               pstR = (PreparedStatement)conR.prepareStatement(d);  
               pstR.execute();
       
               tableload();
               
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int x = JOptionPane.showConfirmDialog(null, "Are you sure you want to update ?");
        
        
        if(x==0)
        {
            String regis = jTextField7.getText();
           // String tyreB  = dbrand.getSelectedItem().toString();
            String sts = Staut.getSelectedItem().toString();
           // String date1 = ddate.getSelectedItem().toString();
            
            String sql2 = "UPDATE cusdroped SET state ='"+ sts+"' where regno='"+regis+"'  ";
            
            try{
                
                pstR = (PreparedStatement) conR.prepareStatement(sql2);
                pstR.execute();
                
                tableload();
                
            }catch(Exception e){
                
            }
    }//GEN-LAST:event_jButton3ActionPerformed
    }
    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
       
        int a = jTable2.getSelectedRow();
       
       String regN=jTable2.getValueAt(a, 0).toString();
       String tb=jTable2.getValueAt(a, 1).toString();
       String ts=jTable2.getValueAt(a, 2).toString();
       String q=jTable2.getValueAt(a, 3).toString();
       String d=jTable2.getValueAt(a, 4).toString();
       String cont=jTable2.getValueAt(a, 5).toString();
      
       dbrand.setSelectedItem(tb);
       dsize.setSelectedItem(ts);
       dq.setSelectedItem(q);
       jTextField7.setText(regN);
       Staut.setSelectedItem(cont);
       
     //  ddate.setText(d);
       //jTextField1.setText(comadd); 
    }//GEN-LAST:event_jTable2MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        dbrand.setSelectedItem("");
        dsize.setSelectedItem("");
      //  ddate.setText("");
        jTextField7.setText("");
        //dq.selectedItem();
       // jTextField8.setText("");
        //jTextField9.setText("");
        //jComboBox2.setText("");
       // jTextField12.setText("");
        // TODO add your handling code here:z
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
         String reg = jTextField2.getText();
        String sql1 = "select * from cusdroped where regno='"+reg+"'";
        
        try {
           
            pstR = (PreparedStatement) conR.prepareStatement(sql1);
            rsR = pstR.executeQuery();
            
            
            
            jTable2.setModel(DbUtils.resultSetToTableModel(rsR));
            
        } catch (Exception e) {
        }
                
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        first_page m1 = new first_page();
                m1.setVisible(true);
                this.dispose();
    }//GEN-LAST:event_jButton7ActionPerformed
    
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(customerdropped.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
         //</editor-fold>
         
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new customerdropped().setVisible(true);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(customerdropped.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Staut;
    private javax.swing.JComboBox<String> dbrand;
    private javax.swing.JComboBox<String> dq;
    private javax.swing.JComboBox<String> dsize;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel jTextField7;
    // End of variables declaration//GEN-END:variables
}
