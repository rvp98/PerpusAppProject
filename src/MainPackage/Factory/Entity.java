/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackage.Factory;

import java.sql.ResultSet;

/**
 *
 * @author praset
 */
public abstract class Entity {
    
    /**
     * Fungsi ini akan mereturn list column dengan format
     * "namacolumn1, namacolumn2, namacolumn3"
     * Digunakan untuk membantu dalam proses insert
     */
    public abstract String listColumn();
    
    /**
     * Fungsi ini untuk menghasilkan string yang isinya
     * adalah value baru yang akan diinsert
     */
    public abstract String toStringInsert();
    
    /**
     * Fungsi ini untuk menghasilkan string yang isinya adalah
     * value yang akan diedit beserta nama tablenya
     */
    public abstract String toStringUpdate();
    
    /**
     * Fungsi ini untuk mereturn value dari primary key
     */
    public abstract String getPrimaryKey();
}
