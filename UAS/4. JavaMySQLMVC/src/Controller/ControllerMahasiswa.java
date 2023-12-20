package Controller;

import DAO.DAOMahasiswa;
import DAOInterface.IDAOMahasiswa; 
import Model.Mahasiswa;
import Model.TabelModelMahasiswa; 
import View.FormMhs;
import java.util.List;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aliif
 */
public class ControllerMahasiswa {
    	FormMhs frmMahasiswa;
	IDAOMahasiswa iMahasiswa;
	List <Mahasiswa> firstMahasiswa;

	public ControllerMahasiswa (FormMhs frmMahasiswa){
		this.frmMahasiswa = frmMahasiswa;
		iMahasiswa = new DAOMahasiswa ();
	}

	public void isiTabel(){
		firstMahasiswa = iMahasiswa.getAll();
                TabelModelMahasiswa tableMhs;
                tableMhs = new TabelModelMahasiswa(firstMahasiswa);
		frmMahasiswa.getTableData().setModel(tableMhs);
	}
        
        public void insert(){
            Mahasiswa b = new Mahasiswa();
            b.setNim(frmMahasiswa.gettxtNim().getText());
            b.setNama (frmMahasiswa.gettxtNama().getText()); 
            b.setKelas (frmMahasiswa.gettxtKelas().getText()); 
            b.setProdi (frmMahasiswa.gettxtProdi().getText());
            iMahasiswa.insert(b);
        }

        public void reset(){
            frmMahasiswa.gettxtNim().setText("");
            frmMahasiswa.gettxtNama().setText("");
            frmMahasiswa.gettxtKelas().setText("");
            frmMahasiswa.gettxtProdi().setText("");
        }

        public void isiField(int row) {
            frmMahasiswa.gettxtNim().setText(firstMahasiswa.get(row).getNim().toString()); 	
            frmMahasiswa.gettxtNama().setText(firstMahasiswa.get(row).getNama().toString());
            frmMahasiswa.gettxtKelas().setText(firstMahasiswa.get(row).getKelas ().toString());
            frmMahasiswa.gettxtProdi().setText(firstMahasiswa.get(row).getProdi().toString());
        }

        public void update(){
            Mahasiswa b = new Mahasiswa();
            b.setNama (frmMahasiswa.gettxtNama().getText());
            b.setKelas (frmMahasiswa.gettxtKelas ().getText()); 
            b.setProdi (frmMahasiswa.gettxtProdi().getText());
            b.setNim(frmMahasiswa.gettxtNim().getText()); 
            iMahasiswa.update(b);
        }

        public void delete(){
            Mahasiswa b = new Mahasiswa();
            b.setNim(frmMahasiswa.gettxtNim().getText());
            iMahasiswa.delete(frmMahasiswa.gettxtNim().getText());
        }
}
