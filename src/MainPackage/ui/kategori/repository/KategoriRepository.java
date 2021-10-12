/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackage.ui.kategori.repository;

import MainPackage.Factory.Repository;
import MainPackage.ui.kategori.model.Kategori;
import java.sql.ResultSet;

/**
 *
 * @author praset
 */
public class KategoriRepository extends Repository<Kategori>{

    @Override
    public String tableName() {
        return "kategori";
    }

    @Override
    public Kategori toEntity(ResultSet result) {
        return new Kategori(result);
    }

    @Override
    public String primaryKey() {
        return "id_kategori";
    }
    
}
