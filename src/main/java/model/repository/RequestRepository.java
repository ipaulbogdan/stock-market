package model.repository;

import lombok.AllArgsConstructor;
import model.entity.Request;

import javax.persistence.EntityManager;
import java.util.List;

@AllArgsConstructor
public class RequestRepository {

    private EntityManager entityManager;

    private final static String FIND_BY_PUBLIC_ID_QUERY = "SELECT request FROM Request request WHERE request.publicIdentifier LIKE :publicId";
    private final static String DELETE_QUERY = "DELETE FROM Request WHERE publicIdentifier LIKE :publicId";
    private final static String FIND_ALL_QUERY = "SELECT r FROM Request r";

    public Request findByPublicId(String publicId) {
        verifyTransaction();

        return (Request)entityManager.createQuery(FIND_BY_PUBLIC_ID_QUERY).setParameter("publicId", publicId).getSingleResult();
    }

    public List<Request> findAll() {
        return (List<Request>) entityManager.createQuery(FIND_ALL_QUERY).getResultList();
    }

    public void save(Request request) {
        verifyTransaction();

        entityManager.persist(request);
        entityManager.getTransaction().commit();
    }

    public void delete(String publicId) {
        verifyTransaction();

        entityManager.createQuery(DELETE_QUERY).setParameter("publicId", publicId).executeUpdate();
        entityManager.getTransaction().commit();
    }


    private void verifyTransaction() {
        if(!entityManager.getTransaction().isActive()) {
            entityManager.getTransaction().begin();
        }
    }

}
