package controller;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Turma;

public class TurmaJpaDAO {

    private static TurmaJpaDAO instance;
    protected EntityManager entityManager;
    
    public static TurmaJpaDAO getInstance(){
              if (instance == null){
                       instance = new TurmaJpaDAO();
              }
              
              return instance;
    }

    private TurmaJpaDAO() {
              entityManager = getEntityManager();
    }

    private EntityManager getEntityManager() {
              EntityManagerFactory factory = Persistence.createEntityManagerFactory("crudHibernatePU");
              if (entityManager == null) {
                       entityManager = factory.createEntityManager();
              }

              return entityManager;
    }

    public Turma getById(final int idTurma) {
              return entityManager.find(Turma.class, idTurma);
    }

    @SuppressWarnings("unchecked")
    public List<Turma> findAll() {
              return entityManager.createQuery("FROM " + Turma.class.getName()).getResultList();
    }

    public void persist(Turma turma) {
              try {
                       entityManager.getTransaction().begin();
                       entityManager.persist(turma);
                       entityManager.getTransaction().commit();
              } catch (Exception ex) {
                       ex.printStackTrace();
                       entityManager.getTransaction().rollback();
              }
    }

    public void merge(Turma turma) {
              try {
                       entityManager.getTransaction().begin();
                       entityManager.merge(turma);
                       entityManager.getTransaction().commit();
              } catch (Exception ex) {
                       ex.printStackTrace();
                       entityManager.getTransaction().rollback();
              }
    }

    public void remove(Turma turma) {
              try {
                       entityManager.getTransaction().begin();
                       turma = entityManager.find(Turma.class, turma.getIdTurma());
                       entityManager.remove(turma);
                       entityManager.getTransaction().commit();
              } catch (Exception ex) {
                       ex.printStackTrace();
                       entityManager.getTransaction().rollback();
              }
    }

    public void removeById(final int id) {
              try {
                       Turma turma= getById(id);
                       remove(turma);
              } catch (Exception ex) {
                       ex.printStackTrace();
                       entityManager.getTransaction().rollback();
              }
    }
}
