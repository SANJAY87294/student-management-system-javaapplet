/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentManagementSys;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;;
import org.apache.commons.io.FileUtils;

/**
 *
 * @author Administrator
 */
public class UploadTimeTable extends javax.swing.JFrame {
Connection conn=null;
ResultSet rs=null;
PreparedStatement pst=null;
File file;


    public UploadTimeTable() {
        initComponents();
        conn=database.java_db();
        setVisible(true);
        setLocationRelativeTo(null);
        this.setResizable(true);
    }
       
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        exit = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        Usn = new javax.swing.JLabel();
        INS_BRANCH = new javax.swing.JComboBox();
        Sem = new javax.swing.JComboBox();
        AddImage = new javax.swing.JButton();
        Upload = new javax.swing.JButton();
        FileName = new javax.swing.JLabel();
        LocationImage = new javax.swing.JLabel();
        ImageArea = new javax.swing.JLabel();

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

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/StudentManagementSys/icons/4 pen-blue-icon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addComponent(Usn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(Usn, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 650, 100));

        INS_BRANCH.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "COMPUTER SCIENCE", "CIVIL", "ELECTRONIC & COMMUNICATION", "MECHANIC" }));
        jPanel1.add(INS_BRANCH, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 140, -1));

        Sem.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Semester", "I", "II", "III", "IV", "V", "VI", "VII", "VIII" }));
        Sem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SemActionPerformed(evt);
            }
        });
        jPanel1.add(Sem, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 140, 20));

        AddImage.setText("Add Image");
        AddImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddImageActionPerformed(evt);
            }
        });
        jPanel1.add(AddImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, -1, -1));

        Upload.setText("Upload");
        Upload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UploadActionPerformed(evt);
            }
        });
        jPanel1.add(Upload, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 130, -1, -1));
        jPanel1.add(FileName, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 130, 40));
        jPanel1.add(LocationImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 130, 40));
        jPanel1.add(ImageArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 400, 270));

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
        xMouse=evt.getX();
        yMouse=evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void AddImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddImageActionPerformed
              
           JFileChooser selimage=new JFileChooser();
        if(selimage.showOpenDialog(ImageArea)==JFileChooser.APPROVE_OPTION){            
            Toolkit toolkit=Toolkit.getDefaultToolkit();
            Image image=toolkit.getImage(selimage.getSelectedFile().getAbsolutePath());
            Image imagedResized=image.getScaledInstance(ImageArea.getWidth(),ImageArea.getHeight(),Image.SCALE_SMOOTH);
            ImageIcon imageIcon=new ImageIcon(imagedResized);
            
            ImageArea.setIcon(imageIcon);
            LocationImage.setText(selimage.getSelectedFile().getName());            
            file=new File(selimage.getSelectedFile().getPath());
        }
    }//GEN-LAST:event_AddImageActionPerformed

    private void UploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UploadActionPerformed
        // TODO add your handling code here:
             try{
                 String sql="insert into timetable(branch, sem, image) values (?,?,?)"; 
                 pst=conn.prepareStatement(sql);
                 
                 pst.setString(1,INS_BRANCH.getSelectedItem().toString());
                 pst.setString(2,Sem.getSelectedItem().toString());
                 pst.setString(3,LocationImage.getText());
               try {
                String path=new File(".").getCanonicalPath();
                FileUtils.copyFileToDirectory(file, new File(path+"/timetableimage"));
                 } catch (IOException ex) {
                  Logger.getLogger(UploadTimeTable.class.getName()).log(Level.SEVERE, null, ex);
                 }  
                 pst.execute();
                JOptionPane.showMessageDialog(null,"Data is saved successfully");
                rs.close();
                pst.close();
         } catch (Exception ex) { }
    }//GEN-LAST:event_UploadActionPerformed

    private void SemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SemActionPerformed
        // TODO add your handling code here:
   
         
        String sql="select * from timetable where branch = ? and sem = ?";       
     try{
            pst=conn.prepareStatement(sql);
            pst.setString(1,INS_BRANCH.getSelectedItem().toString());
            pst.setString(2,Sem.getSelectedItem().toString());
            rs=pst.executeQuery();
           
           if(rs.next())
           {               
               Toolkit toolkit=Toolkit.getDefaultToolkit();
               String path=new File(".").getCanonicalPath();
               Image image=toolkit.getImage(path+"/timetableimage/"+(rs.getString("image")));
               Image imagedResized=image.getScaledInstance(ImageArea.getWidth(),ImageArea.getHeight(),Image.SCALE_SMOOTH);
               ImageIcon icon=new ImageIcon(imagedResized);
               ImageArea.setIcon(icon); 
           }  
           rs.close();
           pst.close();
         } catch (Exception ex) {
         }
          
    }//GEN-LAST:event_SemActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws InstantiationException, IllegalAccessException {
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
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(Staff_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UploadTimeTable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddImage;
    private javax.swing.JLabel FileName;
    private javax.swing.JComboBox INS_BRANCH;
    private javax.swing.JLabel ImageArea;
    private javax.swing.JLabel LocationImage;
    private javax.swing.JComboBox Sem;
    private javax.swing.JButton Upload;
    private javax.swing.JLabel Usn;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables
byte[] photo=null;
}
