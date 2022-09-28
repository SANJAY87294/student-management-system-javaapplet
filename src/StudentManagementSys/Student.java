/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentManagementSys;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import static StudentManagementSys.Student_Add.INS_USN;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Administrator
 */
public class Student extends javax.swing.JFrame {
Connection conn=null;
ResultSet rs=null;
PreparedStatement pst=null;
    /**
     * Creates new form Home
     */
    public Student() {
        initComponents();     
        conn=database.java_db();
        setVisible(true);
        setLocationRelativeTo(null);
        this.setResizable(true);
    }
 void loadStudentdata(){
        
     String sql="select * from student where branch = ? and sem = ?";       
     try{
            pst=conn.prepareStatement(sql);
            pst.setString(1,INS_BRANCH.getSelectedItem().toString());
            pst.setString(2,INS_Sem.getSelectedItem().toString());             
            rs=pst.executeQuery();
            while(StudentTab.getRowCount() > 0 )
            {((DefaultTableModel)StudentTab.getModel()).removeRow(0);
            }
            
            int col = rs.getMetaData().getColumnCount();
            int selection=INS_Sem.getSelectedIndex();
            while(rs.next())
            {
                Object [] rows = new Object[col];
                for(int i=1;i<=col;i++)
                {  switch(selection)
                   {  case 1:
                        rows[0]=rs.getObject("usn");  
                        rows[1]=rs.getObject("name");
                        rows[2]=rs.getObject("lname");
                        rows[3]=rs.getObject("dob");
                        rows[4]=rs.getObject("fname");
                        rows[5]=rs.getObject("phone");
                        rows[6]=rs.getObject("alter_phno");
                        rows[7]=rs.getObject("gmail");
                        rows[8]=rs.getObject("address");
                        break;                   
                case 2:
                         rows[0]=rs.getObject("usn");  
                        rows[1]=rs.getObject("name");
                        rows[2]=rs.getObject("lname");
                        rows[3]=rs.getObject("dob");
                        rows[4]=rs.getObject("fname");
                        rows[5]=rs.getObject("phone");
                        rows[6]=rs.getObject("alter_phno");
                        rows[7]=rs.getObject("gmail");
                        rows[8]=rs.getObject("address");
                        break;
                case 3:
                        rows[0]=rs.getObject("usn");  
                        rows[1]=rs.getObject("name");
                        rows[2]=rs.getObject("lname");
                        rows[3]=rs.getObject("dob");
                        rows[4]=rs.getObject("fname");
                        rows[5]=rs.getObject("phone");
                        rows[6]=rs.getObject("alter_phno");
                        rows[7]=rs.getObject("gmail");
                        rows[8]=rs.getObject("address");
                    break;
                    case 4:
                        rows[0]=rs.getObject("usn");  
                        rows[1]=rs.getObject("name");
                        rows[2]=rs.getObject("lname");
                        rows[3]=rs.getObject("dob");
                        rows[4]=rs.getObject("fname");
                        rows[5]=rs.getObject("phone");
                        rows[6]=rs.getObject("alter_phno");
                        rows[7]=rs.getObject("gmail");
                        rows[8]=rs.getObject("address");
                    break;
                    case 5:
                        rows[0]=rs.getObject("usn");  
                        rows[1]=rs.getObject("name");
                        rows[2]=rs.getObject("lname");
                        rows[3]=rs.getObject("dob");
                        rows[4]=rs.getObject("fname");
                        rows[5]=rs.getObject("phone");
                        rows[6]=rs.getObject("alter_phno");
                        rows[7]=rs.getObject("gmail");
                        rows[8]=rs.getObject("address");
                    break;
                    case 6:
                        rows[0]=rs.getObject("usn");  
                        rows[1]=rs.getObject("name");
                        rows[2]=rs.getObject("lname");
                        rows[3]=rs.getObject("dob");
                        rows[4]=rs.getObject("fname");
                        rows[5]=rs.getObject("phone");
                        rows[6]=rs.getObject("alter_phno");
                        rows[7]=rs.getObject("gmail");
                        rows[8]=rs.getObject("address");
                    break;
                   case 7:
                        rows[0]=rs.getObject("usn");  
                        rows[1]=rs.getObject("name");
                        rows[2]=rs.getObject("lname");
                        rows[3]=rs.getObject("dob");
                        rows[4]=rs.getObject("fname");
                        rows[5]=rs.getObject("phone");
                        rows[6]=rs.getObject("alter_phno");
                        rows[7]=rs.getObject("gmail");
                        rows[8]=rs.getObject("address");
                    break;  
                     
                    case 8:
                        rows[0]=rs.getObject("usn");  
                        rows[1]=rs.getObject("name");
                        rows[2]=rs.getObject("lname");
                        rows[3]=rs.getObject("dob");
                        rows[4]=rs.getObject("fname");
                        rows[5]=rs.getObject("phone");
                        rows[6]=rs.getObject("alter_phno");
                        rows[7]=rs.getObject("gmail");
                        rows[8]=rs.getObject("address");
                    break;
                        
                }
                }
                ((DefaultTableModel)StudentTab.getModel()).insertRow(rs.getRow( ) -1 , rows);
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
        exit2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        StudentTab = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        SearchUsn1 = new javax.swing.JTextField();
        JDel = new javax.swing.JButton();
        INS_LBRANCH = new javax.swing.JLabel();
        INS_BRANCH = new javax.swing.JComboBox();
        INS_LSEM = new javax.swing.JLabel();
        INS_Sem = new javax.swing.JComboBox();
        SearchUsn = new javax.swing.JTextField();

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

        exit2.setBackground(new java.awt.Color(255, 0, 0));
        exit2.setText("X");
        exit2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exit2MousePressed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/StudentManagementSys/icons/2 Student-id-icon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 480, Short.MAX_VALUE)
                .addComponent(exit2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(exit2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 60, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 650, 100));

        StudentTab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "USN", "Name", "LastName", "DoB", "Father name", "Phone No", "Alternative_no", "Address"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        StudentTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StudentTabMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(StudentTab);
        if (StudentTab.getColumnModel().getColumnCount() > 0) {
            StudentTab.getColumnModel().getColumn(0).setResizable(false);
            StudentTab.getColumnModel().getColumn(1).setResizable(false);
            StudentTab.getColumnModel().getColumn(2).setResizable(false);
            StudentTab.getColumnModel().getColumn(3).setResizable(false);
            StudentTab.getColumnModel().getColumn(4).setResizable(false);
            StudentTab.getColumnModel().getColumn(5).setResizable(false);
            StudentTab.getColumnModel().getColumn(6).setResizable(false);
            StudentTab.getColumnModel().getColumn(7).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 440, 280));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 320, 80, 30));

        jButton1.setText("Insert");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 230, 70, -1));

        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 270, 70, -1));
        jPanel1.add(SearchUsn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 40));

        JDel.setText("Delete");
        JDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JDelActionPerformed(evt);
            }
        });
        jPanel1.add(JDel, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 390, 70, -1));

        INS_LBRANCH.setText("BRANCH");
        jPanel1.add(INS_LBRANCH, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, -1, -1));

        INS_BRANCH.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "COMPUTER SCIENCE", "CIVIL", "ELECTRONIC & COMMUNICATION", "MECHANIC" }));
        jPanel1.add(INS_BRANCH, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, -1, -1));

        INS_LSEM.setText("SEM");
        jPanel1.add(INS_LSEM, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, -1, -1));

        INS_Sem.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "I", "II", "III", "IV", "V", "VI", "VII", "VIII" }));
        INS_Sem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INS_SemActionPerformed(evt);
            }
        });
        jPanel1.add(INS_Sem, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 130, -1, -1));

        SearchUsn.setText("Search");
        SearchUsn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SearchUsnKeyReleased(evt);
            }
        });
        jPanel1.add(SearchUsn, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 130, 90, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exit2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit2MousePressed
        // TODO add your handling code here:
         dispose();
    }//GEN-LAST:event_exit2MousePressed
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         SearchUsn1.setText("");
         jLabel1.setText("");
          new Student_Add().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void INS_SemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INS_SemActionPerformed
        // TODO add your handling code here:
        loadStudentdata();
    }//GEN-LAST:event_INS_SemActionPerformed

    private void StudentTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StudentTabMouseClicked
        // TODO add your handling code here:        
        int i= StudentTab.getSelectedRow();
        TableModel Model=StudentTab.getModel();        
        jLabel1.setText(Model.getValueAt(i,0).toString());
        SearchUsn1.setText(Model.getValueAt(i,0).toString());     
    }//GEN-LAST:event_StudentTabMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new Student_Add().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void SearchUsnKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchUsnKeyReleased
        // TODO add your handling code here:
          String sql="select * from student where usn = ?";       
     try{
            pst=conn.prepareStatement(sql);
           pst.setString(1,SearchUsn.getText());            
            rs=pst.executeQuery();
            while(StudentTab.getRowCount() > 0 )
            {((DefaultTableModel)StudentTab.getModel()).removeRow(0);
            }
            
            int col = rs.getMetaData().getColumnCount();          
            while(rs.next())
            { Object [] rows = new Object[col];
                for(int i=1;i<=col;i++)
                {    rows[0]=rs.getObject("usn");  
                     rows[1]=rs.getObject("name");
                     rows[2]=rs.getObject("lname");
                     rows[3]=rs.getObject("dob");
                     rows[4]=rs.getObject("fname");
                     rows[5]=rs.getObject("phone");
                     rows[6]=rs.getObject("alter_phno");
                     rows[7]=rs.getObject("gmail");
                     rows[8]=rs.getObject("address");
                     break;                         
                }     ((DefaultTableModel)StudentTab.getModel()).insertRow(rs.getRow( ) -1 , rows);
            }
            rs.close();
            pst.close();
         } catch (Exception ex) {
         }
    }//GEN-LAST:event_SearchUsnKeyReleased

    private void JDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JDelActionPerformed
        // TODO add your handling code here:
         int p = JOptionPane.showConfirmDialog(null, "Are you sure you want to Delete record?","Delete Record",JOptionPane.YES_NO_OPTION);
        if(p==0){ String sql="delete from student where student.usn = ?";       
     try{
            pst=conn.prepareStatement(sql);
            pst.setString(1,SearchUsn1.getText());     
            pst.execute();
            JOptionPane.showMessageDialog(null, "Record Deleted");            
            pst.close();
            loadStudentdata();
         } catch (Exception ex) {
         }}
    }//GEN-LAST:event_JDelActionPerformed

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
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
       

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Student().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox INS_BRANCH;
    private javax.swing.JLabel INS_LBRANCH;
    private javax.swing.JLabel INS_LSEM;
    private javax.swing.JComboBox INS_Sem;
    private javax.swing.JButton JDel;
    private javax.swing.JTextField SearchUsn;
    public static javax.swing.JTextField SearchUsn1;
    private javax.swing.JTable StudentTab;
    private javax.swing.JButton exit2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    public static javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
