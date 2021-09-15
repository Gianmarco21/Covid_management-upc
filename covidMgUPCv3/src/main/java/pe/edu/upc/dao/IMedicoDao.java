package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entities.Medico;

public interface IMedicoDao {
	
	public void insert(Medico m);
	public List<Medico> list();

}
