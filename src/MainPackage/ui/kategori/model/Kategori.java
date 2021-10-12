/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackage.ui.kategori.model;

import MainPackage.Factory.Entity;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author praset
 */
public class Kategori extends Entity{
    
    int idKategori;
    String namaKategori;
    
    public Kategori(ResultSet rs) {
        try {
            setFromResultSet(rs);
        } catch (SQLException ex) {
            Logger.getLogger(Kategori.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void setFromResultSet(ResultSet rs) throws SQLException {
        try {
            idKategori = rs.getInt("id_kategori");
            namaKategori = rs.getString("nama_kategori");
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
        return "'" + namaKategori + "'";
    }

    @Override
    public String toStringUpdate() {
        return "nama_kategori = '" + namaKategori + "'";
    }

    @Override
    public String getPrimaryKey() {
        return ""+idKategori;
    }
    
}
