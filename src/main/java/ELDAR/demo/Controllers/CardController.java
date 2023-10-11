package ELDAR.demo.Controllers;

import ELDAR.demo.Domain.Card.Card;
import ELDAR.demo.Domain.DTOs.CardDTO;
import ELDAR.demo.Domain.DTOs.InformationRequestDTO;
import ELDAR.demo.Services.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/card")
public class CardController {

    @Autowired
    CardService cardService;

    @PostMapping(value="/information", consumes = "application/json", produces = "application/json")
    public CardDTO consultInformation(@RequestBody InformationRequestDTO informationRequestDTO) {
        Card card = cardService.returnCard(informationRequestDTO.brand);
        return new CardDTO(card.interestRate(), card.getBrand(), informationRequestDTO.amount);
    }

}
