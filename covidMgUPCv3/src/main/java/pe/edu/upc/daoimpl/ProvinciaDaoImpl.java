package pe.edu.upc.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IProvinciaDao;
import pe.edu.upc.entities.Provincia;

public class ProvinciaDaoImpl implements IProvinciaDao {

	@PersistenceContext(unitName = "covidMgUPCv3")
	private EntityManager em;

	@Override
	@Transactional
	public void insert(Provincia pr) {

		try {

			em.persist(pr);

		} catch (Exception e) {
			System.out.println("Error al insertar");
		}

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Provincia> list() {

		List<Provincia> lista = new ArrayList<Provincia>();

		try {

			javax.persistence.Query q = em.createQuery("select v from Provincia v");

			lista = (List<Provincia>) q.getResultList();

		} catch (Exception e) {
			System.out.println("Error al listar");
		}
		return lista;
	}

}
