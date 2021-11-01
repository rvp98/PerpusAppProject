/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackage.Factory;

import MainPackage.Config;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author praset
 * @param <T>
 */
public abstract class Repository <T extends Entity> {
    Connection conn;
    Statement stm;
    Config config;
    
    /**
     * Fungsi ini akan mereturn string yang berisi nama table
     * @return 
     */
    public abstract String tableName();
    
    /**
     * Fungsi ini akan mereturn sebuah object
     * @param result adalah result yang berasal dari db
     * dan perlu dimapping lagi ke dalam bentuk model
     * @return 
     */
    public abstract T toEntity(ResultSet result);
    
    /**
     * Fungsi ini akan mereturn sebuah string yang berisi primary key
     * @return 
     */
    public abstract String primaryKey();
    
    /**
     * Fungsi ini akan mereturn List yang berisi 
     * entity apa saja yang memiliki relasi dengan entity saat ini
     * @return List of class Entity
     */
    public List<Repository> relation() {
        return new ArrayList();
    };
    
    public Repository() {
        initComponent();
    }
    
    private void initComponent() {
        try {
            config = new Config();
            config.config();
            conn = (Connection) config.con;
            stm = conn.createStatement();
        } catch (SQLException e) {
            System.out.println("error");
            e.printStackTrace();
        }
    }
    
    public boolean insert(T data) {
        boolean isSuccess = false;
        try {
            String sql = "insert into "+ tableName()+"("+data.listColumn()+") values(" + data.toStringInsert() + ")";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            isSuccess = true;
        } catch (SQLException e) {
            System.out.println("error when insert "+tableName());
            e.printStackTrace();
        }
        return isSuccess;
    }
    
    public boolean update(T data, String id) {
        boolean isSuccess = false;
        try {
            int result = stm.executeUpdate("update "+tableName()+" SET " + data.toStringUpdate() + " Where "+primaryKey()+" = '" + id + "'");
            isSuccess = true;
        } catch (SQLException e) {
            System.out.println("error when update "+tableName());
            e.printStackTrace();
        }
        return isSuccess;
    }
    
    public ArrayList<T> get() {
        ResultSet result = null;
        ArrayList<T> list = new ArrayList<>();
        try {
            String query = "select * from "+ tableName() + getRelationQuery();
            result = stm.executeQuery(query);
            while (result.next()) {
                list.add(toEntity(result));
            }
        } catch (SQLException e) {
            System.out.println("error when get all data"+tableName());
            e.printStackTrace();
        }
        return list;
    }

    public T get(String id) {
        ResultSet result = null;
        T entity = null;
        try {
            result = stm.executeQuery("select * from "+tableName()+ getRelationQuery() +" WHERE "+primaryKey()+" = '" + id + "'");
            ArrayList<T> list = new ArrayList<>();
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

    public boolean delete(String id) {
        try {
            String sql = "delete from "+tableName()+" where "+primaryKey()+" ='" + id + "'";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            return true;
        } catch (SQLException e) {
            System.out.println("error when delete "+tableName());
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean isIdExist(String id) {
        boolean isExist = false;
        T data = get(id);
        if(data != null) {
            if(data.getPrimaryKey() != null) {
                isExist = true;
            }
        }
        return isExist;
    }
    
    private String getRelationQuery() {
        String relationQuery = "";
        if (!relation().isEmpty()) {
            for(Repository repo : relation()) {
                relationQuery += " join " + repo.tableName() 
                    + " on " + repo.tableName() + "." + repo.primaryKey() 
                    + " = " 
                    + this.tableName() + "." + repo.primaryKey();
            }
        }
        return relationQuery;
    }
}
