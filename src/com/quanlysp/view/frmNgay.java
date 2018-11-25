/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quanlysp.view;



import com.quanlysp.managerquery.Manager;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author huy
 */
public class frmNgay extends javax.swing.JFrame {

    /**
     * Creates new form frmNgay
     */
    public frmNgay() {

        initComponents();

    }
    Calendar cal = Calendar.getInstance();
    int tamday=-1;
    int day = cal.get(Calendar.DAY_OF_MONTH);
    int month = cal.get(Calendar.MONTH) + 1;
    int year = cal.get(Calendar.YEAR);
    boolean d, m, y;
    Date dt = cal.getTime();
// Dinh dang lai hien thi thong tin ngay gio ra man hinh
    SimpleDateFormat fm = new SimpleDateFormat("dd-MM-yyyy");

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabeThang = new javax.swing.JLabel();
        cbbNam = new javax.swing.JComboBox<>();
        jLabelNam = new javax.swing.JLabel();
        cbbThang = new javax.swing.JComboBox<>();
        cbbNgay = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabelNgay = new javax.swing.JLabel();
        btnOke_NgayLap = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jLabeThang.setText("Tháng");

        cbbNam.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbNamItemStateChanged(evt);
            }
        });

        jLabelNam.setText("Năm");

        cbbThang.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbThangItemStateChanged(evt);
            }
        });
        cbbThang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbThangActionPerformed(evt);
            }
        });

        cbbNgay.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbNgayItemStateChanged(evt);
            }
        });
        cbbNgay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbNgayActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setText("Ngày lập Phiếu Mua");

        jLabelNgay.setText("Ngày ");

        btnOke_NgayLap.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnOke_NgayLap.setText("OKE");
        btnOke_NgayLap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOke_NgayLapActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNgay)
                            .addComponent(jLabeThang)
                            .addComponent(jLabelNam))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbbNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbbNam, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbbThang, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addComponent(btnOke_NgayLap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 93, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbbNgay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNgay))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbbThang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabeThang))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbbNam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNam))
                .addGap(18, 18, 18)
                .addComponent(btnOke_NgayLap)
                .addGap(70, 70, 70))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cbbThangItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbThangItemStateChanged
        String thang = cbbThang.getSelectedItem().toString();
        DefaultComboBoxModel cbbmodel = new DefaultComboBoxModel();
             if(tamday>0)        

        m = true;
        String thanght;
        if (tam == 0) {
            thanght = "0";
        } else {
            thanght = cbbNgay.getSelectedItem().toString();
        }
        tam = 1;

        if (thang.equals("4") || thang.equals("6") || thang.equals("9") || thang.equals("11")) {
            cbbNgay.setModel(cbbmodel);
            for (int i = 1; i < 31; i++) {
                cbbNgay.addItem(String.valueOf(i));
            }
            if (Integer.valueOf(thanght) < 31) {
                cbbNgay.setSelectedItem(thanght);
            }
        } else if (thang.equals("1") || thang.equals("3") || thang.equals("5")
                || thang.equals("7") || thang.equals("8") || thang.equals("12") || thang.equals("10")) {

            cbbNgay.setModel(cbbmodel);
            for (int i = 1; i < 32; i++) {
                cbbNgay.addItem(String.valueOf(i));
            }
            if (Integer.valueOf(thanght) < 32) {
                cbbNgay.setSelectedItem(thanght);
            }
        } else {
            cbbNgay.setModel(cbbmodel);
            for (int i = 1; i < 29; i++) {
                cbbNgay.addItem(String.valueOf(i));
            }
            if (Integer.valueOf(thanght) < 29) {
                cbbNgay.setSelectedItem(thanght);
            }
        }
               try {
          if (Integer.valueOf(cbbNgay.getSelectedItem().toString())!=day &&
                Integer.valueOf(cbbThang.getSelectedItem().toString())!=month &&
                Integer.valueOf(cbbNam.getSelectedItem().toString())!=year){
                      strNgaySinh = cbbNam.getSelectedItem().toString() + "-" + cbbThang.getSelectedItem().toString() + "-" + cbbNgay.getSelectedItem().toString();
        Manager.frmTC.SetNgayLap(strNgaySinh);
           
        this.dispose();
        }   
        } catch (Exception e) {
        }
       
             
    }//GEN-LAST:event_cbbThangItemStateChanged

    private void cbbThangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbThangActionPerformed

    }//GEN-LAST:event_cbbThangActionPerformed

    private void cbbNgayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbNgayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbNgayActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
      
        DefaultComboBoxModel cbbmodel = new DefaultComboBoxModel();
        for (int i = 1; i < 32; i++) {
            cbbNgay.addItem(String.valueOf(i));
        }
        for (int i = 1; i < 13; i++) {
            cbbThang.addItem(String.valueOf(i));
        }
        for (int i = year; i > 2000; i--) {
            cbbNam.addItem(String.valueOf(i));
        }
        cbbNam.setSelectedItem(String.valueOf(year));
        cbbNgay.setSelectedItem(String.valueOf(day));
        cbbThang.setSelectedItem(String.valueOf(month));
        
    }//GEN-LAST:event_formComponentShown
    public String strNgaySinh;
    private void btnOke_NgayLapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOke_NgayLapActionPerformed
        strNgaySinh = cbbNam.getSelectedItem().toString() + "-" + cbbThang.getSelectedItem().toString() + "-" + cbbNgay.getSelectedItem().toString();
        Manager.frmTC.SetNgayLap(strNgaySinh);
        
        this.dispose();
        
    }//GEN-LAST:event_btnOke_NgayLapActionPerformed

    private void cbbNgayItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbNgayItemStateChanged
     
         try {
          if (Integer.valueOf(cbbNgay.getSelectedItem().toString())!=day &&
                Integer.valueOf(cbbThang.getSelectedItem().toString())!=month &&
                Integer.valueOf(cbbNam.getSelectedItem().toString())!=year){
                      strNgaySinh = cbbNam.getSelectedItem().toString() + "-" + cbbThang.getSelectedItem().toString() + "-" + cbbNgay.getSelectedItem().toString();
        Manager.frmTC.SetNgayLap(strNgaySinh);
           
        this.dispose();
        }   
        } catch (Exception e) {
        }
       
    }//GEN-LAST:event_cbbNgayItemStateChanged

    private void cbbNamItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbNamItemStateChanged
        try {
          if (Integer.valueOf(cbbNgay.getSelectedItem().toString())!=day &&
                Integer.valueOf(cbbThang.getSelectedItem().toString())!=month &&
                Integer.valueOf(cbbNam.getSelectedItem().toString())!=year){
                      strNgaySinh = cbbNam.getSelectedItem().toString() + "-" + cbbThang.getSelectedItem().toString() + "-" + cbbNgay.getSelectedItem().toString();
        Manager.frmTC.SetNgayLap(strNgaySinh);
           
        this.dispose();
        }   
        } catch (Exception e) {
        }
       
    }//GEN-LAST:event_cbbNamItemStateChanged
    int tam = 0;

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
            java.util.logging.Logger.getLogger(frmNgay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmNgay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmNgay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmNgay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmNgay().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOke_NgayLap;
    private javax.swing.JComboBox<String> cbbNam;
    private javax.swing.JComboBox<String> cbbNgay;
    private javax.swing.JComboBox<String> cbbThang;
    private javax.swing.JLabel jLabeThang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelNam;
    private javax.swing.JLabel jLabelNgay;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
