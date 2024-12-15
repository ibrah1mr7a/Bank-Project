package com.example.thirdtry.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table
public class CardFields  {
    @Id
    private String cardid;
    private String cardname;
    private String cardnumber;
    private String cardcreatingdate;
    private String cardenddate;
    private Double balance;
    private int cvv;
    private int cardpassword;

    public String getCardid() {
        return cardid;
    }

    public void setCardid(String cardid) {
        this.cardid = cardid;
    }

    public String getCardname() {
        return cardname;
    }

    public void setCardname(String cardname) {
        this.cardname = cardname;
    }

    public String getCardnumber() {
        return cardnumber;
    }

    public void setCardnumber(String cardnumber) {
        this.cardnumber = cardnumber;
    }

    public String getCardcreatingdate() {
        return cardcreatingdate;
    }

    public void setCardcreatingdate(String cardcreatingdate) {
        this.cardcreatingdate = cardcreatingdate;
    }

    public String getCardenddate() {
        return cardenddate;
    }

    public void setCardenddate(String cardenddate) {
        this.cardenddate = cardenddate;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public int getCardpassword() {
        return cardpassword;
    }

    public void setCardpassword(int cardpassword) {
        this.cardpassword = cardpassword;
    }
}
