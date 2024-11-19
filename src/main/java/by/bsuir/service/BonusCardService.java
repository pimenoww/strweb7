package by.bsuir.service;

import by.bsuir.dao.BonusCardDAO;
import by.bsuir.model.BonusCard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BonusCardService {
    @Autowired
    private BonusCardDAO bonusCardDAO;

    public BonusCard findById(Long cardId) {
        // Поиск карты по ID.
        return bonusCardDAO.findById(cardId);
    }

    public void creditPoints(Long cardId, double amount) {
        // Начисление бонусных баллов.
        BonusCard card = bonusCardDAO.findById(cardId);
        card.setPoints(card.getPoints() + amount);
        bonusCardDAO.update(card);
    }

    public void debitPoints(Long cardId, double amount) {
        // Снятие баллов, если достаточно средств.
        BonusCard card = bonusCardDAO.findById(cardId);
        if (card.getPoints() >= amount) {
            card.setPoints(card.getPoints() - amount);
            bonusCardDAO.update(card);
        } else {
            throw new RuntimeException("Not enough points");
        }
    }
}