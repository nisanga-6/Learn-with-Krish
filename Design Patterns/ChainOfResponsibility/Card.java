package com.Example.ChainOfResponsibility;

public class Card {

    private String number;
    private String type;
    private int expiryMonth;
    private int expireYear;

    public Card(String number, String type, int expiryMonth, int expireYear) {

        super();
        this.number = number;
        this.type = type;
        this.expiryMonth = expiryMonth;
        this.expireYear = expireYear;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getExpiryMonth() {
        return expiryMonth;
    }

    public void setExpiryMonth(int expiryMonth) {
        this.expiryMonth = expiryMonth;
    }

    public int getExpireYear() {
        return expireYear;
    }

    public void setExpireYear(int expireYear) {
        this.expireYear = expireYear;
    }
}
