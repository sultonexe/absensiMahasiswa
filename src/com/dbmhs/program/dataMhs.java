/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dbmhs.program;

import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sultonexe
 */
public class dataMhs extends javax.swing.JFrame {

    private void output_data(){
        DefaultTableModel model = new DefaultTableModel();
        
        model.addColumn("No.");
        model.addColumn("NIM");
        model.addColumn("Nama Mahasiswa");
        model.addColumn("Jenis Kelamin");
        model.addColumn("Alamat");
        model.addColumn("Email");
        model.addColumn("No Telpon");
        model.addColumn("Jurusan");
        model.addColumn("Semester");
        
        
         try{
            int no = 1;
            String sql = "SELECT * FROM data_mhs";
            java.sql.Connection conn = (Connection)konfig.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            
            while(res.next()) {
               model.addRow(new Object[] {no++ , res.getString(1) , res.getString(2),
               res.getString(3), res.getString(4), res.getString(5) , res.getString(6) , res.getString(7) , res.getString(8)});
            } 
              
            tblMahasiswa.setModel(model);
            
        } catch(SQLException e) {
            System.out.println("Error : " + e.getMessage());
        }
    }
    
    /**
     * Creates new form dataMhs
     */
    public dataMhs() {
        initComponents();
        output_data();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMahasiswa = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Data Mahasiswa");
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Chicken Dinner Demo", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setText("DATA MAHASISWA");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(330, 10, 380, 80);

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(254, 254, 254));
        jLabel3.setText("Input Data Sebagai Admin? Silahkan Login");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3);
        jLabel3.setBounds(620, 460, 290, 15);

        jButton1.setBackground(new java.awt.Color(254, 99, 99));
        jButton1.setFont(new java.awt.Font("Euforia", 0, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("/home/sultonexe/Pictures/ICON/icon 24x24/Button-Log-Off-icon.png")); // NOI18N
        jButton1.setText("Keluar");
        jButton1.setToolTipText("");
        jButton1.setIconTextGap(6);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(890, 450, 100, 38);

        tblMahasiswa.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblMahasiswa);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 90, 980, 340);

        jLabel1.setIcon(new javax.swing.ImageIcon("/home/sultonexe/Pictures/Gradient/4.jpg")); // NOI18N
        jLabel1.setText("DATA MAHASISWA");
        jLabel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1020, 500);

        setSize(new java.awt.Dimension(1030, 532));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        halUtama app = new halUtama();
        app.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        
        LoginPage app = new LoginPage();
        app.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_jLabel3MouseClicked

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
            java.util.logging.Logger.getLogger(dataMhs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dataMhs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dataMhs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dataMhs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dataMhs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblMahasiswa;
    // End of variables declaration//GEN-END:variables
}
