/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DAOInterface.IDAOMahasiswa; 
import Helper.KoneksiDB; 
import Model.Mahasiswa; 
import java.sql.Connection; 
import java.sql.PreparedStatement;
import java.sql.ResultSet; 
import java.sql.SQLException;
import java.sql.Statement; 
import java.util.ArrayList; 
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;    

/**
 *
 * @author aliif
 */
public class DAOMahasiswa implements IDAOMahasiswa{ 
	Connection con;
	String strRead = "SELECT * FROM mahasiswa; ";
        String strInsert = "INSERT INTO mahasiswa(nim, nama, kelas, prodi) VALUES(?,?,?,?);"; 
        String strUpdate = "UPDATE mahasiswa SET nama=?, kelas=?, prodi=? WHERE nim=?;";
        String strDelete = "DELETE FROM mahasiswa WHERE nim=?;";
	
	public DAOMahasiswa (){
		con = KoneksiDB.getConection();
	}

	@Override
	public List<Mahasiswa> getAll() { 
		List <Mahasiswa> firstMhs = null; 
		try {
			firstMhs = new ArrayList <Mahasiswa>(); 
			Statement st = con.createStatement(); 
			ResultSet rs = st.executeQuery(strRead); 
			while(rs.next()){
				Mahasiswa mhs = new Mahasiswa(); 
				mhs.setNim(rs.getString("nim"));
				mhs.setNama (rs.getString("nama")); 
				mhs.setKelas (rs.getString("kelas")); 
				mhs.setProdi (rs.getString("prodi")); 
				firstMhs.add(mhs);
			}
		} catch (SQLException e) {
			System.out.println("Masalah : "+e);
		}
		return firstMhs;
	}
        
        @Override
        public void insert (Mahasiswa b) { 
            PreparedStatement statement = null;
            try {
		statement = con.prepareStatement(strInsert);
		statement.setString(1, b.getNim());
		statement.setString(2, b.getNama());
		statement.setString(3, b.getKelas());
		statement.setString(4, b.getProdi()); 
		statement.execute();
            } catch (Exception e) {
		System.out.println("Gagal insert!");
            } finally {
		try {
                    statement.close();
		} catch (SQLException ex) {
                    System.out.println("Gagal insert!");
            	}
            }
        }
        
        @Override
        public void update (Mahasiswa b) { 
            PreparedStatement statement = null;
            try {
		statement = con.prepareStatement(strUpdate);
		statement.setString(1, b.getNim());
		statement.setString(2, b.getNama());
		statement.setString(3, b.getKelas());
		statement.setString(4, b.getProdi()); 
		statement.execute();
            } catch (Exception e) {
		System.out.println("Gagal update!");
            } finally {
		try {
                    statement.close();
		} catch (SQLException ex) {
                    System.out.println("Gagal update!");
            	}
            }
        }
        
        @Override
        public void delete (String nim) { 
            PreparedStatement statement = null;
            try {
		statement = con.prepareStatement(strDelete);
		statement.setString(1, nim);
		statement.execute();
            } catch (Exception e) {
		System.out.println("Gagal delete!");
            } finally {
		try {
                    statement.close();
		} catch (SQLException ex) {
                    System.out.println("Gagal delete!");
            	}
            }
        }
}