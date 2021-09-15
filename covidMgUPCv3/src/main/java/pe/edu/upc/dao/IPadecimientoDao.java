package pe.edu.upc.dao;import java.util.List;

import pe.edu.upc.entities.Padecimiento;

public interface IPadecimientoDao {
	
	public void inser (Padecimiento p);
	public List<Padecimiento> list();

}
