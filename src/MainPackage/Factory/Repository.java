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

/**
 *
 * @author praset
 * @param <T>
 */
public abstract class Repository <T extends Entity> {
    Connection conn;
    Statement stm;
    Config config;
    
    public abstract String tableName();
    
    public abstract T toEntity(ResultSet result);
    
    public abstract String primaryKey();
    
    public Repository() {
        initComponent();
    }
    
    private void initComponent() {
        try {
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
            result = stm.executeQuery("select * from "+tableName());
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
            result = stm.executeQuery("select * from "+tableName()+" WHERE "+primaryKey()+" = '" + id + "'");
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
}
