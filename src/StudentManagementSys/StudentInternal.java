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
public class StudentInternal extends javax.swing.JFrame {
Connection conn=null;
ResultSet rs=null;
PreparedStatement pst=null;
    /**
     * Creates new form Staff_Home
     */
    public StudentInternal() {
        initComponents();
        conn=database.java_db();
        setVisible(true);
        setLocationRelativeTo(null);
        this.setResizable(true);
        USN.setText(Login.Username.getText());
        USN1.setText(Login.Username.getText());
    }
    
    void loadIadate(){
        
     String sql="select * from internal where usn = ?";       
     try{
            pst=conn.prepareStatement(sql);
            pst.setString(1,USN.getText());             
            rs=pst.executeQuery();
            int selection=IA.getSelectedIndex();
            if(rs.next())       
            {               
                {  switch(selection)
                   {  case 1:                       
                       sub1.setText(rs.getString("ia1sub1"));
                       sub2.setText(rs.getString("ia1sub2"));
                       sub3.setText(rs.getString("ia1sub3"));
                       sub4.setText(rs.getString("ia1sub4"));
                       sub5.setText(rs.getString("ia1sub5"));
                       sub6.setText(rs.getString("ia1sub6"));                       
                       break;                   
               
                   case 2:
                       sub1.setText(rs.getString("ia2sub1"));
                       sub2.setText(rs.getString("ia2sub2"));
                       sub3.setText(rs.getString("ia2sub3"));
                       sub4.setText(rs.getString("ia2sub4"));
                       sub5.setText(rs.getString("ia2sub5"));
                       sub6.setText(rs.getString("ia2sub6"));
                       break;
                       
                   case 3:
                       sub1.setText(rs.getString("ia3sub1"));
                       sub2.setText(rs.getString("ia3sub2"));
                       sub3.setText(rs.getString("ia3sub3"));
                       sub4.setText(rs.getString("ia3sub4"));
                       sub5.setText(rs.getString("ia3sub5"));
                       sub6.setText(rs.getString("ia3sub6"));
                       break;
                }
                }                
            }
            rs.close();
            pst.close();
         } catch (Exception ex) {
         } 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        exit = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        USN1 = new javax.swing.JLabel();
        USN = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Name = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        IA = new javax.swing.JComboBox();
        sub2 = new javax.swing.JTextField();
        sub1 = new javax.swing.JTextField();
        sub3 = new javax.swing.JTextField();
        sub4 = new javax.swing.JTextField();
        sub5 = new javax.swing.JTextField();
        sub6 = new javax.swing.JTextField();

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
            .addGap(0, 450, Short.MAX_VALUE)
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

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/StudentManagementSys/icons/4 pen-blue-icon.png"))); // NOI18N

        USN1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        USN1.setForeground(new java.awt.Color(255, 255, 0));
        USN1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 238, Short.MAX_VALUE)
                .addComponent(USN1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(USN1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 650, 100));

        USN.setText("jTextField1");
        jPanel1.add(USN, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 50, 20));
        jPanel1.add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 70, 20));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 50, 20));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 50, 20));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 50, 20));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 50, 20));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 50, 20));

        IA.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "INTERNAL", "I", "II", "III" }));
        IA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IAActionPerformed(evt);
            }
        });
        jPanel1.add(IA, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 140, 20));
        jPanel1.add(sub2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, 60, -1));
        jPanel1.add(sub1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, 60, -1));
        jPanel1.add(sub3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, 60, -1));
        jPanel1.add(sub4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 310, 60, -1));
        jPanel1.add(sub5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 340, 60, -1));
        jPanel1.add(sub6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 370, 60, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMousePressed
        // TODO add your handling code here:
         dispose();
    }//GEN-LAST:event_exitMousePressed

    private void IAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IAActionPerformed
        // TODO add your handling code here:
        loadIadate();
    }//GEN-LAST:event_IAActionPerformed

    int xMouse,yMouse;
    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        // TODO add your handling code here:
         int x = evt.getXOnScreen();
      int y = evt.getYOnScreen();
      
      this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        xMouse=evt.getX();
        yMouse=evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

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
            java.util.logging.Logger.getLogger(Staff_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Staff_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Staff_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Staff_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentInternal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox IA;
    private javax.swing.JLabel Name;
    private javax.swing.JTextField USN;
    private javax.swing.JLabel USN1;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField sub1;
    private javax.swing.JTextField sub2;
    private javax.swing.JTextField sub3;
    private javax.swing.JTextField sub4;
    private javax.swing.JTextField sub5;
    private javax.swing.JTextField sub6;
    // End of variables declaration//GEN-END:variables
}
