/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackage.ui.petugas.entity;

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
public class Petugas extends Entity {
    
    private int idPetugas;
    private String namaPetugas;
    private String jabatanPetugas;
    private String noTelpPetugas;
    private String alamatPetugas;

    public Petugas() {}
    
    public Petugas(int idPetugas, String namaPetugas, String jabatanPetugas, String noTelpPetugas, String alamatPetugas) {
        this.idPetugas = idPetugas;
        this.namaPetugas = namaPetugas;
        this.jabatanPetugas = jabatanPetugas;
        this.noTelpPetugas = noTelpPetugas;
        this.alamatPetugas = alamatPetugas;
    }

    public Petugas(JTable table) {
        this.idPetugas = Integer.parseInt(table.getValueAt(table.getSelectedRow(), 0).toString());
        this.namaPetugas = table.getValueAt(table.getSelectedRow(), 1).toString();
        this.jabatanPetugas = table.getValueAt(table.getSelectedRow(), 2).toString();
        this.noTelpPetugas = table.getValueAt(table.getSelectedRow(), 3).toString();
        this.alamatPetugas = table.getValueAt(table.getSelectedRow(), 4).toString();
    }
    
    public Petugas(ResultSet rs) {
        try {
            setFromResultSet(rs);
        } catch (SQLException ex) {
            Logger.getLogger(Petugas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void setFromResultSet(ResultSet rs) throws SQLException {
        try {
            setIdPetugas(rs.getInt("id_petugas"));
            setNamaPetugas(rs.getString("nama_petugas"));
            setJabatanPetugas(rs.getString("jabatan_petugas"));
            setNoTelpPetugas(rs.getString("no_telp_petugas"));
            setAlamatPetugas(rs.getString("alamat_petugas"));
        } catch (SQLException e) {
            Logger.getLogger(Petugas.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Override
    public String listColumn() {
        return "nama_petugas, jabatan_petugas, no_telp_petugas, alamat_petugas";
    }

    @Override
    public String toStringInsert() {
        return "'" + getNamaPetugas() + "'"
                + "'" + getJabatanPetugas() + "'"
                + "'" + getNoTelpPetugas() + "'"
                + "'" + getAlamatPetugas() + "'";
    }

    @Override
    public String toStringUpdate() {
        return "nama_petugas = '" + getNamaPetugas() + "'"
                + "jabatan_petugas = '" + getJabatanPetugas() + "'"
                + "no_telp_petugas = '" + getNoTelpPetugas() + "'"
                + "alamat_petugas = '" + getAlamatPetugas() + "'";
    }

    @Override
    public String getPrimaryKey() {
        return ""+getIdPetugas();
    }

    /**
     * @return the idPetugas
     */
    public int getIdPetugas() {
        return idPetugas;
    }

    /**
     * @param idPetugas the idPetugas to set
     */
    public void setIdPetugas(int idPetugas) {
        this.idPetugas = idPetugas;
    }

    /**
     * @return the namaPetugas
     */
    public String getNamaPetugas() {
        return namaPetugas;
    }

    /**
     * @param namaPetugas the namaPetugas to set
     */
    public void setNamaPetugas(String namaPetugas) {
        this.namaPetugas = namaPetugas;
    }

    /**
     * @return the jabatanPetugas
     */
    public String getJabatanPetugas() {
        return jabatanPetugas;
    }

    /**
     * @param jabatanPetugas the jabatanPetugas to set
     */
    public void setJabatanPetugas(String jabatanPetugas) {
        this.jabatanPetugas = jabatanPetugas;
    }

    /**
     * @return the noTelpPetugas
     */
    public String getNoTelpPetugas() {
        return noTelpPetugas;
    }

    /**
     * @param noTelpPetugas the noTelpPetugas to set
     */
    public void setNoTelpPetugas(String noTelpPetugas) {
        this.noTelpPetugas = noTelpPetugas;
    }

    /**
     * @return the alamatPetugas
     */
    public String getAlamatPetugas() {
        return alamatPetugas;
    }

    /**
     * @param alamatPetugas the alamatPetugas to set
     */
    public void setAlamatPetugas(String alamatPetugas) {
        this.alamatPetugas = alamatPetugas;
    }
    
}
