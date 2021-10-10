/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author FERDI
 */
public class Config {
    private static Connection mysqlConfig;
    public static Connection configDB()throws SQLException {
        try {
            String url = "jdbc:mysql://localhost:3306/mahasiswa_sakti";
            String user = "root";
            String password = "";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            mysqlConfig = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            System.err.println("Koneksi gagal" + e.getMessage());
        }
        return mysqlConfig;
    }
}
