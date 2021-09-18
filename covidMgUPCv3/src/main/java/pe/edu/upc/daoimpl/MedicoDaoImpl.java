package pe.edu.upc.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IMedicoDao;
import pe.edu.upc.entities.Medico;

public class MedicoDaoImpl implements IMedicoDao {

	@PersistenceContext(unitName = "covidMgUPCv3")
	private EntityManager em;

	@Transactional
	public void insert(Medico m) {

		try {

			em.persist(m);

		} catch (Exception e) {
			System.out.println("Error al insertar");
		}

	}

	@SuppressWarnings("unchecked")
	public List<Medico> list() {

		List<Medico> lista = new ArrayList<Medico>();

		try {

			Query q = em.createQuery("select v from Medico v");
			lista = (List<Medico>) q.getResultList();

		} catch (Exception e) {
			System.out.println("Error al listar");
		}
		return lista;
	}

}
