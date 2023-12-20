/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helper;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
/**
 *
 * @author aliif
 */
public class KoneksiDB {
    static Connection con;
    
    public static Connection getConection(){
        if (con == null) {
            MysqlDataSource data = new MysqlDataSource();
            data.setUser("root");
            data.setDatabaseName("akademikdb");
            data.setPassword(""); 
            try {
                con = data.getConnection();
                System.out.println("koneksi berhasil");
            } catch (SQLException e) {
                System.out.println("gagal kokensi");
            }
        } return con;
    }
}
