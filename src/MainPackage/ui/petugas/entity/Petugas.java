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
    private String jkPetugas;
    private String jabatanPetugas;
    private String noTelpPetugas;
    private String alamatPetugas;
    private String usernamePetugas;
    private String passwordPetugas;

    public Petugas() {}
    
    public Petugas(int idPetugas, String namaPetugas, String jkPetugas, String jabatanPetugas, String noTelpPetugas, String alamatPetugas, String usernamePetugas, String passwordPetugas) {
        this.idPetugas = idPetugas;
        this.namaPetugas = namaPetugas;
        this.jkPetugas = jkPetugas;
        this.jabatanPetugas = jabatanPetugas;
        this.noTelpPetugas = noTelpPetugas;
        this.alamatPetugas = alamatPetugas;
        this.usernamePetugas = usernamePetugas;
        this.passwordPetugas = passwordPetugas;
    }

    public Petugas(JTable table) {
        this.idPetugas = Integer.parseInt(table.getValueAt(table.getSelectedRow(), 0).toString());
        this.namaPetugas = table.getValueAt(table.getSelectedRow(), 1).toString();
        this.jkPetugas = table.getValueAt(table.getSelectedRow(), 2).toString();
        this.jabatanPetugas = table.getValueAt(table.getSelectedRow(), 3).toString();
        this.noTelpPetugas = table.getValueAt(table.getSelectedRow(), 4).toString();
        this.alamatPetugas = table.getValueAt(table.getSelectedRow(), 5).toString();
        this.usernamePetugas = table.getValueAt(table.getSelectedRow(), 6).toString();
        this.passwordPetugas = table.getValueAt(table.getSelectedRow(), 7).toString();
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
            setJkPetugas(rs.getString("jk_petugas"));
            setJabatanPetugas(rs.getString("jabatan_petugas"));
            setNoTelpPetugas(rs.getString("no_telp_petugas"));
            setAlamatPetugas(rs.getString("alamat_petugas"));
            setUsernamePetugas(rs.getString("username"));
            setPasswordPetugas(rs.getString("password"));
        } catch (SQLException e) {
            Logger.getLogger(Petugas.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Override
    public String listColumn() {
        return "nama_petugas, jk_petugas, jabatan_petugas, no_telp_petugas, alamat_petugas, username, password";
    }

    @Override
    public String toStringInsert() {
        return "'" + getNamaPetugas() + "'"
                + "'" + getJkPetugas() + "'"
                + "'" + getJabatanPetugas() + "'"
                + "'" + getNoTelpPetugas() + "'"
                + "'" + getAlamatPetugas() + "'"
                + "'" + getUsernamePetugas() + "'"
                + "'" + getPasswordPetugas() + "'";
    }

    @Override
    public String toStringUpdate() {
        return "nama_petugas = '" + getNamaPetugas() + "'"
                + "jk_petugas = '" + getJkPetugas() + "'"
                + "jabatan_petugas = '" + getJabatanPetugas() + "'"
                + "no_telp_petugas = '" + getNoTelpPetugas() + "'"
                + "alamat_petugas = '" + getAlamatPetugas() + "'"
                + "username = '" + getUsernamePetugas() + "'"
                + "password = '" + getPasswordPetugas() + "'";
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
    
    public String getJkPetugas() {
        return jkPetugas;
    }
    
    public void setJkPetugas(String jkPetugas) {
        this.jkPetugas = jkPetugas;
    }
    
    public String getUsernamePetugas() {
        return usernamePetugas;
    }
    
    public void setUsernamePetugas(String usernamePetugas) {
        this.usernamePetugas = usernamePetugas;
    }
    
    public String getPasswordPetugas() {
        return passwordPetugas;
    }
    
    public void setPasswordPetugas(String passwordPetugas) {
        this.passwordPetugas = passwordPetugas;
    }
}
