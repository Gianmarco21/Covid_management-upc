package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IPadecimientoDao;
import pe.edu.upc.entities.Padecimiento;
import pe.edu.upc.service.IPadecimientoService;

@Named
@RequestScoped
public class PadecimientoServiceImpl implements IPadecimientoService{

	@Inject
	private IPadecimientoDao pDao;
	
	
	@Override
	public void insert(Padecimiento p) {
	pDao.insert(p);
		
	}

	@Override
	public List<Padecimiento> list() {
		// TODO Auto-generated method stub
		return pDao.list();
	}

	
	
}
