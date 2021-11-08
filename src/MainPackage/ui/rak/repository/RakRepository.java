/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackage.ui.rak.repository;

import MainPackage.Factory.Repository;
import MainPackage.ui.rak.entity.Rak;
import java.sql.ResultSet;

/**
 *
 * @author praset
 */
public class RakRepository extends Repository<Rak>{

    @Override
    public String tableName() {
        return "rak";
    }

    @Override
    public Rak toEntity(ResultSet result) {
        return new Rak(result);
    }

    @Override
    public String primaryKey() {
        return "id_rak";
    }
    
}
