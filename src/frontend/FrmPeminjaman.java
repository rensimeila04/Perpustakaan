/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frontend;

import backend.Anggota;
import backend.Buku;
import backend.Kategori;
import backend.Pegawai;
import backend.Peminjaman;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class FrmPeminjaman extends javax.swing.JFrame {

    /**
     * Creates new form FrmPeminjaman
     */
    public FrmPeminjaman() {
        initComponents();
        kosongkanForm();
        tampilkanData();
        tampilkanCmbPegawai();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtIdPeminjaman = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnSimpan = new javax.swing.JButton();
        btnTambahBaru = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPeminjaman = new javax.swing.JTable();
        txtIdAnggota = new javax.swing.JTextField();
        txtIdBuku = new javax.swing.JTextField();
        btnCariAnggota = new javax.swing.JButton();
        btnCariBuku = new javax.swing.JButton();
        lblNamaAnggota = new javax.swing.JLabel();
        lblJudulBuku = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtTanggalPinjam = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        cmbPegawai = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtTanggalKembali = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("FORM PEMINJAMAN");

        jLabel2.setText("ID Peminjaman");

        txtIdPeminjaman.setEditable(false);
        txtIdPeminjaman.setEnabled(false);
        txtIdPeminjaman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdPeminjamanActionPerformed(evt);
            }
        });

        jLabel3.setText("ID Anggota");

        jLabel4.setText("ID Buku");

        jLabel5.setText("Tanggal Pinjam");

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnTambahBaru.setText("Tambah Baru");
        btnTambahBaru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahBaruActionPerformed(evt);
            }
        });

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        tblPeminjaman.setModel(new javax.swing.table.DefaultTableModel(
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
        tblPeminjaman.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPeminjamanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPeminjaman);

        btnCariAnggota.setText("Cari");
        btnCariAnggota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariAnggotaActionPerformed(evt);
            }
        });

        btnCariBuku.setText("Cari");
        btnCariBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariBukuActionPerformed(evt);
            }
        });

        lblNamaAnggota.setText("Nama Anggota");

        lblJudulBuku.setText("Judul Buku");

        jLabel8.setText("Format: YYYY/MM/DD");

        jLabel6.setText("Pegawai");

        cmbPegawai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel9.setText("Format: YYYY/MM/DD");

        jLabel7.setText("Tanggal Kembali");

        txtTanggalKembali.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnTambahBaru)
                        .addGap(18, 18, 18)
                        .addComponent(btnHapus))
                    .addComponent(btnSimpan)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 667, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtIdPeminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNamaAnggota)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtIdAnggota, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtIdBuku)
                                        .addComponent(txtTanggalPinjam, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                        .addComponent(cmbPegawai, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtTanggalKembali, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                                    .addComponent(lblJudulBuku))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCariAnggota)
                            .addComponent(btnCariBuku)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(237, 237, 237)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel2)
                    .addComponent(txtIdPeminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cmbPegawai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnCariAnggota)
                    .addComponent(txtIdAnggota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNamaAnggota)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnCariBuku)
                    .addComponent(txtIdBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblJudulBuku)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8)
                    .addComponent(txtTanggalPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9)
                    .addComponent(txtTanggalKembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(btnSimpan)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTambahBaru)
                    .addComponent(btnHapus))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdPeminjamanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdPeminjamanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdPeminjamanActionPerformed

    private void btnTambahBaruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahBaruActionPerformed
        kosongkanForm();
    }//GEN-LAST:event_btnTambahBaruActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        try {
            // Validasi input tidak boleh kosong
            if (txtIdAnggota.getText().trim().isEmpty() || txtIdBuku.getText().trim().isEmpty() || cmbPegawai.getSelectedItem() == null) {
                JOptionPane.showMessageDialog(this, "Semua data harus diisi!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Validasi input adalah angka
            if (!txtIdAnggota.getText().matches("\\d+") || !txtIdBuku.getText().matches("\\d+")) {
                JOptionPane.showMessageDialog(this, "ID Anggota dan ID Buku harus berupa angka!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Parsing ID Anggota, ID Buku, dan Pegawai
            int idAnggota = Integer.parseInt(txtIdAnggota.getText().trim());
            int idBuku = Integer.parseInt(txtIdBuku.getText().trim());
            Pegawai pegawaiTerpilih = new Pegawai().getById(((Pegawai) cmbPegawai.getSelectedItem()).getIdpegawai());

            // Validasi format tanggal (yyyy/MM/dd)
            if (!isValidDateFormat(txtTanggalPinjam.getText().trim())) {
                JOptionPane.showMessageDialog(this, "Format tanggal harus yyyy/MM/dd!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Membuat objek Peminjaman
            Peminjaman peminjaman = new Peminjaman();
            peminjaman.getAnggota().setIdanggota(idAnggota);
            peminjaman.getBuku().setIdBuku(idBuku);
            peminjaman.setTanggalPinjam(txtTanggalPinjam.getText().trim());
            peminjaman.setTanggalKembali(txtTanggalKembali.getText().trim().isEmpty() ? null : txtTanggalKembali.getText().trim());
            peminjaman.setPegawai(pegawaiTerpilih); // Set Pegawai

            // Periksa apakah ini data baru atau update
            if (txtIdPeminjaman.getText().trim().isEmpty()) {
                // Data baru
                peminjaman.save();
                JOptionPane.showMessageDialog(this, "Data baru berhasil disimpan!", "Sukses", JOptionPane.INFORMATION_MESSAGE);
            } else {
                // Data lama, lakukan update
                peminjaman.setIdPeminjaman(Integer.parseInt(txtIdPeminjaman.getText().trim()));
                peminjaman.save(); // save() akan otomatis melakukan update berdasarkan ID
                JOptionPane.showMessageDialog(this, "Data berhasil diperbarui!", "Sukses", JOptionPane.INFORMATION_MESSAGE);
            }

            // Refresh data tabel
            tampilkanData();

            // Kosongkan form setelah simpan
            kosongkanForm();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "ID Anggota dan ID Buku harus berupa angka!", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat menyimpan data!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnCariAnggotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariAnggotaActionPerformed
        try {
            // Ambil ID Anggota dari input
            int idAnggota = Integer.parseInt(txtIdAnggota.getText());

            // Cari nama anggota berdasarkan ID
            String namaAnggota = new Peminjaman().getNamaAnggotaById(idAnggota);

            // Periksa apakah anggota ditemukan
            if (namaAnggota != null && !namaAnggota.isEmpty()) {
                lblNamaAnggota.setText(namaAnggota); // Tampilkan nama anggota
            } else {
                lblNamaAnggota.setText("Anggota tidak ditemukan"); // Tampilkan pesan jika anggota tidak ditemukan
            }
        } catch (NumberFormatException ex) {
            // Tampilkan pesan kesalahan jika input bukan angka
            JOptionPane.showMessageDialog(null, "ID Anggota harus berupa angka!", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan saat mencari anggota!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnCariAnggotaActionPerformed

    private void btnCariBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariBukuActionPerformed
        try {
            // Ambil ID Buku dari input
            int idBuku = Integer.parseInt(txtIdBuku.getText());

            // Cari judul buku berdasarkan ID
            String judulBuku = new Peminjaman().getJudulBukuById(idBuku);

            // Periksa apakah judul buku ditemukan
            if (judulBuku != null && !judulBuku.isEmpty()) {
                lblJudulBuku.setText(judulBuku); // Tampilkan judul buku jika ditemukan
            } else {
                lblJudulBuku.setText("Buku tidak ditemukan"); // Tampilkan pesan jika tidak ditemukan
            }
        } catch (NumberFormatException ex) {
            // Tampilkan pesan error jika ID bukan angka
            JOptionPane.showMessageDialog(null, "ID Buku harus berupa angka!", "Error", JOptionPane.ERROR_MESSAGE);
            lblJudulBuku.setText("Buku tidak ditemukan");
        } catch (Exception ex) {
            // Tangkap error lainnya
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan saat mencari buku!", "Error", JOptionPane.ERROR_MESSAGE);
            lblJudulBuku.setText("Buku tidak ditemukan");
        }
    }//GEN-LAST:event_btnCariBukuActionPerformed

    private void tblPeminjamanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPeminjamanMouseClicked
        DefaultTableModel model = (DefaultTableModel) tblPeminjaman.getModel();
        int row = tblPeminjaman.getSelectedRow();
        Peminjaman peminjaman = new Peminjaman();

        if (row >= 0) {
            peminjaman = peminjaman.getById(Integer.parseInt(model.getValueAt(row, 0).toString()));
            // Ambil data dari tabel
            txtIdPeminjaman.setText(String.valueOf(peminjaman.getIdPeminjaman()));
            cmbPegawai.getModel().setSelectedItem(peminjaman.getPegawai());
            txtIdAnggota.setText(String.valueOf(peminjaman.getAnggota().getIdanggota()));
            txtIdBuku.setText(String.valueOf(peminjaman.getBuku().getIdBuku()));

            // Format ulang tanggal pinjam dan tanggal kembali
            txtTanggalPinjam.setText(formatTanggal(String.valueOf(peminjaman.getTanggalPinjam())));
            String tanggalKembali = String.valueOf(peminjaman.getTanggalKembali());
            if (tanggalKembali == null || tanggalKembali.trim().isEmpty() || tanggalKembali.equals("null")) {
                // Jika tanggal kembali kosong, kosongkan teks dan enable input
                txtTanggalKembali.setText("");
                txtTanggalKembali.setEnabled(true);
            } else {
                // Jika tanggal kembali tidak kosong, format dan disable input
                txtTanggalKembali.setText(formatTanggal(tanggalKembali));
                txtTanggalKembali.setEnabled(false);
            }

            // Disable input lainnya
            cmbPegawai.setEnabled(false);
            txtIdAnggota.setEnabled(false);
            txtIdBuku.setEnabled(false);
            txtTanggalPinjam.setEnabled(false);
        }

    }//GEN-LAST:event_tblPeminjamanMouseClicked

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        DefaultTableModel model = (DefaultTableModel) tblPeminjaman.getModel();
        int row = tblPeminjaman.getSelectedRow();

        if (row >= 0) {
            Peminjaman peminjaman = new Peminjaman().getById(Integer.parseInt(model.getValueAt(row, 0).toString()));
            peminjaman.delete();
            kosongkanForm();
            tampilkanData();
        } else {
            JOptionPane.showMessageDialog(this, "Pilih data yang ingin dihapus terlebih dahulu!", "Peringatan", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnHapusActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPeminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPeminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPeminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPeminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPeminjaman().setVisible(true);
            }
        });
    }

    private void kosongkanForm() {
        txtIdPeminjaman.setText("");
        txtIdAnggota.setText("");
        txtIdBuku.setText("");
        txtTanggalPinjam.setText("");
        txtTanggalKembali.setText("");
        cmbPegawai.setSelectedIndex(0);

        // Aktifkan kembali semua input
        cmbPegawai.setEnabled(true);
        txtIdAnggota.setEnabled(true);
        txtIdBuku.setEnabled(true);
        txtTanggalPinjam.setEnabled(true);
        txtTanggalKembali.setEnabled(false);
    }

    private String formatTanggal(String tanggal) {
        try {
            if (tanggal.isEmpty()) {
                return ""; // Jika tanggal kosong, kembalikan string kosong
            }
            SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd"); // Format dari database
            SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy/MM/dd"); // Format yang diinginkan
            return outputFormat.format(inputFormat.parse(tanggal));
        } catch (ParseException e) {
            e.printStackTrace();
            return tanggal; // Kembalikan tanggal asli jika terjadi error
        }
    }

    private boolean isValidDateFormat(String date) {
        if (date.trim().isEmpty()) {
            return false;
        }
        try {
            new SimpleDateFormat("yyyy/MM/dd").parse(date);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }

    private void tampilkanData() {
        String[] kolom = {"ID", "ID Pegawai", "Nama Pegawai", "ID Anggota", "ID Buku", "Tanggal Pinjam", "Tanggal Kembali"};
        ArrayList<Peminjaman> list = new Peminjaman().getAll(); // Mendapatkan semua data dari database
        Object rowData[] = new Object[kolom.length];

        tblPeminjaman.setModel(new DefaultTableModel(new Object[][]{}, kolom));
        DefaultTableModel model = (DefaultTableModel) tblPeminjaman.getModel();

        for (Peminjaman peminjaman : list) {
            rowData[0] = peminjaman.getIdPeminjaman();
            rowData[1] = peminjaman.getPegawai().getIdpegawai(); // Tambahkan ID Pegawai
            rowData[2] = peminjaman.getPegawai().getNama();      // Tambahkan Nama Pegawai
            rowData[3] = peminjaman.getAnggota().getIdanggota();
            rowData[4] = peminjaman.getBuku().getIdBuku();
            rowData[5] = peminjaman.getTanggalPinjam();
            rowData[6] = peminjaman.getTanggalKembali();
            model.addRow(rowData);
        }
    }

    public void tampilkanCmbPegawai() {
        cmbPegawai.setModel(new DefaultComboBoxModel(new Pegawai().getAll().toArray()));
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCariAnggota;
    private javax.swing.JButton btnCariBuku;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnTambahBaru;
    private javax.swing.JComboBox<String> cmbPegawai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblJudulBuku;
    private javax.swing.JLabel lblNamaAnggota;
    private javax.swing.JTable tblPeminjaman;
    private javax.swing.JTextField txtIdAnggota;
    private javax.swing.JTextField txtIdBuku;
    private javax.swing.JTextField txtIdPeminjaman;
    private javax.swing.JFormattedTextField txtTanggalKembali;
    private javax.swing.JFormattedTextField txtTanggalPinjam;
    // End of variables declaration//GEN-END:variables
}