/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackage.ui.pengembalian.repository;

import MainPackage.Factory.Repository;
import MainPackage.ui.anggota.repository.AnggotaRepository;
import MainPackage.ui.buku.repository.BukuRepository;
import MainPackage.ui.pengembalian.entity.Pengembalian;
import MainPackage.ui.petugas.repository.PetugasRepository;
import java.sql.ResultSet;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author praset
 */
public class PengembalianRepository extends Repository<Pengembalian>{

    @Override
    public String tableName() {
        return "pengembalian";
    }

    @Override
    public Pengembalian toEntity(ResultSet result) {
        return new Pengembalian(result);
    }

    @Override
    public String primaryKey() {
        return "id_pengembalian";
    }

    @Override
    public List<Repository> relation() {
        return Arrays.asList(
                new BukuRepository(), 
                new AnggotaRepository(), 
                new PetugasRepository()
        );
    }
    
}
