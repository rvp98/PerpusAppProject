/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackage.ui.pengembalian.entity;

import MainPackage.Factory.Entity;
import MainPackage.ui.peminjaman.entity.Peminjaman;
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
    private Peminjaman peminjaman;

    public Pengembalian() {}

    public Pengembalian(int idPengembalian, String tanggalPengembalian, int denda, Peminjaman peminjaman) {
        this.idPengembalian = idPengembalian;
        this.tanggalPengembalian = tanggalPengembalian;
        this.denda = denda;
        this.peminjaman = peminjaman;
    }
    
    public Pengembalian(JTable table, Peminjaman peminjaman) {
        this.idPengembalian = Integer.parseInt(table.getValueAt(table.getSelectedRow(), 0).toString());
        this.tanggalPengembalian = table.getValueAt(table.getSelectedRow(), 1).toString();
        this.denda = Integer.parseInt(table.getValueAt(table.getSelectedRow(), 2).toString());
        this.peminjaman = peminjaman;
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
            setPeminjaman(new Peminjaman(rs));
        } catch (SQLException e) {
            Logger.getLogger(Pengembalian.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Override
    public String listColumn() {
        return "tanggal_pengembalian, denda, id_peminjaman";
    }

    @Override
    public String toStringInsert() {
        return "'" + getTanggalPengembalian() + "',"
                + "'" + getDenda() + "',"
                + "'" + getPeminjaman().getPrimaryKey() + "'";
                
    }

    @Override
    public String toStringUpdate() {
        return "tanggal_pengembalian = '" + getTanggalPengembalian() + "',"
                + "denda = '" + getDenda() + "',"
                + "id_peminjaman = '" + getPeminjaman().getPrimaryKey() + "'";
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
     * @return the peminjaman
     */
    public Peminjaman getPeminjaman() {
        return peminjaman;
    }

    /**
     * @param peminjaman the peminjaman to set
     */
    public void setPeminjaman(Peminjaman peminjaman) {
        this.peminjaman = peminjaman;
    }
    
}
