package by.bsuir.dao;

import by.bsuir.model.BonusCard;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class BonusCardDAO {
    @PersistenceContext
    private EntityManager entityManager;

    public BonusCard findById(Long cardId) {
        return entityManager.find(BonusCard.class, cardId);
    }

    public void update(BonusCard bonusCard) {
        entityManager.merge(bonusCard);
    }
}