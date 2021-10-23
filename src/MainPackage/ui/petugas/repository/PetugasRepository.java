/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackage.ui.petugas.repository;

import MainPackage.Factory.Repository;
import MainPackage.ui.petugas.entity.Petugas;
import java.sql.ResultSet;

/**
 *
 * @author praset
 */
public class PetugasRepository extends Repository<Petugas>{

    @Override
    public String tableName() {
        return "petugas";
    }

    @Override
    public Petugas toEntity(ResultSet result) {
        return new Petugas(result);
    }

    @Override
    public String primaryKey() {
        return "id_petugas";
    }
    
}
