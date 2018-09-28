package controller;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Curso;

public class CursoJpaDAO {
	
	private static CursoJpaDAO instance;
	protected EntityManager entityManager;
	    
	public static CursoJpaDAO getInstance(){
		if (instance == null){
			instance = new CursoJpaDAO();
		}
		return instance;
	    }

	private CursoJpaDAO() {
		entityManager = getEntityManager();
	}

	private EntityManager getEntityManager() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("crudHibernatePU");
		if (entityManager == null) {
			entityManager = factory.createEntityManager();
        }
        return entityManager;
	}
	
	public Curso getById(final int idCurso) {
		return entityManager.find(Curso.class, idCurso);
		
	}
	
	@SuppressWarnings("unchecked")
	public List<Curso> findAll(){
		return entityManager.createQuery("FROM" + Curso.class.getName()).getResultList();
	}
	
	public void persist(Curso curso) {
		try {
			entityManager.getTransaction().begin();
			entityManager.persist(curso);
			entityManager.getTransaction().commit();
		}
		catch(Exception ex) {
			ex.printStackTrace();
			entityManager.getTransaction().rollback();
		}
	}
	
	public void merge(Curso curso) {
		try {
			entityManager.getTransaction().begin();
			entityManager.merge(curso);
			entityManager.getTransaction().commit();
		}
		catch(Exception ex) {
			ex.printStackTrace();
			entityManager.getTransaction().rollback();
		}
	}
	
	public void remove(Curso curso) {
		try {
			entityManager.getTransaction().begin();
			curso = entityManager.find(Curso.class, getById());
			entityManager.remove(curso);
			entityManager.getTransaction().commit();
		}catch(Exception ex) {
			ex.printStackTrace();
			entityManager.getTransaction().rollback();
		}
	}
	
	public void removeById(final int idCurso) {
		try {
			Curso curso = getById(idCurso);
			remove(curso);
		}catch(Exception ex) {
			ex.printStackTrace();
			entityManager.getTransaction().rollback();
		}
	}
}
