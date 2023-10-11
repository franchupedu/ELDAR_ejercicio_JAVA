package ELDAR.demo.Domain.Card;

import java.time.LocalDateTime;

public class NARA extends Card {

    public NARA() {
        this.brand = "NARA";
    }

    public Float interestRate() {
        return ((float) LocalDateTime.now().getDayOfMonth()) * (1 / 2);
    }

}
