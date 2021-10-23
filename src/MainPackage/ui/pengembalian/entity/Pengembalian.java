/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackage.ui.pengembalian.entity;

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
public class Pengembalian extends Entity {
    
    private int idPengembalian;
    private String tanggalPengembalian;
    private int denda;
    private Buku buku;
    private Anggota anggota;
    private Petugas petugas;

    public Pengembalian() {}

    public Pengembalian(int idPengembalian, String tanggalPengembalian, int denda, Buku buku, Anggota anggota, Petugas petugas) {
        this.idPengembalian = idPengembalian;
        this.tanggalPengembalian = tanggalPengembalian;
        this.denda = denda;
        this.buku = buku;
        this.anggota = anggota;
        this.petugas = petugas;
    }
    
    public Pengembalian(JTable table, Buku buku, Anggota anggota, Petugas petugas) {
        this.idPengembalian = Integer.parseInt(table.getValueAt(table.getSelectedRow(), 0).toString());
        this.tanggalPengembalian = table.getValueAt(table.getSelectedRow(), 1).toString();
        this.denda = Integer.parseInt(table.getValueAt(table.getSelectedRow(), 2).toString());
        this.buku = buku;
        this.anggota = anggota;
        this.petugas = petugas;
    }
    
    public Pengembalian(ResultSet rs) {
        try {
            setFromResultSet(rs);
        } catch (SQLException ex) {
            Logger.getLogger(Pengembalian.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     private void setFromResultSet(ResultSet rs) throws SQLException {
        try {
            setIdPengembalian(rs.getInt("id_pengembalian"));
            setTanggalPengembalian(rs.getString("tanggal_pengembalian"));
            setDenda(rs.getInt("denda"));
            setBuku(new Buku(rs));
            setAnggota(new Anggota(rs));
            setPetugas(new Petugas(rs));
        } catch (SQLException e) {
            Logger.getLogger(Pengembalian.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Override
    public String listColumn() {
        return "tanggal_pengembalian, denda, id_buku, id_anggota, id_petugas";
    }

    @Override
    public String toStringInsert() {
        return "'" + getTanggalPengembalian() + "'"
                + "'" + getDenda() + "'"
                + "'" + getBuku().getIdBuku() + "'"
                + "'" + getAnggota().getIdAnggota() + "'"
                + "'" + getPetugas().getIdPetugas() + "'";
    }

    @Override
    public String toStringUpdate() {
        return "tanggal_pengembalian = '" + getTanggalPengembalian() + "'"
                + "denda = '" + getDenda() + "'"
                + "id_buku = '" + getBuku().getIdBuku() + "'"
                + "id_anggota = '" + getAnggota().getIdAnggota() + "'"
                + "id_petugas = '" + getPetugas().getIdPetugas() + "'";
    }

    @Override
    public String getPrimaryKey() {
        return ""+getIdPengembalian();
    }

    /**
     * @return the idPengembalian
     */
    public int getIdPengembalian() {
        return idPengembalian;
    }

    /**
     * @param idPengembalian the idPengembalian to set
     */
    public void setIdPengembalian(int idPengembalian) {
        this.idPengembalian = idPengembalian;
    }

    /**
     * @return the tanggalPengembalian
     */
    public String getTanggalPengembalian() {
        return tanggalPengembalian;
    }

    /**
     * @param tanggalPengembalian the tanggalPengembalian to set
     */
    public void setTanggalPengembalian(String tanggalPengembalian) {
        this.tanggalPengembalian = tanggalPengembalian;
    }

    /**
     * @return the denda
     */
    public int getDenda() {
        return denda;
    }

    /**
     * @param denda the denda to set
     */
    public void setDenda(int denda) {
        this.denda = denda;
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
