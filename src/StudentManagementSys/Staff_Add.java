/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentManagementSys;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static StudentManagementSys.Staff.name;

/**
 *
 * @author Administrator
 */
public class Staff_Add extends javax.swing.JFrame {
Connection conn=null;
ResultSet rs=null;
PreparedStatement pst=null;
    /**
     * Creates new form Home
     */
    public Staff_Add() {
        initComponents();
        conn=database.java_db();        
        change.setText(Staff.change.getText());       
       INS_NAME.setText(Staff.name.getText());
      INS_BRANCH.setSelectedIndex(Staff.INS_BRANCH.getSelectedIndex());
        
        loadStaffData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        exit = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        INS_LPHNO = new javax.swing.JLabel();
        INS_PHNO = new javax.swing.JTextField();
        SURNAME = new javax.swing.JLabel();
        INS_SURNAME = new javax.swing.JTextField();
        INS_NAME = new javax.swing.JTextField();
        INS_DESIGNATION = new javax.swing.JLabel();
        INSERT = new javax.swing.JButton();
        UPDATE = new javax.swing.JButton();
        INS_ADDRESS = new javax.swing.JTextField();
        INS_LADDRESS = new javax.swing.JLabel();
        INS_LEMAIL = new javax.swing.JLabel();
        INS_EMAIL = new javax.swing.JTextField();
        BRANCH = new javax.swing.JLabel();
        DESIGNATION = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        Sta_dob = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        change = new javax.swing.JLabel();
        receive = new javax.swing.JLabel();
        INS_BRANCH = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 450));

        jPanel9.setBackground(new java.awt.Color(0, 0, 204));

        exit.setBackground(new java.awt.Color(255, 0, 0));
        exit.setText("X");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exitMousePressed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/StudentManagementSys/icons/5 Teachers-icon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 489, Short.MAX_VALUE)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 60, Short.MAX_VALUE))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 650, 100));

        jLabel3.setText("Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 50, 20));

        INS_LPHNO.setText("PHONE NO");
        jPanel1.add(INS_LPHNO, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, -1, -1));
        jPanel1.add(INS_PHNO, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 130, -1));

        SURNAME.setText("SURNAME");
        jPanel1.add(SURNAME, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, -1, -1));
        jPanel1.add(INS_SURNAME, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, 130, -1));
        jPanel1.add(INS_NAME, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 130, -1));

        INS_DESIGNATION.setText("DESIGNATION");
        jPanel1.add(INS_DESIGNATION, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 80, -1));

        INSERT.setText("INSERT");
        INSERT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INSERTActionPerformed(evt);
            }
        });
        jPanel1.add(INSERT, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 270, -1, -1));

        UPDATE.setText("UPDATE");
        UPDATE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UPDATEActionPerformed(evt);
            }
        });
        jPanel1.add(UPDATE, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 310, -1, -1));
        jPanel1.add(INS_ADDRESS, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 130, -1));

        INS_LADDRESS.setText("ADDRESS");
        jPanel1.add(INS_LADDRESS, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, -1, -1));

        INS_LEMAIL.setText("EMAIL ID");
        jPanel1.add(INS_LEMAIL, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, -1, -1));

        INS_EMAIL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INS_EMAILActionPerformed(evt);
            }
        });
        jPanel1.add(INS_EMAIL, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, 130, -1));

        BRANCH.setText("BRANCH");
        jPanel1.add(BRANCH, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, -1, -1));

        DESIGNATION.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "HOD", "Professor", "Lecturer", "Staff", "Part-Time Staff" }));
        jPanel1.add(DESIGNATION, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, 140, -1));

        jLabel1.setText("Birth Date");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, 80, 20));
        jPanel1.add(Sta_dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 340, 140, 20));

        jLabel2.setText("(Birth Date Converted as Password ( ddmmyyyy ))");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 370, 350, 20));

        change.setText("Modify Person name:");
        jPanel1.add(change, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 140, 140, 30));
        jPanel1.add(receive, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 170, 140, 30));

        INS_BRANCH.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Branch", "COMPUTER SCIENCE", "CIVIL", "ELECTRONIC & COMMUNICATION", "MECHANIC" }));
        INS_BRANCH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INS_BRANCHActionPerformed(evt);
            }
        });
        jPanel1.add(INS_BRANCH, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 140, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    void loadStaffData(){
        
     try{
        String sql ="select * from staff where name = ? and branch = ? ";

            pst=conn.prepareStatement(sql);
            pst.setString(1,INS_NAME.getText());
            pst.setString(2,INS_BRANCH.getSelectedItem().toString());
            
            rs=pst.executeQuery();         
            if(rs.next()){
             
                INS_SURNAME.setText(rs.getString("lname"));
                INS_PHNO.setText(rs.getString("phno"));
                INS_ADDRESS.setText(rs.getString("address"));  
                INS_EMAIL.setText(rs.getString("email"));
             
                String Design = rs.getString("designation");
                DESIGNATION.setSelectedItem(Design);
               try{
                   Date sdf = new SimpleDateFormat("ddMMyyyy").parse((rs.getString("password")));
                   Sta_dob.setDate(sdf);
       }
       catch(Exception e)
       {
           
       }  
               
                
               // Date date= new SimpleDateFormat("yyyy-MM-dd").getString("password");
              //  Sta_dob.setDate(date);
                
            }                                    
           rs.close();
                pst.close();
         } catch (Exception ex) {
         } 
        
    }
    private void exitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMousePressed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_exitMousePressed
int xMouse,yMouse;
    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
      int y = evt.getYOnScreen();
      
      this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        // TODO add your handling code here:
         xMouse=evt.getX();
        yMouse=evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void INSERTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INSERTActionPerformed
        // TODO add your handling code here:
        int p = JOptionPane.showConfirmDialog(null, "Are you sure you want to add record?","Add Record",JOptionPane.YES_NO_OPTION);
        if(p==0){
            try {
                String sql ="insert into staff " 
                        + "(name,lname,phno,branch,"
                        + "designation,address,email,password) values (?,?,?,?,?,?,?,?) ";

                pst=conn.prepareStatement(sql);
                pst.setString(1,INS_NAME.getText());
                pst.setString(2,INS_SURNAME.getText());
                pst.setString(3,INS_PHNO.getText()); 
                
                String grd=INS_BRANCH.getSelectedItem().toString();            
                pst.setString(4,grd);
                
                String grd1=DESIGNATION.getSelectedItem().toString();            
                pst.setString(5,grd1);
                                
                pst.setString(6,INS_ADDRESS.getText());                  
                pst.setString(7,INS_EMAIL.getText());
                
                SimpleDateFormat sdf=new SimpleDateFormat("ddMMyyyy");               
                pst.setString(8,sdf.format(Sta_dob.getDate()));
                                               
                pst.execute();
                JOptionPane.showMessageDialog(null,"Data is saved successfully");
                rs.close();
                pst.close();
                //dispose();
            }
           catch (Exception e) {
               
            }             
        }
    }//GEN-LAST:event_INSERTActionPerformed

    private void INS_EMAILActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INS_EMAILActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_INS_EMAILActionPerformed

    private void UPDATEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UPDATEActionPerformed
        // TODO add your handling code here:
        int p = JOptionPane.showConfirmDialog(null, "Are you sure you want to update?","Update Record",JOptionPane.YES_NO_OPTION);
        if(p==0){
           
            try{

                String value1 = INS_NAME.getText();               
                String value2 = INS_SURNAME.getText();  
                String value3 = INS_PHNO.getText(); 
                String value4 = INS_BRANCH.getSelectedItem().toString(); 
                String value5 = INS_ADDRESS.getText();
                String value6 = DESIGNATION.getSelectedItem().toString();                
                String value7 = INS_EMAIL.getText();                                           
                
                SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
                String value8 = sdf.format(Sta_dob.getDate());

                String sql= "update staff set name ='"+value1+"', lname='"+value2+"', phno='"+value3+"', branch='"+value4+"',"
                        + "address='"+value5+"',designation='"+value6+"',email='"+value7+"',password='"+value8+"' "
                     + " where staff.name='"+value1+"' and staff.lname='"+value2+"'";

                pst=conn.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Record Updated");

            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            } finally {
                try{
                    rs.close();
                    pst.close();
                }
                catch(Exception e){
                }
            }
        }
    }//GEN-LAST:event_UPDATEActionPerformed

    private void INS_BRANCHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INS_BRANCHActionPerformed
        // TODO add your handling code here:
        loadStaffData();
    }//GEN-LAST:event_INS_BRANCHActionPerformed

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
            java.util.logging.Logger.getLogger(Staff_Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Staff_Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Staff_Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Staff_Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Staff_Add().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BRANCH;
    private javax.swing.JComboBox DESIGNATION;
    private javax.swing.JButton INSERT;
    public static javax.swing.JTextField INS_ADDRESS;
    public static javax.swing.JComboBox INS_BRANCH;
    private javax.swing.JLabel INS_DESIGNATION;
    private javax.swing.JTextField INS_EMAIL;
    private javax.swing.JLabel INS_LADDRESS;
    private javax.swing.JLabel INS_LEMAIL;
    private javax.swing.JLabel INS_LPHNO;
    public static javax.swing.JTextField INS_NAME;
    public static javax.swing.JTextField INS_PHNO;
    private javax.swing.JTextField INS_SURNAME;
    private javax.swing.JLabel SURNAME;
    private com.toedter.calendar.JDateChooser Sta_dob;
    private javax.swing.JButton UPDATE;
    public static javax.swing.JLabel change;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel receive;
    // End of variables declaration//GEN-END:variables
}
