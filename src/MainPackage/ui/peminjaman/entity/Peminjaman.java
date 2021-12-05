/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackage.ui.peminjaman.entity;

import MainPackage.Factory.Entity;
import MainPackage.ui.anggota.entity.Anggota;
import MainPackage.ui.buku.entity.Buku;
import MainPackage.ui.petugas.entity.Petugas;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;

/**
 *
 * @author praset
 */
public class Peminjaman extends Entity {
    
    private int idPeminjaman;
    private String tanggalPinjam;
    private String tanggalKembali;
    private Buku buku;
    private Anggota anggota;
    private Petugas petugas;

    public Peminjaman() {}

    public Peminjaman(int idPeminjaman, String tanggalPinjam, String tanggalKembali, Buku buku, Anggota anggota, Petugas petugas) {
        this.idPeminjaman = idPeminjaman;
        this.tanggalPinjam = tanggalPinjam;
        this.tanggalKembali = tanggalKembali;
        this.buku = buku;
        this.anggota = anggota;
        this.petugas = petugas;
    }
    
    public Peminjaman(JTable table, Buku buku, Anggota anggota, Petugas petugas) {
        this.idPeminjaman = Integer.parseInt(table.getValueAt(table.getSelectedRow(), 0).toString());
        this.tanggalPinjam = table.getValueAt(table.getSelectedRow(), 1).toString();
        this.tanggalKembali = table.getValueAt(table.getSelectedRow(), 2).toString();
        this.buku = buku;
        this.anggota = anggota;
        this.petugas = petugas;
    }
    
    public Peminjaman(ResultSet rs) {
        try {
            setFromResultSet(rs);
        } catch (SQLException ex) {
            Logger.getLogger(Peminjaman.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void setFromResultSet(ResultSet rs) throws SQLException {
        try {
            setIdPeminjaman(rs.getInt("id_peminjaman"));
            setTanggalPinjam(rs.getString("tanggal_pinjam"));
            setTanggalKembali(rs.getString("tanggal_kembali"));
            setBuku(new Buku(rs));
            setPetugas(new Petugas(rs));
            setAnggota(new Anggota(rs));
        } catch (SQLException e) {
            Logger.getLogger(Peminjaman.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Override
    public String listColumn() {
        return "tanggal_pinjam, kode_buku, id_petugas, kode_anggota";
    }

    @Override
    public String toStringInsert() {
        return "'" + tanggalPinjam + "',"
                + "'" + buku.getKodeBuku()+ "',"
                + "'" + petugas.getIdPetugas() + "',"
                + "'" + anggota.getKodeAnggota()+ "'";
    }

    @Override
    public String toStringUpdate() {
        return "tanggal_pinjam = '" + tanggalPinjam + "',"
                + "kode_buku = '" + buku.getKodeBuku()+ "',"
                + "id_petugas = '" + petugas.getIdPetugas() + "',"
                + "kode_anggota = '" + anggota.getKodeAnggota()+ "'";
    }

    @Override
    public String getPrimaryKey() {
        return ""+getIdPeminjaman();
    }

    /**
     * @return the idPeminjaman
     */
    public int getIdPeminjaman() {
        return idPeminjaman;
    }

    /**
     * @param idPeminjaman the idPeminjaman to set
     */
    public void setIdPeminjaman(int idPeminjaman) {
        this.idPeminjaman = idPeminjaman;
    }

    /**
     * @return the tanggalPinjam
     */
    public String getTanggalPinjam() {
        return tanggalPinjam;
    }

    /**
     * @param tanggalPinjam the tanggalPinjam to set
     */
    public void setTanggalPinjam(String tanggalPinjam) {
        this.tanggalPinjam = tanggalPinjam;
    }

    /**
     * @return the tanggalKembali
     */
    public String getTanggalKembali() {
        return tanggalKembali;
    }

    /**
     * @param tanggalKembali the tanggalKembali to set
     */
    public void setTanggalKembali(String tanggalKembali) {
        this.tanggalKembali = tanggalKembali;
    }

    /**
     * @return the buku
     */
    public Buku getBuku() {
        return buku;
    }

    /**
     * @param buku the buku to set
     */
    public void setBuku(Buku buku) {
        this.buku = buku;
    }

    /**
     * @return the anggota
     */
    public Anggota getAnggota() {
        return anggota;
    }

    /**
     * @param anggota the anggota to set
     */
    public void setAnggota(Anggota anggota) {
        this.anggota = anggota;
    }

    /**
     * @return the petugas
     */
    public Petugas getPetugas() {
        return petugas;
    }

    /**
     * @param petugas the petugas to set
     */
    public void setPetugas(Petugas petugas) {
        this.petugas = petugas;
    }
    
}
