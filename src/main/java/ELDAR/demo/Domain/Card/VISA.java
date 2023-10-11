package ELDAR.demo.Domain.Card;

import java.time.LocalDateTime;

public class VISA extends Card {

    public VISA() {
        this.brand = "VISA";
    }

    public Float interestRate() {
        return (((float) LocalDateTime.now().getYear()) - 2000) / LocalDateTime.now().getMonthValue();
    }

}
