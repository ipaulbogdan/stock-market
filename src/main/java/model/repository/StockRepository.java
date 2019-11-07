package model.repository;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import model.dto.StockUpdateDto;
import model.entity.Stock;
import org.hibernate.Session;

import javax.persistence.EntityManager;
import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
public class StockRepository {

    private EntityManager entityManager;

    private final static String FIND_BY_PUBLIC_ID_QUERY = "SELECT stock FROM Stock stock WHERE stock.publicIdentifier LIKE :publicId";
    private final static String UPDATE_QUERY = "UPDATE Stock  SET numberOfStocks= :numberOfStocks WHERE publicIdentifier LIKE :publicId";
    private final static String DELETE_QUERY = "DELETE FROM Stock WHERE publicIdentifier LIKE :publicId";
    private final static String FIND_ALL_QUERY = "SELECT s FROM Stock s";


    public Stock findByPublicId(String publicId) {
        return (Stock) entityManager.createQuery(FIND_BY_PUBLIC_ID_QUERY).setParameter("publicId", publicId).getSingleResult();
    }
    public List<Stock> findAll() {
        return (List<Stock>) entityManager.createQuery(FIND_ALL_QUERY).getResultList();
    }

    public void save(Stock stock) {
       verifyTransaction();

        entityManager.persist(stock);
        entityManager.getTransaction().commit();
    }

    public Stock update(String publicId, StockUpdateDto stockUpdateDto) {
        verifyTransaction();

        entityManager.createQuery(UPDATE_QUERY).setParameter("numberOfStocks",stockUpdateDto.getNumberOfStocks()).setParameter("publicId", publicId).executeUpdate();

        entityManager.getTransaction().commit();

        return findByPublicId(publicId);
    }

    public void delete(String publicId) {
        verifyTransaction();

        Stock stock = findByPublicId(publicId);

        entityManager.createQuery(DELETE_QUERY).setParameter("publicId",publicId).executeUpdate();
        entityManager.getTransaction().commit();
    }

    private void verifyTransaction() {
        if(!entityManager.getTransaction().isActive()) {
            entityManager.getTransaction().begin();
        }
    }



}
