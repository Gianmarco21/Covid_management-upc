package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IMedicoDao;
import pe.edu.upc.entities.Medico;
import pe.edu.upc.service.IMedicoService;

@Named
@RequestScoped
public class MedicoServiceImpl implements IMedicoService {

	@Inject
	private IMedicoDao mDao;

	public void insert(Medico m) {
		// TODO Auto-generated method stub

		mDao.insert(m);
	}

	public List<Medico> list() {
		// TODO Auto-generated method stub
		return mDao.list();
	}

}
