package ELDAR.demo.Domain.Card;

import java.time.LocalDateTime;

public class AMEX extends Card {

    public AMEX() {
        this.brand = "AMEX";
    }

    public Float interestRate() {
        return ((float) LocalDateTime.now().getMonthValue()) * (1 / 10);
    }

}
