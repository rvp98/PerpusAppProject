/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackage.ui.buku.repository;

import MainPackage.Factory.Repository;
import MainPackage.ui.anggota.repository.AnggotaRepository;
import MainPackage.ui.buku.entity.Buku;
import MainPackage.ui.kategori.repository.KategoriRepository;
import MainPackage.ui.petugas.repository.PetugasRepository;
import MainPackage.ui.rak.repository.RakRepository;
import java.sql.ResultSet;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author praset
 */
public class BukuRepository extends Repository<Buku> {

    @Override
    public String tableName() {
        return "buku";
    }

    @Override
    public Buku toEntity(ResultSet result) {
        return new Buku(result);
    }

    @Override
    public String primaryKey() {
        return "kode_buku";
    }
    
    @Override
    public List<Repository> relation() {
        return Arrays.asList(
            new KategoriRepository(),
            new RakRepository()
        );
    }
}
