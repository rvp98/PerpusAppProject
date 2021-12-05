/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackage.ui.buku.entity;

import MainPackage.Factory.Entity;
import MainPackage.ui.kategori.entity.Kategori;
import MainPackage.ui.rak.entity.Rak;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;

/**
 *
 * @author praset
 */
public class Buku extends Entity {
    private int idBuku;
    private String kodeBuku;
    private int idKategori;
    private int idRak;
    private String judulBuku;
    private String penulisBuku;
    private String penerbitBuku;
    private String tahunPenerbit;
    private int stok;
    private Kategori kategori;
    private Rak rak;

    public Buku() {}

    public Buku(int idBuku, String kodeBuku, int idKategori, int idRak, String judulBuku, String penulisBuku, String penerbitBuku, String tahunPenerbit, int stok, Kategori kategori, Rak rak) {
        this.idBuku = idBuku;
        this.kodeBuku = kodeBuku;
        this.idKategori = idKategori;
        this.idRak = idRak;
        this.judulBuku = judulBuku;
        this.penulisBuku = penulisBuku;
        this.penerbitBuku = penerbitBuku;
        this.tahunPenerbit = tahunPenerbit;
        this.stok = stok;
        this.kategori = kategori;
        this.rak = rak;
    }
    
    public Buku(JTable table, Kategori kategori) {
        this.idBuku = Integer.parseInt(table.getValueAt(table.getSelectedRow(), 0).toString());
        this.kodeBuku = table.getValueAt(table.getSelectedRow(), 1).toString();
        this.idKategori = Integer.parseInt(table.getValueAt(table.getSelectedRow(), 2).toString());
        this.judulBuku = table.getValueAt(table.getSelectedRow(), 3).toString();
        this.penulisBuku = table.getValueAt(table.getSelectedRow(), 4).toString();
        this.penerbitBuku = table.getValueAt(table.getSelectedRow(), 5).toString();
        this.tahunPenerbit = table.getValueAt(table.getSelectedRow(), 6).toString();
        this.stok = Integer.parseInt(table.getValueAt(table.getSelectedRow(), 7).toString());
        this.kategori = kategori;
    }
    
    public Buku(ResultSet rs) {
        try {
            setFromResultSet(rs);
        } catch (SQLException ex) {
            Logger.getLogger(Buku.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void setFromResultSet(ResultSet rs) throws SQLException {
        try {
            setIdBuku(rs.getInt("id_buku"));
            setKodeBuku(rs.getString("kode_buku"));
            setIdKategori(rs.getInt("id_kategori"));
            setIdRak(rs.getInt("id_rak"));
            setJudulBuku(rs.getString("judul_buku"));
            setPenulisBuku(rs.getString("penulis_buku"));
            setPenerbitBuku(rs.getString("penerbit_buku"));
            setTahunPenerbit(rs.getString("tahun_penerbit"));
            setStok(rs.getInt("stok"));
            setKategori(new Kategori(rs));
            setRak(new Rak(rs));
        } catch (SQLException e) {
            Logger.getLogger(Buku.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    @Override
    public String listColumn() {
        return "kode_buku, id_kategori, id_rak, judul_buku, penulis_buku, penerbit_buku, tahun_penerbit, stok";
    }

    @Override
    public String toStringInsert() {
        return "'" + getKodeBuku() + "',"
                + "'" + getIdKategori() + "',"
                + "'" + getIdRak() + "',"
                + "'" + getJudulBuku() + "',"
                + "'" + getPenulisBuku() + "',"
                + "'" + getPenerbitBuku() + "',"
                + "'" + getTahunPenerbit() + "',"
                + "'" + getStok() + "'";
    }

    @Override
    public String toStringUpdate() {
        return "kode_buku = '" + getKodeBuku() + "',"
                + "id_kategori = '" + getIdKategori() + "',"
                + "id_rak = '" + getIdRak() + "',"
                + "judul_buku = '" + getJudulBuku() + "',"
                + "penulis_buku = '" + getPenulisBuku() + "',"
                + "penerbit_buku = '" + getPenerbitBuku() + "',"
                + "tahun_penerbit = '" + getTahunPenerbit() + "',"
                + "stok = '" + getStok() + "'";
    }

    @Override
    public String getPrimaryKey() {
        return ""+getKodeBuku();
    }

    /**
     * @return the idBuku
     */
    public int getIdBuku() {
        return idBuku;
    }

    /**
     * @param idBuku the idBuku to set
     */
    public void setIdBuku(int idBuku) {
        this.idBuku = idBuku;
    }

    /**
     * @return the kodeBuku
     */
    public String getKodeBuku() {
        return kodeBuku;
    }

    /**
     * @param kodeBuku the kodeBuku to set
     */
    public void setKodeBuku(String kodeBuku) {
        this.kodeBuku = kodeBuku;
    }

    /**
     * @return the idKategori
     */
    public int getIdKategori() {
        return idKategori;
    }

    /**
     * @param idKategori the idKategori to set
     */
    public void setIdKategori(int idKategori) {
        this.idKategori = idKategori;
    }
    
     /**
     * @return the idRak
     */
    public int getIdRak() {
        return idRak;
    }

    /**
     * @param idRak the idRak to set
     */
    public void setIdRak(int idRak) {
        this.idRak = idRak;
    }

    /**
     * @return the judulBuku
     */
    public String getJudulBuku() {
        return judulBuku;
    }

    /**
     * @param judulBuku the judulBuku to set
     */
    public void setJudulBuku(String judulBuku) {
        this.judulBuku = judulBuku;
    }

    /**
     * @return the penulisBuku
     */
    public String getPenulisBuku() {
        return penulisBuku;
    }

    /**
     * @param penulisBuku the penulisBuku to set
     */
    public void setPenulisBuku(String penulisBuku) {
        this.penulisBuku = penulisBuku;
    }

    /**
     * @return the penerbitBuku
     */
    public String getPenerbitBuku() {
        return penerbitBuku;
    }

    /**
     * @param penerbitBuku the penerbitBuku to set
     */
    public void setPenerbitBuku(String penerbitBuku) {
        this.penerbitBuku = penerbitBuku;
    }

    /**
     * @return the tahunPenerbit
     */
    public String getTahunPenerbit() {
        return tahunPenerbit;
    }

    /**
     * @param tahunPenerbit the tahunPenerbit to set
     */
    public void setTahunPenerbit(String tahunPenerbit) {
        this.tahunPenerbit = tahunPenerbit;
    }

    /**
     * @return the stok
     */
    public int getStok() {
        return stok;
    }

    /**
     * @param stok the stok to set
     */
    public void setStok(int stok) {
        this.stok = stok;
    }
    
    /**
     * @return the buku
     */
    public Kategori getKategori() {
        return kategori;
    }

    /**
     * @param buku the buku to set
     */
    public void setKategori(Kategori kategori) {
        this.kategori = kategori;
    }
    
     /**
     * @return the rak
     */
    public Rak getRak() {
        return rak;
    }

    /**
     * @param rak the rak to set
     */
    public void setRak(Rak rak) {
        this.rak = rak;
    }

    @Override
    public String toString() {
        return kodeBuku + " - " + judulBuku;
    }
}
