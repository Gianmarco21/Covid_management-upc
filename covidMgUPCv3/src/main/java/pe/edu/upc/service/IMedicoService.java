package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entities.Medico;

public interface IMedicoService {

	public void insert(Medico m);

	public List<Medico> list();

}
