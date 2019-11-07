package model.repository;

import lombok.AllArgsConstructor;
import model.entity.User;

import javax.persistence.*;

@AllArgsConstructor
public class UserRepository {

    private EntityManager entityManager;

    private static final String FIND_BY_USERNAME_QUERY = "SELECT u FROM User u WHERE u.username LIKE :username";

    public User getUserByUsername(String username) {
        return (User)entityManager.createQuery(FIND_BY_USERNAME_QUERY).setParameter("username",username).getSingleResult();
    }

}
