package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entities.Padecimiento;

public interface IPadecimientoService {

	public void insert(Padecimiento p);
	public List<Padecimiento> list();
	
}
