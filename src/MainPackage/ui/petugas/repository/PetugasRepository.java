/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackage.ui.petugas.repository;

import MainPackage.Factory.Repository;
import MainPackage.ui.petugas.entity.Petugas;
import MainPackage.util.HashingHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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
    
    public Petugas login(String username, String password) {
        ResultSet result = null;
        Petugas entity = null;
        System.out.println(HashingHelper.toMd5(password));
        try {
            result = stm.executeQuery("select * from "+tableName()+ getRelationQuery() +" WHERE username = '" + username + "' AND password = '"+ HashingHelper.toMd5(password) +"'");
            ArrayList<Petugas> list = new ArrayList<>();
            while (result.next()) {
                list.add(toEntity(result));
            }
            if(!list.isEmpty()) {
                entity = list.get(0);
            }
        } catch (SQLException e) {
            System.out.println("error when get data "+tableName()+" by id");
            e.printStackTrace();
        }
        return entity;
    }
    
    public Petugas getUsername(String username) {
        ResultSet result = null;
        Petugas entity = null;
        try {
            result = stm.executeQuery("select * from "+tableName()+ getRelationQuery() +" WHERE username = '" + username + "'");
            ArrayList<Petugas> list = new ArrayList<>();
            while (result.next()) {
                list.add(toEntity(result));
            }
            if(!list.isEmpty()) {
                entity = list.get(0);
            }
        } catch (SQLException e) {
            System.out.println("error when get data "+tableName()+" by id");
            e.printStackTrace();
        }
        return entity;
    }
    
    public boolean isUsernameExist(String username) {
        boolean isExist = false;
        Petugas data = getUsername(username);
        if(data != null) {
            if(data.getPrimaryKey() != null) {
                isExist = true;
            }
        }
        return isExist;
    }
}
