package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entities.Padecimiento;

public interface IPadecimientoDao {

	public void insert(Padecimiento p);

	public List<Padecimiento> list();

}
