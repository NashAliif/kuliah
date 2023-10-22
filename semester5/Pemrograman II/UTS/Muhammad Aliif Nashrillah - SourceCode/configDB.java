/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author aliif
 */
public class configDB {
    private static Connection mysqlConfig;
    
    public static Connection koneksi(){
          try{
            String url = "jdbc:mysql://localhost:3306/akademikdb?user=root";
            String StringDriver="com.mysql.jdbc.Driver";
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            mysqlConfig = DriverManager.getConnection(url);
        } catch (Exception e) {
            System.err.println("Koneksi gagal"+e.getMessage());
        }
          return mysqlConfig;
    }
}
