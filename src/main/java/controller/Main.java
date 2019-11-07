package controller;


import model.entity.PersistenceManager;
import model.entity.Request;
import model.entity.Stock;
import model.repository.RequestRepository;
import model.repository.StockRepository;

import javax.persistence.EntityManager;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        EntityManager em = PersistenceManager.getEntityManager();

        StockRepository stockRepository = new StockRepository(em);
        RequestRepository requestRepository = new RequestRepository(em);

        List<Request> requests =  requestRepository.findAll();

        System.out.println(requests);
        em.close();

    }


}
