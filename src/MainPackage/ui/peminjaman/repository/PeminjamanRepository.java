/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackage.ui.peminjaman.repository;

import MainPackage.Factory.Repository;
import MainPackage.ui.anggota.repository.AnggotaRepository;
import MainPackage.ui.buku.repository.BukuRepository;
import MainPackage.ui.peminjaman.entity.Peminjaman;
import MainPackage.ui.petugas.repository.PetugasRepository;
import java.sql.ResultSet;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author praset
 */
public class PeminjamanRepository extends Repository<Peminjaman>{

    @Override
    public String tableName() {
        return "peminjaman";
    }

    @Override
    public Peminjaman toEntity(ResultSet result) {
        return new Peminjaman(result);
    }

    @Override
    public String primaryKey() {
        return "id_peminjaman";
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
