package by.bsuir.dao;

import by.bsuir.model.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAO {
    @PersistenceContext
    private EntityManager entityManager;

    public User save(User user) {
        entityManager.persist(user);
        return user;
    }

    public User findByLogin(String login) {
        String query = "SELECT u FROM User u WHERE u.login = :login";
        return entityManager.createQuery(query, User.class)
                .setParameter("login", login)
                .getSingleResult();
    }
}