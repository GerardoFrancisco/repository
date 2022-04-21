package pe.edu.upc.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IEstablecimientoDao;
import pe.edu.upc.entidades.Establecimiento;

public class EstablecimientoImplDao implements IEstablecimientoDao {

	@PersistenceContext(unitName = "SafePlace")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Establecimiento es) {
		try {
			em.persist(es);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Error al insertar persona");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Establecimiento> list() {
		List<Establecimiento> listaEstablecimientos = new ArrayList<Establecimiento>();

		try {
			Query jpql = em.createQuery("from Establecimiento e");
			listaEstablecimientos = (List<Establecimiento>) jpql.getResultList();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Error al listar personas");
		}
		return listaEstablecimientos;
	}

	@Transactional
	@Override
	public void delete(int idEstablecimiento) {
		try {
			Establecimiento es = em.find(Establecimiento.class, idEstablecimiento);
			em.remove(es);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Error al eliminar en el dao");
		}
	}
}
