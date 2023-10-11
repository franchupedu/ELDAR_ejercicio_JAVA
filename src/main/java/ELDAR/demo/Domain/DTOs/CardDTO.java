package ELDAR.demo.Domain.DTOs;

public class CardDTO {

    Float interestRate;

    String brand;

    Float amount;

    public Float getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Float interestRate) {
        this.interestRate = interestRate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public CardDTO(Float interestRate, String brand, Float amount) {
        this.interestRate = interestRate;
        this.brand = brand;
        this.amount = amount;
    }
}
