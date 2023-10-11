package ELDAR.demo.Domain.Card;

import java.time.LocalDateTime;

public abstract class Card {

    String brand;

    String cardNumber;

    String cardholder;

    LocalDateTime expirationDate;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardholder() {
        return cardholder;
    }

    public void setCardholder(String cardholder) {
        this.cardholder = cardholder;
    }

    public LocalDateTime getExpirationDate() {
        return expirationDate;
    }

    public String cardInformation() {
        return "Card Number: " + getCardNumber() + "\n" +
                "Card Holder: " + getCardholder() + "\n" +
                "Expiration Date: " + getExpirationDate().toString();
    }

    public void setExpirationDate(LocalDateTime expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Boolean validOperation(Float amount) {
        return amount >= 1000;
    }

    public Boolean validCard() {
        return LocalDateTime.now().isBefore(this.getExpirationDate());
    }

    public abstract Float interestRate();

    public Boolean isDifferentTo(Card card) {
        return !this.getCardNumber().equals(card.getCardNumber());
    }

}
