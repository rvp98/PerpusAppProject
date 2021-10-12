/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author FERDI
 */
public class Config {
    public Connection con;
    Statement stm;
    PreparedStatement pst;
    
    public void config() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String dbUrl = "jdbc:mysql://localhost/perpustakaan";
            String username = "root";
            String password = "";
            con = DriverManager.getConnection(dbUrl, username, password);
            stm = con.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Koneksi Gagal" + e.getMessage());
        }
    }
}
