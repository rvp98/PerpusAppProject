/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackage.ui.anggota.entity;

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
public class Anggota extends Entity {
    
    private int idAnggota;
    private String kodeAnggota;
    private String namaAnggota;
    private String jkAnggota;
    private String noTelpAnggota;
    private String alamatAnggota;
    
    public Anggota() {}

    public Anggota(int idAnggota, String kodeAnggota, String namaAnggota, String jkAnggota, String noTelpAnggota, String alamatAnggota) {
        this.idAnggota = idAnggota;
        this.kodeAnggota = kodeAnggota;
        this.namaAnggota = namaAnggota;
        this.jkAnggota = jkAnggota;
        this.noTelpAnggota = noTelpAnggota;
        this.alamatAnggota = alamatAnggota;
    }
    
    public Anggota(JTable table) {
        this.idAnggota = Integer.parseInt(table.getValueAt(table.getSelectedRow(), 0).toString());
        this.kodeAnggota = table.getValueAt(table.getSelectedRow(), 1).toString();
        this.namaAnggota = table.getValueAt(table.getSelectedRow(), 2).toString();
        this.jkAnggota = table.getValueAt(table.getSelectedRow(), 3).toString();
        this.noTelpAnggota = table.getValueAt(table.getSelectedRow(), 4).toString();
        this.alamatAnggota = table.getValueAt(table.getSelectedRow(), 5).toString();
    }
    
    public Anggota(ResultSet rs) {
        try {
            setFromResultSet(rs);
        } catch (SQLException ex) {
            Logger.getLogger(Anggota.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void setFromResultSet(ResultSet rs) throws SQLException {
        try {
            setIdAnggota(rs.getInt("id_anggota"));
            setKodeAnggota(rs.getString("kode_anggota"));
            setNamaAnggota(rs.getString("nama_anggota"));
            setJkAnggota(rs.getString("jk_anggota"));
            setNoTelpAnggota(rs.getString("no_telp_anggota"));
            setAlamatAnggota(rs.getString("alamat_anggota"));
        } catch (SQLException e) {
            Logger.getLogger(Anggota.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Override
    public String listColumn() {
        return "kode_anggota, nama_anggota, jk_anggota, no_telp_anggota, alamat_anggota";
    }

    @Override
    public String toStringInsert() {
        return "'" + getKodeAnggota() + "',"
                + "'" + getNamaAnggota() + "',"
                + "'" + getJkAnggota() + "',"
                + "'" + getNoTelpAnggota() + "',"
                + "'" + getAlamatAnggota() + "'";
    }

    @Override
    public String toStringUpdate() {
        return "kode_anggota = '" + getKodeAnggota() + "',"
                + "nama_anggota = ''" + getNamaAnggota() + "',"
                + "jk_anggota = ''" + getJkAnggota() + "',"
                + "no_telp_anggota = ''" + getNoTelpAnggota() + "',"
                + "alamat_anggota = ''" + getAlamatAnggota() + "'";
    }

    @Override
    public String getPrimaryKey() {
        return ""+getKodeAnggota();
    }

    /**
     * @return the idAnggota
     */
    public int getIdAnggota() {
        return idAnggota;
    }

    /**
     * @param idAnggota the idAnggota to set
     */
    public void setIdAnggota(int idAnggota) {
        this.idAnggota = idAnggota;
    }

    /**
     * @return the kodeAnggota
     */
    public String getKodeAnggota() {
        return kodeAnggota;
    }

    /**
     * @param kodeAnggota the kodeAnggota to set
     */
    public void setKodeAnggota(String kodeAnggota) {
        this.kodeAnggota = kodeAnggota;
    }

    /**
     * @return the namaAnggota
     */
    public String getNamaAnggota() {
        return namaAnggota;
    }

    /**
     * @param namaAnggota the namaAnggota to set
     */
    public void setNamaAnggota(String namaAnggota) {
        this.namaAnggota = namaAnggota;
    }

    /**
     * @return the jkAnggota
     */
    public String getJkAnggota() {
        return jkAnggota;
    }

    /**
     * @param jkAnggota the jkAnggota to set
     */
    public void setJkAnggota(String jkAnggota) {
        this.jkAnggota = jkAnggota;
    }

    /**
     * @return the noTelpAnggota
     */
    public String getNoTelpAnggota() {
        return noTelpAnggota;
    }

    /**
     * @param noTelpAnggota the noTelpAnggota to set
     */
    public void setNoTelpAnggota(String noTelpAnggota) {
        this.noTelpAnggota = noTelpAnggota;
    }

    /**
     * @return the alamatAnggota
     */
    public String getAlamatAnggota() {
        return alamatAnggota;
    }

    /**
     * @param alamatAnggota the alamatAnggota to set
     */
    public void setAlamatAnggota(String alamatAnggota) {
        this.alamatAnggota = alamatAnggota;
    }
    
}
