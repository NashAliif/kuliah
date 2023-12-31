package UTS;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author aliif
 */
public class Tabel extends javax.swing.JFrame {
    private DefaultTableModel mod;
    Object[] dataMahasiswa = new Object[4];
    Login logPass = new Login();
    
    /**
     * Creates new form FormLatihanJavaII
     */
    public Tabel() {
        initComponents();
        loadTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        textFieldNIM = new javax.swing.JTextField();
        textFieldNama = new javax.swing.JTextField();
        textFieldKelas = new javax.swing.JTextField();
        textFieldProdi = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelMahasiswa = new javax.swing.JTable();
        buttonTambah = new javax.swing.JButton();
        buttonEdit = new javax.swing.JButton();
        buttonHapus = new javax.swing.JButton();
        buttonCari = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Muhammad Aliif Nashrullah - Mahasiswa");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel2.setText("Nama : Muhammad Aliif Nashrullah");

        jLabel3.setText("NIM : 211011401057");

        jLabel4.setText("NIM : ");

        jLabel5.setText("Nama : ");

        jLabel6.setText("Kelas : ");

        textFieldNIM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNIMActionPerformed(evt);
            }
        });

        textFieldNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNamaActionPerformed(evt);
            }
        });

        textFieldKelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldKelasActionPerformed(evt);
            }
        });

        textFieldProdi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldProdiActionPerformed(evt);
            }
        });

        jLabel7.setText("Prodi : ");

        tabelMahasiswa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NIM", "Nama", "Kelas", "Prodi"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelMahasiswa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMahasiswaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelMahasiswa);
        if (tabelMahasiswa.getColumnModel().getColumnCount() > 0) {
            tabelMahasiswa.getColumnModel().getColumn(0).setResizable(false);
            tabelMahasiswa.getColumnModel().getColumn(1).setResizable(false);
            tabelMahasiswa.getColumnModel().getColumn(2).setResizable(false);
            tabelMahasiswa.getColumnModel().getColumn(3).setResizable(false);
        }

        buttonTambah.setText("Tambah");
        buttonTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTambahActionPerformed(evt);
            }
        });

        buttonEdit.setText("Edit");
        buttonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditActionPerformed(evt);
            }
        });

        buttonHapus.setText("Hapus");
        buttonHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHapusActionPerformed(evt);
            }
        });

        buttonCari.setText("Cari");
        buttonCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCariActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Program Input Data Mahasiswa");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(jLabel3))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(78, 78, 78)
                                .addComponent(textFieldProdi, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(textFieldKelas, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel4))
                                    .addGap(74, 74, 74)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(textFieldNama, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textFieldNIM, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buttonTambah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonHapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonCari, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(64, 64, 64))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(151, 151, 151))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldNIM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(buttonTambah))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(buttonEdit))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldKelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(buttonHapus))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldProdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(buttonCari))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldNIMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNIMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNIMActionPerformed

    private void textFieldNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNamaActionPerformed

    private void textFieldKelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldKelasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldKelasActionPerformed

    private void textFieldProdiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldProdiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldProdiActionPerformed

    private void buttonTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTambahActionPerformed
        // TODO add your handling code here:
        String NIM = textFieldNIM.getText();
        String nama = textFieldNama.getText();
        String kelas = textFieldKelas.getText();
        String prodi = textFieldProdi.getText();
        
        String sql = "insert into mahasiswa values('"+NIM+"','"+nama+"','"+kelas+"','"+prodi+"');";
        
        runSQL(sql);
        loadTable();
        kosong();
    }//GEN-LAST:event_buttonTambahActionPerformed

    private void buttonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditActionPerformed
        // TODO add your handling code here:
        String NIM = textFieldNIM.getText();
        String nama = textFieldNama.getText();
        String kelas = textFieldKelas.getText();
        String prodi = textFieldProdi.getText();
        String edit = "update mahasiswa set nama='"+nama+"', kelas='"+kelas+"', prodi='"+prodi+"' where NIM='"+NIM+"'";
        runSQL(edit);
        loadTable();
        kosong();
    }//GEN-LAST:event_buttonEditActionPerformed

    private void buttonHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHapusActionPerformed
        // TODO add your handling code here:
        String nama = textFieldNama.getText();
        int konfirm = JOptionPane.showConfirmDialog(this, "Yakin Menghapus "+nama+" ?", 
                "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if (konfirm == 0){
            String ambilNIM = textFieldNIM.getText();
            String hapus = "delete from mahasiswa where NIM='"+ambilNIM+"'";
            runSQL(hapus);
            loadTable();
            kosong();
        }
    }//GEN-LAST:event_buttonHapusActionPerformed

    private void tabelMahasiswaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMahasiswaMouseClicked
        // TODO add your handling code here:
        
        int row = tabelMahasiswa.getSelectedRow();
        textFieldNIM.setText(tabelMahasiswa.getModel().getValueAt(row,0).toString());
        textFieldNama.setText(tabelMahasiswa.getModel().getValueAt(row,1).toString());
        textFieldKelas.setText(tabelMahasiswa.getModel().getValueAt(row,2).toString());
        textFieldProdi.setText(tabelMahasiswa.getModel().getValueAt(row,3).toString());
    }//GEN-LAST:event_tabelMahasiswaMouseClicked

    private void buttonCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCariActionPerformed
        // TODO add your handling code here:
        String NIM = textFieldNIM.getText();
        String nama = textFieldNama.getText();
        String kelas = textFieldKelas.getText();
        String prodi = textFieldProdi.getText();
        String sql = "";
        
        if(!NIM.isEmpty()){
        sql = "select * from mahasiswa where NIM='"+NIM+"'";
        } else if(!nama.isEmpty()){
        sql = "select * from mahasiswa where nama like '%"+nama+"%'";    
        } else if (!kelas.isEmpty()){
        sql = "select * from mahasiswa where kelas='"+kelas+"'";
        } else if(!prodi.isEmpty()){
            sql = "select * from mahasiswa where prodi='"+prodi+"'";
        } else {
            JOptionPane.showMessageDialog(this, "Tolong masukan minimal satu kolom");
        }
        
        DefaultTableModel mod = new DefaultTableModel();
        mod.addColumn("NIM");
        mod.addColumn("nama");
        mod.addColumn("kelas");
        mod.addColumn("prodi");
        try{
//          sql = "select * from mahasiswa where NIM='"+NIM+"' or nama like '%"+nama+"%' or kelas='"+kelas+"' or prodi='"+prodi+"'";
            java.sql.Connection conn = (Connection) configDB.koneksi();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet rs = stm.executeQuery(sql);
            
            while(rs.next()) {
                mod.addRow(new Object[]{
                rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)
                });
            } 
            tabelMahasiswa.setModel(mod);
        }catch (Exception e){
            System.out.println("Error : "+e.toString());
        }
    }//GEN-LAST:event_buttonCariActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

    private void loadTable(){
        DefaultTableModel mod = new DefaultTableModel();
        mod.addColumn("NIM");
        mod.addColumn("nama");
        mod.addColumn("kelas");
        mod.addColumn("prodi");
        try{
            String sql = "select * from mahasiswa";
            java.sql.Connection conn = (Connection) configDB.koneksi();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet rs = stm.executeQuery(sql);
            
            while(rs.next()) {
                mod.addRow(new Object[]{
                rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)
                });
            } 
            tabelMahasiswa.setModel(mod);
        }catch (Exception e){
            System.out.println("Error : "+e.toString());
        }
    }
    
    private void kosong(){
        textFieldNIM.setText("");
        textFieldNama.setText("");
        textFieldKelas.setText("");
        textFieldProdi.setText("");
    }
    
    private void runSQL(String sql){
        try {
            java.sql.Connection conn = (Connection) configDB.koneksi();
            java.sql.PreparedStatement pst =conn.prepareStatement(sql);
            pst.execute();
        } catch (Exception e) {
            System.err.println("gagal sql");
        }
    }
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
            java.util.logging.Logger.getLogger(Tabel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tabel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tabel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tabel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tabel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCari;
    private javax.swing.JButton buttonEdit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton buttonHapus;
    private javax.swing.JButton buttonTambah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelMahasiswa;
    private javax.swing.JTextField textFieldKelas;
    private javax.swing.JTextField textFieldNIM;
    private javax.swing.JTextField textFieldNama;
    private javax.swing.JTextField textFieldProdi;
    // End of variables declaration//GEN-END:variables
}
