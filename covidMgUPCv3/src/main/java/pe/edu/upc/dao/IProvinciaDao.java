package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entities.Provincia;

public interface IProvinciaDao {
	
	public void insert(Provincia pr);
	public List<Provincia> list();
	

}
