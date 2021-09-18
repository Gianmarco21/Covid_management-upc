package pe.edu.upc.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IPadecimientoDao;
import pe.edu.upc.entities.Padecimiento;

public class PadecimientoDaoImp implements IPadecimientoDao {

	@PersistenceContext(unitName = "covidMgUPCv3")
	private EntityManager em;

	@Override
	@Transactional
	public void insert(Padecimiento p) {

		try {

			em.persist(p);

		} catch (Exception e) {

			System.out.println("Error al insertar");
		}

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Padecimiento> list() {

		List<Padecimiento> lista = new ArrayList<Padecimiento>();

		try {

			Query q = em.createQuery("select v from Padecimiento v");
			lista = (List<Padecimiento>) q.getResultList();

		} catch (Exception e) {
			System.out.println("Error al listar");
		}

		return lista;
	}

}
