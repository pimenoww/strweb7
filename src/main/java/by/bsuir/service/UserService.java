package by.bsuir.service;

import by.bsuir.dao.UserDAO;
import by.bsuir.model.BonusCard;
import by.bsuir.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserDAO userDAO; // DAO для работы с таблицей пользователей.

    public void register(User user) {
        // Регистрация нового пользователя с созданием бонусной карты.
        BonusCard bonusCard = new BonusCard();
        bonusCard.setPoints(0); // Начальные баллы.
        user.setBonusCard(bonusCard);
        userDAO.save(user); // Сохраняем пользователя и его карту.
    }

    public User login(String login, String password) {
        // Проверка логина и пароля.
        User user = userDAO.findByLogin(login);
        if (user != null && user.getPassword().equals(password)) {
            return user;
        }
        throw new RuntimeException("Invalid login or password");
    }
}