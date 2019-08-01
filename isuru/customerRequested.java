/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isuru;

import akitha_db.vehicledb;
import com.sun.glass.events.KeyEvent;
import java.awt.Color;
import java.sql.*;
import java.text.SimpleDateFormat;

import java.util.*;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class customerRequested extends javax.swing.JFrame {

    Connection conR = null;
    PreparedStatement pstR = null;
    ResultSet rsR = null;
    
    public customerRequested() {
        initComponents();
        
        conR=vehicledb.connect();    
    
        tableload();
        
        getContentPane().setBackground(Color.white);
        setSize(1200,680);
        setResizable(false);
    }

    
    public void tableload(){

        try{
        String q = "SELECT reg, name , nic, phone, address, final, retuendate, tyrebrand, tyresize, quantity, varenty, price FROM cus_re";

        pstR=conR.prepareStatement(q);
        rsR=pstR.executeQuery();
        jTable1.setModel(DbUtils.resultSetToTableModel(rsR));
        //tableload();
        }
        catch(Exception e)
        {
        
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<String>();
        jLabel12 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JComboBox<String>();
        jTextField8 = new javax.swing.JComboBox<String>();
        jLabel6 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jTextField7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setText("Customer Requested Retreding");

        jLabel2.setText("NAME");

        jLabel4.setText("TELEPHONE NO");

        jLabel5.setText("ADDRESS");

        jLabel7.setText("tyre size");

        jLabel8.setText("tyre quantity");

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel9.setText("TYRE DETAILS");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField4KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField4KeyTyped(evt);
            }
        });

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField5KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField5KeyTyped(evt);
            }
        });

        jLabel10.setText("REGISTER NO:");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "15", " " }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jLabel12.setText("tyre brand");

        jButton3.setText("REGISTER");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel15.setText("NIC");

        jLabel16.setText("today Date");

        jLabel17.setText("PRICE");

        jTextField12.setText("                      ");
        jTextField12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField12KeyPressed(evt);
            }
        });

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextArea1KeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(jTextArea1);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "reg", "name", "nic", "teleNo", "address", "final", "retundate", "brand", "size", "qty", "varenty", "price"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jButton4.setText("Update");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Delete");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Clear");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel3.setForeground(java.awt.Color.red);

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jButton7.setText("Search");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel13.setText("v");

        jLabel14.setForeground(new java.awt.Color(255, 51, 0));

        jLabel11.setForeground(new java.awt.Color(255, 0, 0));

        jTextField9.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "155/60R15", "165/50R15", "165/55R15", "175/60R15", "175/65R15", "175/55R15", "185/55R15", "185/60R15", "185/65R15", "195/45R15", " " }));

        jTextField8.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "DUNLOP", "Firestone", "GOODYEAR", "BRIDGESTONE", "CONTINENTAL", "FIRELLI", "MICHELIN", "DUNLOP", "DSI", "MRF", "CEAT", " " }));

        jLabel6.setText("return date");

        jLabel18.setText("warenty Date");

        jButton8.setText("Demo");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel12)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel5)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel17))
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel13)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jTextField8, javax.swing.GroupLayout.Alignment.LEADING, 0, 130, Short.MAX_VALUE)
                                        .addComponent(jTextField9, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jTextField4)
                                                    .addGap(132, 132, 132)))
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(86, 86, 86)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton7)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jButton8)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(67, 67, 67)
                                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(104, 104, 104))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(111, 111, 111))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 13, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addGap(259, 259, 259)
                        .addComponent(jLabel1)
                        .addGap(483, 483, 483))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(146, 146, 146))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel1))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel15)
                                .addComponent(jLabel13)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7))
                        .addGap(35, 35, 35)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addComponent(jLabel16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel5)))
                        .addGap(20, 20, 20)
                        .addComponent(jLabel6)
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5)
                            .addComponent(jButton4)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(30, 30, 30)
                .addComponent(jLabel18)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton8)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel17)
                            .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)))
                .addGap(153, 153, 153))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        String name = jTextField1.getText().toString();
        String nic = jTextField5.getText().toString();
        String tno = jTextField4.getText().toString();
        String add = jTextArea1.getText().toString();
      //  String tbrand = jTextField8.getText().toString();
       // String tsize = jTextField9.getText().toString();
        String price = jTextField12.getText().toString();
        
        
        if(name.equals("")){
            JOptionPane.showMessageDialog(null, "Fill the NAME");
        }
          if(nic.equals("")){
            JOptionPane.showMessageDialog(null, "Fill the NIC");
        }
            if(tno.equals("")){
            JOptionPane.showMessageDialog(null, "Fill the TELEPHONE NO");
        }
              if(add.equals("")){
            JOptionPane.showMessageDialog(null, "Fill the ADDRESS");
        }
//                if(tbrand.equals("")){
//            JOptionPane.showMessageDialog(null, "Fill the TIRE BRRAND");
//        }
//                  if(tsize.equals("")){
//            JOptionPane.showMessageDialog(null, "Fill the TIRE SIZE");
//        }
                        if(price.equals("")){
            JOptionPane.showMessageDialog(null, "Fill the PRICE");
        }
                  else{
                                  int y = JOptionPane.showConfirmDialog(null, "would you like to save data in this customer?");
        
        //JOptionPane.showConfirmDialog(null, "Are you sure you want to update ?");
        
//        if(y==0)
//        {
//            warranty_Requst a = new warranty_Requst();
//        a.setVisible(true);
//        this.dispose(); 
//        }
                 

        
        
        
        
        
//        yesno e = new yesno();
//        e.setVisible(true);
//        this.dispose();
//                int y = JOptionPane.showConfirmDialog(null, "would you like to give warranty this customer?");
//        
//        //JOptionPane.showConfirmDialog(null, "Are you sure you want to update ?");
//        
    if(y==0)
//        {
//            warranty_Requst a = new warranty_Requst();
//        a.setVisible(true);
//        this.dispose(); 
//        }
      
    {
        //String regi1=jTextField7.getText();
        String name1=jTextField1.getText();
        String nic1=jTextField5.getText();
        String tele1=jTextField4.getText();                       
        String addre1=jTextArea1.getText();
        
        java.util.Date bDate = jTextField13.getDate();
               SimpleDateFormat oDateFormat = new SimpleDateFormat("yyyy-MM-dd");
               String Ebirth = oDateFormat.format(bDate);
               
        String brand1=jTextField8.getSelectedItem().toString();
        String size1=jTextField9.getSelectedItem().toString();      
        String type1=jComboBox2.getSelectedItem().toString();
        String price1=jTextField12.getText();
        
        java.util.Date eDate = jDateChooser1.getDate();
               SimpleDateFormat DateFormat = new SimpleDateFormat("yyyy-MM-dd");
               String Vfinal = DateFormat.format(bDate);
               
        java.util.Date FDate = jDateChooser1.getDate();
               SimpleDateFormat JDateFormat = new SimpleDateFormat("yyyy-MM-dd");
               String Vvorent = JDateFormat.format(bDate);
        try {
                     
            String sqlR = "INSERT INTO cus_re (name, nic, phone, address, final, retuendate, tyrebrand, tyresize, quantity, varenty, price) values('"+name1+"','"+nic1+"','"+tele1+"','"+addre1+"','"+Vfinal+"','"+Ebirth+"','"+brand1+"','"+size1+"','"+type1+"','"+Vvorent+"','"+price1+"')";

            pstR = conR.prepareStatement(sqlR);
            pstR.execute();
            tableload();
            
        } catch (Exception el) {
            
        }
    }
    }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        first_page i = new first_page();
        i.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int y = JOptionPane.showConfirmDialog(null, "Are you sure You want to Update");
        
        //JOptionPane.showConfirmDialog(null, "Are you sure you want to update ?");
        
        if(y==0)
        {
            String nameC = jTextField1.getText();
            
           // String returnC  = jTextField13.getText();
            String brand = jTextField8.getSelectedItem().toString();
            String size = jTextField9.getSelectedItem().toString();
            String comb = jComboBox2.getSelectedItem().toString();
            String price = jTextField12.getText();
            
            String sqlC = "UPDATE cus_re SET tyrebrand ='"+brand+"', tyresize ='"+size+"', quantity ='"+comb+"', price ='"+price+"' where name ='"+nameC+"' ";
            
            try{
                pstR = conR.prepareStatement(sqlC);
                pstR.execute();
                
                tableload();
                
            }catch(Exception e){
                
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       
       int c = jTable1.getSelectedRow();
       
       String reg=jTable1.getValueAt(c, 0).toString();
       String name=jTable1.getValueAt(c, 1).toString();//
       String nic=jTable1.getValueAt(c, 2).toString();//
       String teleNo=jTable1.getValueAt(c, 3).toString();//
       String address=jTable1.getValueAt(c, 4).toString();//
       String Final=jTable1.getValueAt(c, 5).toString();
       String returnC=jTable1.getValueAt(c, 6).toString();
       String brand=jTable1.getValueAt(c, 7).toString();
       String size=jTable1.getValueAt(c, 8).toString();
       String qty=jTable1.getValueAt(c, 9).toString();//
       String varrenty=jTable1.getValueAt(c, 10).toString();
       String price=jTable1.getValueAt(c, 11).toString();//
       
       
       jTextField7.setText(reg);
       jTextField1.setText(name);
       jTextField5.setText(nic);
       jTextField4.setText(teleNo);
       jTextArea1.setText(address);
       jComboBox2.setSelectedItem(qty);
       jTextField12.setText(price);
       
      // jTextField13.setDate(Ebirth);
      //jTextField8.setText(brand);
       //jTextField9.setText(size);
       
       
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jTextField1.setText("");
        jTextField5.setText("");
        jTextField4.setText("");
        jTextArea1.setText("");
        //jTextField13.setText("");
//        jTextField8.setText("");
//        jTextField9.setText("");
        //jComboBox2.setText("");
        jTextField12.setText("");
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
         int z = JOptionPane.showConfirmDialog(null, "Are you sure you want to Delete ?");
        
        if(z==0)
        {
            String namec = jTextField1.getText();
            
            String sql4="DELETE from cus_re where name='"+namec+"' ";
            
            try{
                pstR = conR.prepareStatement(sql4);
                pstR.execute();
                
                tableload();
                
            }catch(Exception e){
                
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyPressed
        int key1=evt.getKeyCode();
        if((key1>=evt.VK_0&&key1<=evt.VK_9)||(key1>=evt.VK_NUMPAD0&&key1<=evt.VK_NUMPAD9)||
                key1==KeyEvent.VK_BACKSPACE)
        {
            jTextField4.setEditable(true);
            jTextField4.setBackground(Color.white);
            jLabel3.setText("");
        }
        else
        {
            jTextField4.setEditable(false);
            //textField2.setBackground(Color.RED);
            jLabel3.setText("* invalid Telephone");
            
        }
    }//GEN-LAST:event_jTextField4KeyPressed

    private void jTextField12KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField12KeyPressed
       int key2=evt.getKeyCode();
        if((key2>=evt.VK_0&&key2<=evt.VK_9)||(key2>=evt.VK_NUMPAD0&&key2<=evt.VK_NUMPAD9)||
                key2==KeyEvent.VK_BACKSPACE)
        {
            jTextField12.setEditable(true);
            jTextField12.setBackground(Color.white);
            jLabel11.setText("");
        }
        else
        {
            jTextField12.setEditable(false);
            //textField2.setBackground(Color.RED);
            jLabel11.setText("* invalid price");
            
        }
    }//GEN-LAST:event_jTextField12KeyPressed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        
        String regC=jTextField2.getText();
        
        String sql5 = "SELECT  reg,name,nic,phone,address,final,retuendate,tyrebrand,tyresize,quantity,varenty,price from cus_re where reg LIKE '%"+regC+"%' ";
        //reg,
        try{
            pstR = conR.prepareStatement(sql5);
            rsR = pstR.executeQuery();

            jTable1.setModel(DbUtils.resultSetToTableModel(rsR)); 

            
            
        }catch(Exception e){
            
        }      
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        char c = evt.getKeyChar();
        
        if(!((Character.isAlphabetic(c)||(c == '.')) || (c == KeyEvent.VK_BACKSPACE) || (c==KeyEvent.VK_DELETE)))
        {
            getToolkit().beep();
            evt.consume();
        }
        
        if(jTextField1.getText().length() >60 ){
                getToolkit().beep();
                evt.consume();
                
        }
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTextArea1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextArea1KeyTyped
     
        char c = evt.getKeyChar();
        
        if(!((Character.isAlphabetic(c)||(Character.isDefined(c))||(c == '.')) || (c == KeyEvent.VK_BACKSPACE) || (c==KeyEvent.VK_DELETE)))
        {
            getToolkit().beep();
            evt.consume();
        }
        
        if(jTextField1.getText().length() >60 ){
                getToolkit().beep();
                evt.consume();
               
        }
    }//GEN-LAST:event_jTextArea1KeyTyped

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
                                   

    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyPressed
//        // TODO add your handling code here:
//        int key11=evt.getKeyCode();
//        if((key11>=evt.VK_0&&key11<=evt.VK_9)||(key11>=evt.VK_NUMPAD0&&key11<=evt.VK_NUMPAD9)||
//                key11==KeyEvent.VK_BACKSPACE)
//        {
//            jTextField5.setEditable(true);
//            jTextField5.setBackground(Color.white);
//           // jLabel1.setText("");
//        }
//        else
//        {
//            jTextField5.setEditable(false);
//            jTextField5.setBackground(Color.RED);
//            //jLabel1.setText("invalid NIC");
//            
//        }// TODO add your handling code here:


        int key1=evt.getKeyCode();
        if((key1>=evt.VK_0&&key1<=evt.VK_9)||(key1>=evt.VK_NUMPAD0&&key1<=evt.VK_NUMPAD9)||
                key1==KeyEvent.VK_BACKSPACE)
        {
            jTextField5.setEditable(true);
            jTextField5.setBackground(Color.white);
            jLabel14.setText("");
        }
        else
        {
            jTextField5.setEditable(false);
            //textField2.setBackground(Color.RED);
            jLabel14.setText("* invalid nic");
            
        }
        
    }//GEN-LAST:event_jTextField5KeyPressed

    private void jTextField4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyTyped
        // TODO add your handling code here:
                char c = evt.getKeyChar();
        if(!(Character.isDigit(c)|| (c==KeyEvent.VK_BACKSPACE)||( c== KeyEvent.VK_DELETE)))
        {
            getToolkit().beep();
            evt.consume();
        // jTextField5.setEditable(false);
        // jTextField5.setBackground(Color.yellow);
        }
        if(jTextField4.getText().length()>=9){
            getToolkit().beep();
            evt.consume();
        }
    
    }//GEN-LAST:event_jTextField4KeyTyped

    private void jTextField5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c)|| (c==KeyEvent.VK_BACKSPACE)||( c== KeyEvent.VK_DELETE)))
        {
            getToolkit().beep();
            evt.consume();
        // jTextField5.setEditable(false);
        // jTextField5.setBackground(Color.yellow);
        }
        if(jTextField5.getText().length()>=9){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jTextField5KeyTyped

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        jTextField1.setText("Isuru");
        jTextField5.setText("961025411");
        jTextField4.setText("0777070070");
        jTextArea1.setText("No.10/7,Heerassagala rd, Kandy.");
        jTextField12.setText("5500");
    }//GEN-LAST:event_jButton8ActionPerformed

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
            java.util.logging.Logger.getLogger(customerRequested.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(customerRequested.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(customerRequested.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(customerRequested.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
                    new customerRequested().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JLabel jTextField7;
    private javax.swing.JComboBox<String> jTextField8;
    private javax.swing.JComboBox<String> jTextField9;
    // End of variables declaration//GEN-END:variables

   
}
