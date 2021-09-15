package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IProvinciaDao;
import pe.edu.upc.entities.Provincia;
import pe.edu.upc.service.IProvinciaService;

@Named
@RequestScoped
public class ProvinciaServiceImpl implements IProvinciaService {

	@Inject
	private IProvinciaDao prDao;

	@Override
	public void insert(Provincia pr) {

		prDao.insert(pr);

	}

	@Override
	public List<Provincia> list() {

		return prDao.list();
	}

}
