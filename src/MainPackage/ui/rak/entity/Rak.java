/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackage.ui.rak.entity;

import MainPackage.Factory.Entity;
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
public class Rak extends Entity {
    
    private int idRak;
    private String namaRak;
    private String lokasiRak;
    
    public Rak(){}

    public Rak(int idRak, String namaRak, String lokasiRak) {
        this.idRak = idRak;
        this.namaRak = namaRak;
        this.lokasiRak = lokasiRak;
    }
    
    public Rak(JTable table) {
        this.idRak = Integer.parseInt(table.getValueAt(table.getSelectedRow(), 0).toString());
        this.namaRak = table.getValueAt(table.getSelectedRow(), 1).toString();
        this.lokasiRak = table.getValueAt(table.getSelectedRow(), 2).toString();
    }
    
    public Rak(ResultSet rs) {
        try {
            setFromResultSet(rs);
        } catch (SQLException ex) {
            Logger.getLogger(Petugas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void setFromResultSet(ResultSet rs) throws SQLException {
        try {
            setIdRak(rs.getInt("id_rak"));
            setNamaRak(rs.getString("nama_rak"));
            setLokasiRak(rs.getString("lokasi_rak"));
        } catch (SQLException e) {
            Logger.getLogger(Petugas.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Override
    public String listColumn() {
        return "nama_rak, lokasi_rak";
    }

    @Override
    public String toStringInsert() {
        return "'" + namaRak + "',"
                + "'" + lokasiRak + "'";
    }

    @Override
    public String toStringUpdate() {
        return "nama_rak = '" + namaRak +"',"
                + "lokasi_rak = '" + lokasiRak +"'";
    }

    @Override
    public String getPrimaryKey() {
        return ""+idRak;
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
     * @return the namaRak
     */
    public String getNamaRak() {
        return namaRak;
    }

    /**
     * @param namaRak the namaRak to set
     */
    public void setNamaRak(String namaRak) {
        this.namaRak = namaRak;
    }

    /**
     * @return the lokasiRak
     */
    public String getLokasiRak() {
        return lokasiRak;
    }

    /**
     * @param lokasiRak the lokasiRak to set
     */
    public void setLokasiRak(String lokasiRak) {
        this.lokasiRak = lokasiRak;
    }

    @Override
    public String toString() {
        return idRak +" - "+ namaRak;
    }
    
}
