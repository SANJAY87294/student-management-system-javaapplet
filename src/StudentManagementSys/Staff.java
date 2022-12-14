/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentManagementSys;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Administrator
 */
public class Staff extends javax.swing.JFrame {
    
Connection conn=null;
ResultSet rs=null;
PreparedStatement pst=null;
    private Object receive;
   
    public Staff() {
        initComponents();
        conn=database.java_db();
        
    }

    void loadStaffData(){
     String sql="select * from staff where branch = ? ";       
     try{
            pst=conn.prepareStatement(sql);                         
             pst.setString(1,INS_BRANCH.getSelectedItem().toString());
            rs=pst.executeQuery();
            while(StaffTab.getRowCount() > 0 )
           {((DefaultTableModel)StaffTab.getModel()).removeRow(0);
           }
            int col = rs.getMetaData().getColumnCount();
            while(rs.next())
            {
                Object [] rows = new Object[col];
                for(int i=1;i<=col;i++)
                {       rows[0]=rs.getObject("name");  
                        rows[1]=rs.getObject("lname");                                                                    
                        rows[2]=rs.getObject("email");
                        rows[3]=rs.getObject("designation");
                        rows[4]=rs.getObject("address");
                        rows[5]=rs.getObject("phno");
                        break;   
            }                     
            ((DefaultTableModel)StaffTab.getModel()).insertRow(rs.getRow( ) -1 , rows);
            }                           
            rs.close();
            pst.close();
         } catch (Exception ex) {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        exit = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        INS_BRANCH = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        StaffTab = new javax.swing.JTable();
        Insert = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        change = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        Delete = new javax.swing.JButton();

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
            .addGap(0, 170, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 450));

        jPanel9.setBackground(new java.awt.Color(0, 0, 204));
        jPanel9.setForeground(new java.awt.Color(0, 0, 102));

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
                .addGap(39, 39, 39)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 491, Short.MAX_VALUE)
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

        INS_BRANCH.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Branch", "COMPUTER SCIENCE", "CIVIL", "ELECTRONIC & COMMUNICATION", "MECHANIC" }));
        INS_BRANCH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INS_BRANCHActionPerformed(evt);
            }
        });
        jPanel1.add(INS_BRANCH, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 120, 140, -1));

        StaffTab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Last name", "Email_Id", "Designation", "Address", "Phone Number"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        StaffTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StaffTabMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(StaffTab);
        if (StaffTab.getColumnModel().getColumnCount() > 0) {
            StaffTab.getColumnModel().getColumn(0).setResizable(false);
            StaffTab.getColumnModel().getColumn(1).setResizable(false);
            StaffTab.getColumnModel().getColumn(2).setResizable(false);
            StaffTab.getColumnModel().getColumn(3).setResizable(false);
            StaffTab.getColumnModel().getColumn(4).setResizable(false);
            StaffTab.getColumnModel().getColumn(5).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 440, 320));

        Insert.setText("Insert");
        Insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertActionPerformed(evt);
            }
        });
        jPanel1.add(Insert, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 180, 70, -1));

        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });
        jPanel1.add(Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 290, 70, -1));

        change.setText("Modify Person name:");
        jPanel1.add(change, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, 130, 50));

        name.setText("Select Person to Update/Delete");
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 230, 130, 50));

        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        jPanel1.add(Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 340, 70, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void StaffTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StaffTabMouseClicked
        // TODO add your handling code here:
         int i= StaffTab.getSelectedRow();
        TableModel Model=StaffTab.getModel();
        name.setText(Model.getValueAt(i,0).toString());
    }//GEN-LAST:event_StaffTabMouseClicked

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        // TODO add your handling code here:
         name.setText(StaffTab.getValueAt(StaffTab.getSelectedRow(),0).toString());
        change.setText("Modify Person name:");          
        new Staff_Add().setVisible(true);                        
    }//GEN-LAST:event_UpdateActionPerformed

    private void InsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertActionPerformed
        // TODO add your handling code here:
        name.setText("");   
        change.setText("");      
        new Staff_Add().setVisible(true);
        
    }//GEN-LAST:event_InsertActionPerformed

    private void INS_BRANCHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INS_BRANCHActionPerformed
        // TODO add your handling code here:
        loadStaffData();
    }//GEN-LAST:event_INS_BRANCHActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
       
        String sql=" delete from staff where branch = ? and name = ? ";       
     try{
            pst=conn.prepareStatement(sql);                         
             pst.setString(1,INS_BRANCH.getSelectedItem().toString());
             pst.setString(2,name.getText());             
            pst.execute(); 
            JOptionPane.showMessageDialog(null, "Record Deleted");
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }finally {try{
                    rs.close();
                    pst.close();
            }catch(Exception e){
            }
            }
        loadStaffData();
    }//GEN-LAST:event_DeleteActionPerformed

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
            java.util.logging.Logger.getLogger(Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Staff().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Delete;
    public static javax.swing.JComboBox INS_BRANCH;
    private javax.swing.JButton Insert;
    private javax.swing.JTable StaffTab;
    private javax.swing.JButton Update;
    public static javax.swing.JLabel change;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JLabel name;
    // End of variables declaration//GEN-END:variables
}
