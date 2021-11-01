/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackage.ui.kategori.entity;

import MainPackage.Factory.Entity;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;

/**
 *
 * @author praset
 */
public class Kategori extends Entity{
    
    private int idKategori;
    private String namaKategori;
    
    public Kategori() {}
    
    public Kategori(String namaKategori) {
        this.namaKategori = namaKategori;
    }
    
    public Kategori(int idKategori, String namaKategori) {
        this.idKategori = idKategori;
        this.namaKategori = namaKategori;
    }
    
    public Kategori(JTable table) {
        this.idKategori = Integer.parseInt(table.getValueAt(table.getSelectedRow(), 0).toString());
        this.namaKategori = table.getValueAt(table.getSelectedRow(), 1).toString();
    }
    
    public Kategori(ResultSet rs) {
        try {
            setFromResultSet(rs);
        } catch (SQLException ex) {
            Logger.getLogger(Kategori.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void setFromResultSet(ResultSet rs) throws SQLException {
        try {
            setIdKategori(rs.getInt("id_kategori"));
            setNamaKategori(rs.getString("nama_kategori"));
        } catch (SQLException e) {
            Logger.getLogger(Kategori.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Override
    public String listColumn() {
        return "nama_kategori";
    }

    @Override
    public String toStringInsert() {
        return "'" + getNamaKategori() + "'";
    }

    @Override
    public String toStringUpdate() {
        return "nama_kategori = '" + getNamaKategori() + "'";
    }

    @Override
    public String getPrimaryKey() {
        return ""+getIdKategori();
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
     * @return the namaKategori
     */
    public String getNamaKategori() {
        return namaKategori;
    }

    /**
     * @param namaKategori the namaKategori to set
     */
    public void setNamaKategori(String namaKategori) {
        this.namaKategori = namaKategori;
    }

    
}
