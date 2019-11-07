package model.entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PersistenceManager {

    private static EntityManagerFactory emf;

    private PersistenceManager() {
    }

    public static EntityManager getEntityManager() {
        if(emf == null) {
            emf = Persistence.createEntityManagerFactory("userPersistenceUnit");
        }
        return emf.createEntityManager();
    }

    public void close() {
        emf.close();
    }

}
