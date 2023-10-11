/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import java.text.NumberFormat;
import java.util.Locale;
public class Modul3Soal2 extends javax.swing.JFrame {

    public Modul3Soal2() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_logo = new javax.swing.JLabel();
        lbl_gaji = new javax.swing.JLabel();
        lbl_kendaraan = new javax.swing.JLabel();
        lbl_nama = new javax.swing.JLabel();
        txt_gaji = new javax.swing.JTextField();
        txt_kendaraan = new javax.swing.JTextField();
        txt_nama = new javax.swing.JTextField();
        btn_selesai = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Output = new javax.swing.JTextArea();
        btn_hitung = new javax.swing.JButton();
        btn_ulang = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lbl_logo.setFont(new java.awt.Font("MV Boli", 1, 24)); // NOI18N
        lbl_logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_logo.setText("KALKULATOR PAJAK");
        getContentPane().add(lbl_logo);
        lbl_logo.setBounds(20, 10, 460, 50);

        lbl_gaji.setFont(new java.awt.Font("MV Boli", 0, 12)); // NOI18N
        lbl_gaji.setText("Gaji");
        getContentPane().add(lbl_gaji);
        lbl_gaji.setBounds(20, 130, 110, 30);

        lbl_kendaraan.setFont(new java.awt.Font("MV Boli", 0, 12)); // NOI18N
        lbl_kendaraan.setText("Banyak Kendaraan");
        getContentPane().add(lbl_kendaraan);
        lbl_kendaraan.setBounds(20, 170, 110, 30);

        lbl_nama.setFont(new java.awt.Font("MV Boli", 0, 12)); // NOI18N
        lbl_nama.setText("Nama");
        getContentPane().add(lbl_nama);
        lbl_nama.setBounds(20, 90, 110, 30);

        txt_gaji.setFont(new java.awt.Font("MV Boli", 0, 12)); // NOI18N
        txt_gaji.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txt_gaji);
        txt_gaji.setBounds(130, 130, 120, 30);

        txt_kendaraan.setFont(new java.awt.Font("MV Boli", 0, 12)); // NOI18N
        txt_kendaraan.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txt_kendaraan);
        txt_kendaraan.setBounds(130, 170, 120, 30);

        txt_nama.setFont(new java.awt.Font("MV Boli", 0, 12)); // NOI18N
        txt_nama.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txt_nama);
        txt_nama.setBounds(130, 90, 120, 30);

        btn_selesai.setFont(new java.awt.Font("MV Boli", 1, 12)); // NOI18N
        btn_selesai.setText("SELESAI");
        btn_selesai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_selesaiActionPerformed(evt);
            }
        });
        getContentPane().add(btn_selesai);
        btn_selesai.setBounds(380, 450, 90, 30);

        Output.setColumns(20);
        Output.setRows(5);
        jScrollPane1.setViewportView(Output);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 270, 440, 170);

        btn_hitung.setFont(new java.awt.Font("MV Boli", 1, 12)); // NOI18N
        btn_hitung.setText("HITUNG");
        btn_hitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hitungActionPerformed(evt);
            }
        });
        getContentPane().add(btn_hitung);
        btn_hitung.setBounds(160, 220, 90, 30);

        btn_ulang.setFont(new java.awt.Font("MV Boli", 1, 12)); // NOI18N
        btn_ulang.setText("ULANG");
        btn_ulang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ulangActionPerformed(evt);
            }
        });
        getContentPane().add(btn_ulang);
        btn_ulang.setBounds(60, 220, 90, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/modul3c.jpeg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 500, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_hitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hitungActionPerformed
        double gaji = Double.parseDouble(txt_gaji.getText());
        int jumlahkendaraan = Integer.parseInt(txt_kendaraan.getText());
        
        double pajak = 0;
        if (gaji >= 10000000 && jumlahkendaraan == 3){
            pajak = 0.15 * gaji;
        }else if (gaji >= 5000000 && jumlahkendaraan == 2){
            pajak = 0.10 * gaji;
        }else if (gaji >= 5000000 && jumlahkendaraan == 1){
            pajak = 0.07 * gaji;
        }else if (gaji < 5000000 && jumlahkendaraan == 1){
            pajak = 0.05 * gaji;
        }else if (gaji < 5000000 && jumlahkendaraan == 0){
            pajak = 0.025 * gaji;
        }
        
        Output.setText("HALLO \t "+txt_nama.getText()
            +"\n Berikut Adalah Hasil Perhitungan Gajimu"
            +"\n Gaji = "+gaji
            +"\n Banyak Kendaraan = "+jumlahkendaraan
            +"\n pajak = "+pajak);
    }//GEN-LAST:event_btn_hitungActionPerformed

    private void btn_ulangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ulangActionPerformed
        txt_nama.setText(""); 
        txt_gaji.setText("");
        txt_kendaraan.setText("");
        Output.setText("");
    }//GEN-LAST:event_btn_ulangActionPerformed

    private void btn_selesaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_selesaiActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btn_selesaiActionPerformed


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
            java.util.logging.Logger.getLogger(Modul3Soal2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modul3Soal2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modul3Soal2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modul3Soal2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Modul3Soal2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Output;
    private javax.swing.JButton btn_hitung;
    private javax.swing.JButton btn_selesai;
    private javax.swing.JButton btn_ulang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_gaji;
    private javax.swing.JLabel lbl_kendaraan;
    private javax.swing.JLabel lbl_logo;
    private javax.swing.JLabel lbl_nama;
    private javax.swing.JTextField txt_gaji;
    private javax.swing.JTextField txt_kendaraan;
    private javax.swing.JTextField txt_nama;
    // End of variables declaration//GEN-END:variables
}
