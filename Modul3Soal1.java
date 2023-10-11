/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

public class Modul3Soal1 extends javax.swing.JFrame {

    public Modul3Soal1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        combo = new javax.swing.JComboBox<>();
        lbl_1 = new javax.swing.JLabel();
        lbl_2 = new javax.swing.JLabel();
        lbl_3 = new javax.swing.JLabel();
        lbl_4 = new javax.swing.JLabel();
        lbl_5 = new javax.swing.JLabel();
        btn_hapus = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(7, 1, 10, 10));

        combo.setBackground(new java.awt.Color(102, 153, 255));
        combo.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Buku", "70 MIL", "AZZMINE", "SEPTIHAN", "GALAKSI", "LAUT BERCERITA" }));
        combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboActionPerformed(evt);
            }
        });
        getContentPane().add(combo);

        lbl_1.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        lbl_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(lbl_1);

        lbl_2.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        lbl_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(lbl_2);

        lbl_3.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        lbl_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(lbl_3);

        lbl_4.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        lbl_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(lbl_4);

        lbl_5.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        lbl_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(lbl_5);

        btn_hapus.setBackground(new java.awt.Color(102, 153, 255));
        btn_hapus.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        btn_hapus.setText("HAPUS");
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });
        getContentPane().add(btn_hapus);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboActionPerformed
        String selectedbuku = (String) combo.getSelectedItem();
        if (selectedbuku.equals("70 MIL")){
            lbl_1.setText("<html>Novel 70 mil ditulis oleh penulis wanita muda asal Indonesia yang bernama Anastasya." +
                            "<br>Novel 70 mil pertama kali diterbitkan pada bulan November 2021 oleh Penerbit Katadepan." +
                            "<br>Kisah 70 mil merupakan adaptasi dari kisah alternative universe yang pertama kali" +
                            "<br>dipublikasi pada bulan April 2021, di akun Twitter Anastasya sendiri yang bernama @ldhluvs.</html>");
        }else if(selectedbuku.equals("AZZMINE")){
            lbl_2.setText("<html>Azzamine berkisah tentang seorang gadis bernama Haura Jasmine yang mendapat lamaran" +
                            "<br>dari laki-laki yang bisa dikatakan hampir sempurna. Laki-laki itu bernama Raden Azzam Al-Baihaqi atau Azzam." +
                            "<br>Azzam merupakan lulusan pesantren yang melanjutkan studinya di salah satu universitas Islamterbaik di dunia," +
                            "<br>Al-Azhar. Azzam juga merupakan seorang hafiz yang menghafal 30 juz Al-Qur'an.</html>");
        }else if(selectedbuku.equals("SEPTIHAN")){
            lbl_3.setText("<html>Novel Septihan bercerita tentang kisah asmara dan persahabatan para remaja." +
                            "<br>Septian sebagai tokoh utama merupakan murid yang paling pintar di SMA Ganesha." +
                            "<br>Namun, ia memiliki kepribadian yang dingin dan pendiam." +
                            "<br>Kemudian ada tokoh lain bernama Jihan yang sangat ekspresif dan aktif. Ia adalah tipikal perempuan keras kepala.</html>");
        }else if(selectedbuku.equals("GALAKSI")){
            lbl_4.setText("<html>Novel Galaksi bercerita tentang dua orang remaja bernama Galaksi Aldebaran dan Kejora Ayodhya." +
                            "<br>Galaksi Aldebaran merupakan ketua geng Ravispa yang beranggotakan murid-murid nakal dan biang onar di SMA Ganesha." +
                            "<br>Sedangkan Kejora Ayodhya adalah seorang siswi SMA Ganesha yang merupakan anggota paskibra SMA Ganesha.</html>");
        }else if(selectedbuku.equals("LAUT BERCERITA")){
                    lbl_5.setText("<html>Selaras dengan judulnya, kisah dalam buku ini diawali dengan Biru Laut Wibisono yang mulai " +
                            "<br>bercerita bagaimana perjalanan hidup yang telah ia alami. Laut bersama sahabatnya," +
                            "<br>Sunu, Alex, Kinan, Daniel, Gusti, Julius, Bram dan beberapa aktivis lainnya berjuang " +
                            "<br>melawan Skekejaman rezim dimana kebebasan berpendapat dibungkam.</html>");
        }else {
            lbl_1.setText("");
            lbl_2.setText("");
            lbl_3.setText("");
            lbl_4.setText("");
            lbl_5.setText("");
        }
    }//GEN-LAST:event_comboActionPerformed

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        lbl_1.setText("");
        lbl_2.setText("");
        lbl_3.setText("");
        lbl_4.setText("");
        lbl_5.setText("");
        combo.setSelectedIndex(0);
    }//GEN-LAST:event_btn_hapusActionPerformed

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
            java.util.logging.Logger.getLogger(Modul3Soal1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modul3Soal1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modul3Soal1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modul3Soal1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Modul3Soal1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_hapus;
    private javax.swing.JComboBox<String> combo;
    private javax.swing.JLabel lbl_1;
    private javax.swing.JLabel lbl_2;
    private javax.swing.JLabel lbl_3;
    private javax.swing.JLabel lbl_4;
    private javax.swing.JLabel lbl_5;
    // End of variables declaration//GEN-END:variables
}
