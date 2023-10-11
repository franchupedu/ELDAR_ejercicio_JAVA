package ELDAR.demo.Services;

import ELDAR.demo.Domain.Card.AMEX;
import ELDAR.demo.Domain.Card.Card;
import ELDAR.demo.Domain.Card.NARA;
import ELDAR.demo.Domain.Card.VISA;
import org.springframework.stereotype.Service;

@Service
public class CardService {

    public Card returnCard(String cardName) {
        switch (cardName) {
            case "VISA": return new VISA();
            case "NARA": return new NARA();
            case "AMEX": return new AMEX();
            default: return null;
        }
    }

}
