/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class Peminjaman {

    private int idPeminjaman;
    private Anggota anggota = new Anggota();
    private Buku buku = new Buku();
    private Pegawai pegawai = new Pegawai();
    private String tanggalPinjam;
    private String tanggalKembali;

    // Getter dan Setter
    public int getIdPeminjaman() {
        return idPeminjaman;
    }

    public void setIdPeminjaman(int idPeminjaman) {
        this.idPeminjaman = idPeminjaman;
    }

    public Anggota getAnggota() {
        return anggota;
    }

    public void setAnggota(Anggota anggota) {
        this.anggota = anggota;
    }

    public Pegawai getPegawai() {
        return pegawai;
    }

    public void setPegawai(Pegawai pegawai) {
        this.pegawai = pegawai;
    }

    public Buku getBuku() {
        return buku;
    }

    public void setBuku(Buku buku) {
        this.buku = buku;
    }

    public String getTanggalPinjam() {
        return tanggalPinjam;
    }

    public void setTanggalPinjam(String tanggalPinjam) {
        this.tanggalPinjam = tanggalPinjam;
    }

    public String getTanggalKembali() {
        return tanggalKembali;
    }

    public void setTanggalKembali(String tanggalKembali) {
        this.tanggalKembali = tanggalKembali;
    }

    // Constructor
    public Peminjaman() {
    }

    public Peminjaman(Anggota anggota, Buku buku, String tanggalPinjam, String tanggalKembali) {
        this.anggota = anggota;
        this.buku = buku;
        this.tanggalPinjam = tanggalPinjam;
        this.tanggalKembali = tanggalKembali;
    }

    // Method untuk mendapatkan peminjaman berdasarkan ID
    public Peminjaman getById(int id) {
        Peminjaman peminjaman = new Peminjaman();
        String query = "SELECT p.*, pg.nama AS namaPegawai, pg.idpegawai "
                + "FROM peminjaman p "
                + "JOIN pegawai pg ON p.idpegawai = pg.idpegawai "
                + "WHERE p.idpeminjaman = '" + id + "'";
        ResultSet rs = DBHelper.selectQuery(query);

        try {
            if (rs.next()) {
                peminjaman.setIdPeminjaman(rs.getInt("idpeminjaman"));
                peminjaman.getAnggota().setIdanggota(rs.getInt("idanggota"));
                peminjaman.getBuku().setIdBuku(rs.getInt("idbuku"));
                peminjaman.setTanggalPinjam(rs.getString("tanggalpinjam"));
                peminjaman.setTanggalKembali(rs.getString("tanggalkembali"));

                // Buat objek Pegawai lengkap
                Pegawai pegawai = new Pegawai();
                pegawai.setIdpegawai(rs.getInt("idpegawai"));
                pegawai.setNama(rs.getString("namaPegawai"));
                peminjaman.setPegawai(pegawai);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return peminjaman;
    }

    // Method untuk mendapatkan semua data peminjaman
    public ArrayList<Peminjaman> getAll() {
        ArrayList<Peminjaman> listPeminjaman = new ArrayList<>();
        String query = "SELECT p.*, pg.idpegawai, pg.nama AS namaPegawai FROM peminjaman p "
                + "JOIN pegawai pg ON p.idpegawai = pg.idpegawai ORDER BY p.idpeminjaman DESC";

        ResultSet rs = DBHelper.selectQuery(query);

        try {
            while (rs.next()) {
                Peminjaman peminjaman = new Peminjaman();
                peminjaman.setIdPeminjaman(rs.getInt("idpeminjaman"));
                peminjaman.getAnggota().setIdanggota(rs.getInt("idanggota"));
                peminjaman.getBuku().setIdBuku(rs.getInt("idbuku"));
                peminjaman.setTanggalPinjam(rs.getString("tanggalpinjam"));
                peminjaman.setTanggalKembali(rs.getString("tanggalkembali"));

                Pegawai pegawai = new Pegawai();
                pegawai.setIdpegawai(rs.getInt("idpegawai"));
                pegawai.setNama(rs.getString("namaPegawai"));
                peminjaman.setPegawai(pegawai);

                listPeminjaman.add(peminjaman);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listPeminjaman;
    }

    // Method untuk mencari peminjaman berdasarkan keyword
    public ArrayList<Peminjaman> search(String keyword) {
        ArrayList<Peminjaman> listPeminjaman = new ArrayList<>();
        String query = "SELECT * FROM peminjaman WHERE idanggota LIKE '%" + keyword + "%' OR idbuku LIKE '%" + keyword + "%'";
        ResultSet rs = DBHelper.selectQuery(query);

        try {
            while (rs.next()) {
                Peminjaman peminjaman = new Peminjaman();
                peminjaman.setIdPeminjaman(rs.getInt("idpeminjaman"));
                peminjaman.getAnggota().setIdanggota(rs.getInt("idanggota"));
                peminjaman.getBuku().setIdBuku(rs.getInt("idbuku"));
                peminjaman.setTanggalPinjam(rs.getString("tanggalpinjam"));
                peminjaman.setTanggalKembali(rs.getString("tanggalkembali"));

                listPeminjaman.add(peminjaman);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listPeminjaman;
    }

    public void save() {
        String SQL;
        if (getById(idPeminjaman).getIdPeminjaman() == 0) {
            // Jika data baru
            SQL = "INSERT INTO peminjaman (idanggota, idbuku, idpegawai, tanggalpinjam, tanggalkembali) VALUES ("
                    + "'" + this.getAnggota().getIdanggota() + "', "
                    + "'" + this.getBuku().getIdBuku() + "', "
                    + "'" + this.getPegawai().getIdpegawai() + "', "
                    + "'" + this.tanggalPinjam + "', "
                    + (this.tanggalKembali != null ? "'" + this.tanggalKembali + "'" : "NULL") + ")";
            this.idPeminjaman = DBHelper.insertQueryGetId(SQL);
        } else {
            // Jika data sudah ada (update)
            SQL = "UPDATE peminjaman SET "
                    + "idanggota = '" + this.getAnggota().getIdanggota() + "', "
                    + "idbuku = '" + this.getBuku().getIdBuku() + "', "
                    + "idpegawai = '" + this.getPegawai().getIdpegawai() + "', "
                    + "tanggalpinjam = '" + this.tanggalPinjam + "', "
                    + "tanggalkembali = " + (this.tanggalKembali != null ? "'" + this.tanggalKembali + "'" : "NULL") + " "
                    + "WHERE idpeminjaman = '" + this.idPeminjaman + "'";
            DBHelper.executeQuery(SQL);
        }
    }

    // Method untuk menghapus data peminjaman
    public void delete() {
        String SQL = "DELETE FROM peminjaman WHERE idpeminjaman = '" + this.idPeminjaman + "'";
        DBHelper.executeQuery(SQL);
    }

    public String getNamaAnggotaById(int idAnggota) {
        String nama = "";
        String query = "SELECT nama FROM anggota WHERE idanggota = " + idAnggota;
        ResultSet rs = DBHelper.selectQuery(query);
        try {
            if (rs.next()) {
                nama = rs.getString("nama");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return nama;
    }

    public String getJudulBukuById(int idBuku) {
        String judul = "";
        String query = "SELECT judul FROM buku WHERE idbuku = " + idBuku;
        ResultSet rs = DBHelper.selectQuery(query);
        try {
            if (rs.next()) {
                judul = rs.getString("judul");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return judul;
    }

}
