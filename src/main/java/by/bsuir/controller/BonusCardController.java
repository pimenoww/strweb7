package by.bsuir.controller;

import by.bsuir.model.BonusCard;
import by.bsuir.service.BonusCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/cards")
public class BonusCardController {
    @Autowired
    private BonusCardService bonusCardService;

    @GetMapping("/{cardId}")
    public String viewCard(@PathVariable Long cardId, Model model) {
        BonusCard card = bonusCardService.findById(cardId);
        model.addAttribute("card", card);
        return "card";
    }

    @PostMapping("/{cardId}/credit")
    public String creditPoints(@PathVariable Long cardId, @RequestParam double amount) {
        bonusCardService.creditPoints(cardId, amount);
        return "redirect:/cards/" + cardId;
    }

    @PostMapping("/{cardId}/debit")
    public String debitPoints(@PathVariable Long cardId, @RequestParam double amount) {
        bonusCardService.debitPoints(cardId, amount);
        return "redirect:/cards/" + cardId;
    }
}
