/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackage.ui.anggota.repository;

import MainPackage.Factory.Repository;
import MainPackage.ui.anggota.entity.Anggota;
import java.sql.ResultSet;

/**
 *
 * @author praset
 */
public class AnggotaRepository extends Repository<Anggota>{

    @Override
    public String tableName() {
        return "anggota";
    }

    @Override
    public Anggota toEntity(ResultSet result) {
        return new Anggota(result);
    }

    @Override
    public String primaryKey() {
        return "id_anggota";
    }
}
