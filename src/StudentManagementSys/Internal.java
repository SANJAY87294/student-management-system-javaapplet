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
public class Internal extends javax.swing.JFrame {
Connection conn=null;
ResultSet rs=null;
PreparedStatement pst=null;
    /**
     * Creates new form Staff_Home
     */
    public Internal() {
        initComponents();
        conn=database.java_db();
        setVisible(true);
        setLocationRelativeTo(null);
        this.setResizable(true);
    }
    
    void loadIadate(){
        
     String sql="select * from internal where branch = ? and sem = ?";       
     try{
            pst=conn.prepareStatement(sql);
            pst.setString(1,INS_BRANCH.getSelectedItem().toString());
            pst.setString(2,Sem.getSelectedItem().toString());             
            rs=pst.executeQuery();
            while(IATABLE.getRowCount() > 0 )
            {((DefaultTableModel)IATABLE.getModel()).removeRow(0);
            }
            
            int col = rs.getMetaData().getColumnCount();
            int selection=IA.getSelectedIndex();
            while(rs.next())
            {
                Object [] rows = new Object[col];
                for(int i=1;i<=col;i++)
                {  switch(selection)
                   {  case 1:
                        rows[0]=rs.getObject("usn");  
                        rows[1]=rs.getObject("name");
                        rows[2]=rs.getObject("ia1sub1");
                        rows[3]=rs.getObject("ia1sub2");
                        rows[4]=rs.getObject("ia1sub3");
                        rows[5]=rs.getObject("ia1sub4");
                        rows[6]=rs.getObject("ia1sub5");
                        rows[7]=rs.getObject("ia1sub6");
                        break;                   
                case 2:
                        rows[0]=rs.getObject("usn");
                        rows[1]=rs.getObject("name");
                        rows[2]=rs.getObject("ia2sub1");
                        rows[3]=rs.getObject("ia2sub2");
                        rows[4]=rs.getObject("ia2sub3");
                        rows[5]=rs.getObject("ia2sub4");
                        rows[6]=rs.getObject("ia2sub5");
                        rows[7]=rs.getObject("ia2sub6");
                        break;
                case 3:
                rows[0]=rs.getObject("usn");
                rows[1]=rs.getObject("name");
                rows[2]=rs.getObject("ia3sub1");
                rows[3]=rs.getObject("ia3sub2");
                rows[4]=rs.getObject("ia3sub3");
                rows[5]=rs.getObject("ia3sub4");
                rows[6]=rs.getObject("ia3sub5");
                rows[7]=rs.getObject("ia3sub6");
                    break;
                }
                }
                ((DefaultTableModel)IATABLE.getModel()).insertRow(rs.getRow( ) -1 , rows);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        IATABLE = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        Name = new javax.swing.JLabel();
        Usn = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Update = new javax.swing.JButton();
        Sem = new javax.swing.JComboBox();
        INS_BRANCH = new javax.swing.JComboBox();
        IA = new javax.swing.JComboBox();
        sub1 = new javax.swing.JTextField();
        sub2 = new javax.swing.JTextField();
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

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 480, Short.MAX_VALUE)
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
        );

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 650, 100));

        IATABLE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "USN", "NAME", "SUB1", "SUB2", "SUB3", "SUB4", "SUB5", "SUB6"
            }
        ));
        IATABLE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IATABLEMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(IATABLE);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, 320, 280));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 50, 20));
        jPanel1.add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 70, 20));
        jPanel1.add(Usn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 70, 20));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 50, 20));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 50, 20));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 50, 20));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 50, 20));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 50, 20));

        Update.setText("UPDATE");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });
        jPanel1.add(Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, -1, -1));

        Sem.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "I", "II", "III", "IV", "V", "VI", "VII", "VIII" }));
        jPanel1.add(Sem, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 70, -1));

        INS_BRANCH.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "COMPUTER SCIENCE", "CIVIL", "ELECTRONIC & COMMUNICATION", "MECHANIC" }));
        jPanel1.add(INS_BRANCH, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 140, -1));

        IA.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "INTERNAL", "I", "II", "III" }));
        IA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IAActionPerformed(evt);
            }
        });
        jPanel1.add(IA, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 140, 20));
        jPanel1.add(sub1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 60, -1));
        jPanel1.add(sub2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 60, 20));
        jPanel1.add(sub3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 60, -1));
        jPanel1.add(sub4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 60, -1));
        jPanel1.add(sub5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, 60, -1));
        jPanel1.add(sub6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, 60, -1));

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

    
    private void IATABLEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IATABLEMouseClicked
       
         int i= IATABLE.getSelectedRow();
        TableModel Model=IATABLE.getModel();
        
        Usn.setText(Model.getValueAt(i,0).toString());
        Name.setText(Model.getValueAt(i,1).toString());
        sub1.setText(Model.getValueAt(i,2).toString());
        sub2.setText(Model.getValueAt(i,3).toString());
        sub3.setText(Model.getValueAt(i,4).toString());
        sub4.setText(Model.getValueAt(i,5).toString());
        sub5.setText(Model.getValueAt(i,6).toString());
        sub6.setText(Model.getValueAt(i,7).toString());
       
    }//GEN-LAST:event_IATABLEMouseClicked

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed

         int p = JOptionPane.showConfirmDialog(null, "Are you sure you want to update?","Update Record",JOptionPane.YES_NO_OPTION);
        if(p==0){
           String sql = null;
            try{ 
                String val1 = Usn.getText();
                String val2 = sub1.getText();
                String val3 = sub2.getText();
                String val4 = sub3.getText();
                String val5 = sub4.getText();
                String val6 = sub5.getText();
                String val7 = sub6.getText();
               
                int selection=IA.getSelectedIndex();
                 switch(selection)
                   {  case 1: String sql1= "update internal set ia1sub1='"+val2+"', ia1sub2='"+val3+"',ia1sub3='"+val4+"', "
                        + "ia1sub4='"+val5+"',ia1sub5='"+val6+"',ia1sub6='"+val7+"'"
                        + "where internal.usn='"+val1+"'";
                      sql=sql1;                                             
                   break;
            
                   case 2: String sql2= "update internal set ia2sub1='"+val2+"', ia2sub2='"+val3+"',ia2sub3='"+val4+"', "
                        + "ia2sub4='"+val5+"',ia2sub5='"+val6+"',ia2sub6='"+val7+"'"
                        + "where internal.usn='"+val1+"' ";
                        sql=sql2;
                        break;
                       
                    case 3: String sql3= "update internal set ia3sub1='"+val2+"', ia3sub2='"+val3+"',ia3sub3='"+val4+"', "
                        + "ia3sub4='"+val5+"',ia3sub5='"+val6+"',ia3sub6='"+val7+"'"
                        + "where internal.usn='"+val1+"' ";
                     sql=sql3;                     
                     break;
                 }
                pst=conn.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Record Updated");
                loadIadate();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }finally {try{
                    rs.close();
                    pst.close();
            }catch(Exception e){
                }
            }
        }
    }//GEN-LAST:event_UpdateActionPerformed
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
                new Internal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox IA;
    private javax.swing.JTable IATABLE;
    private javax.swing.JComboBox INS_BRANCH;
    private javax.swing.JLabel Name;
    private javax.swing.JComboBox Sem;
    private javax.swing.JButton Update;
    private javax.swing.JLabel Usn;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField sub1;
    private javax.swing.JTextField sub2;
    private javax.swing.JTextField sub3;
    private javax.swing.JTextField sub4;
    private javax.swing.JTextField sub5;
    private javax.swing.JTextField sub6;
    // End of variables declaration//GEN-END:variables
}
